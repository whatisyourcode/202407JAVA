package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewDept extends JFrame {
	
	JTextField tf = new JTextField(20);
	JButton bt = new JButton("조회");
	JTextArea ta = new JTextArea(10,40); 
	Connection conn = null;
	Statement stmt = null;
	JFrame jf = null;
	String title = "select 문장을 넣으세요"; 
	
	ViewDept() {
		jf = this;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			stmt = conn.createStatement();

		}catch (ClassNotFoundException | SQLException e2) {
			e2.printStackTrace();
		}	
		
		Container con = this.getContentPane(); // 초기 레이아웃 생성.
		con.setLayout(new BorderLayout());
		// 첫번째 FlowLayout JPanel 생성.
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(tf); jp1.add(bt);		
		con.add(jp1,BorderLayout.NORTH);
		// 두번째 FlowLayout JPanel 생성.
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(ta);
		con.add(jp2,BorderLayout.CENTER);

		
		this.setTitle(title);
		this.setBounds(1200, 200, 500, 260);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();	
//				String sql = "select deptno, dname, loc from dept";
//				String sql = String.format("select * from dept where loc like '%%%s%%'", input);
				
		
				try {
				      ResultSet rs = stmt.executeQuery(input);

			            ResultSetMetaData rsmd = rs.getMetaData();
			            int columnsNumber = rsmd.getColumnCount();
			            ta.setText("");
			            while (rs.next()) {
			                for (int i = 1; i <= columnsNumber; i++) {
			                    if (i > 1) ta.append(", ");
			                    String columnValue = rs.getString(i);
			                    ta.append(rsmd.getColumnName(i) + ": " + columnValue);
			                }
			                ta.append("\n");
			            }

					
				}catch (SQLException e2) {
					JOptionPane.showMessageDialog(jf, "해당 자료가 없습니다.","정보",JOptionPane.INFORMATION_MESSAGE);
				}	
				
			}
		});
	}
	
	public static void main(String[] args) {
		new ViewDept(); 
	}


}
