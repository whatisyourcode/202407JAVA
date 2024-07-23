package project3;

import java.awt.Container;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingSql extends JFrame {

	JTextField tf = new JTextField(5); 
	JButton bt = new JButton("SELECT SQL");
	JTextArea ta = new JTextArea(30,50);	
	
	public SwingSql() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창을 닫을 때 JFrame 종료.
		this.setTitle("SELECT TABLE"); // title
		this.setLocation(700, 300); // 가로 , 세로
		this.setSize(555,500); // 창 사이즈 설정 메서드
		this.setVisible(true); // 창 보이게 하는 메서드
		
		Container con = this.getContentPane();
		con.setLayout(null);
		
		tf.setLocation(250,50);
		tf.setSize(50,35);
		con.add(tf);
		
		bt.setLocation(125,105);
		bt.setSize(300,100);
		bt.addActionListener(new MyListener());
		con.add(bt);
		
		
		ta.setLocation(20,225);
		ta.setSize(500,200);
		con.add(ta);
		
	}

	
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String URL = "jdbc:mysql://127.0.0.1:3306/spring5fs";
			Connection con = null;
			Statement stmt = null;
			String list = "";
			System.out.println(tf.getText());
			String str = tf.getText();
			
			if(str.equals("dept")) {
				String SQL = "select * from "+ str;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					// con은 Mysql 접속 정보를 담는다 	 (URL,MYSQL_USER,MYSQL_PASSWORD)
					con = DriverManager.getConnection(URL,"spring5","spring5");
					System.out.println("MySQL 접속 성공!");
					stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); // 자바 프로그램 -> DBMS으로 전달될 명령문 생성.
					ResultSet rs = stmt.executeQuery(SQL);
					
					while(rs.next()) {
						list += rs.getString("DEPTNO")+" ";
						list += rs.getString("DNAME")+" ";
						list += rs.getString("LOC")+"\n";

					}
					ta.setText(list);
					
				} catch (ClassNotFoundException | SQLException e2) {
					e2.printStackTrace();
				}
			}else if(str.equals("emp")) {
				
				try {
					String SQL = "select * from "+ str;
					Class.forName("com.mysql.cj.jdbc.Driver");
					// con은 Mysql 접속 정보를 담는다 	 (URL,MYSQL_USER,MYSQL_PASSWORD)
					con = DriverManager.getConnection(URL,"spring5","spring5");
					System.out.println("MySQL 접속 성공!");
					stmt = con.createStatement(); // 자바 프로그램 -> DBMS으로 전달될 명령문 생성.
					ResultSet rs = stmt.executeQuery(SQL);
					
					while(rs.next()) {
						list += rs.getString("EMPNO")+" ";
						list += rs.getString("ENAME")+" ";
						list += rs.getString("JOB")+" ";
						list += rs.getString("MGR")+" ";
						list += rs.getString("HIREDATE")+" ";
						list += rs.getString("SAL")+" ";
						list += rs.getString("COMM")+" ";
						list += rs.getString("DEPTNO")+"\n";
					}
					ta.setText(list);
					
					
				} catch (ClassNotFoundException | SQLException e2) {
					e2.printStackTrace();
				}
			}else {
				ta.setText("잘못 입력했습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new SwingSql();
	}
	
}
