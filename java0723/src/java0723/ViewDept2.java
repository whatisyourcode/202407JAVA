package java0723;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewDept2 extends JFrame {
	
	JTextField tf = new JTextField(20);
	JButton bt = new JButton("조회");
	JTextArea ta = new JTextArea(10,40); 
	Connection conn = null;
	Statement stmt = null;
	JFrame jf = null;
	String title = "";
	
	ViewDept2() {
//		JPanel jp1 = new JPanel();
//		JLabel jl1 = new JLabel();
//		jp1.add(jl1);
		WinTime wt = new WinTime(); 
		
		Thread th = new Thread(wt);
		th.start();
	
		
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
		
		con.add(wt, BorderLayout.SOUTH);
		
		this.setTitle(title);
		this.setBounds(1200, 200, 500, 260);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				String sql = "select deptno, dname, loc from dept";
				String input = tf.getText();			
				String sql = String.format("select * from dept where loc like '%%%s%%'", input);
				
				
				boolean flag = true;
				try {
					ResultSet rs = stmt.executeQuery(sql); 
					ta.setText(""); // wow..
		
					while(rs.next()) {
						flag = false;
						int deptno = rs.getInt("deptno");
						String dname = rs.getString("dname");
						String loc = rs.getString("loc");
						ta.append(String.format("%d %s %s\n", deptno, dname, loc));
					}
					
					if(flag) { 
						JOptionPane.showMessageDialog(jf, "해당자료가 없습니다.","정보",JOptionPane.ERROR_MESSAGE);
					}
					
				}catch (SQLException e2) {
					e2.printStackTrace();
				}	
				
			}
		});
	}
	
	public static void main(String[] args) {
		new ViewDept2(); 
	}
	
//	class MyPanel extends JPanel{
//		JLabel lb1;
//		MyPanel(){
//			lb1 = new JLabel("테스트");
//			this.add(lb1);	
//		}
//	}
//	
	class WinTime extends JPanel implements Runnable {
		JLabel lb1;

		WinTime(){
			lb1 = new JLabel();
			this.add(lb1);
		}

		@Override
		public void run() {
			for(;;) {
				LocalTime localTime = LocalTime.now();
				String str = String.format("%d:%d:%d\n", localTime.getHour(), 
						localTime.getMinute(),localTime.getSecond());
				lb1.setText(str);
//				ViewDept2.this.setTitle(str); // 외부 클래스 참조
				
				try {
				Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	
	}


}
