package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class MyFrame extends JFrame {
	JLabel la1 = new JLabel("아이디"); 
	JLabel la2 = new JLabel("SSN"); 
	JLabel la3 = new JLabel("전화번호");
	JTextField tf1 = new JTextField(5); 
	JTextField tf2 = new JTextField(5); 
	JTextField tf3 = new JTextField(5);
	JTextArea ta = new JTextArea(30,50); 
	JButton bt1 = new JButton("로그인");
	JButton bt2 = new JButton("회원가입");
	JButton bt3 = new JButton("예금");
	JButton bt4 = new JButton("출금");
	JButton bt5 = new JButton("잔고");
	List<Member> list = null;
	Member member = null; // 로그인 된 현재 사용자
	String StringMemberList = "";
	
	MyFrame(){
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2));
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 목록을 하나의 스트링에 합침.
		for(int i=0; i<list.size(); i++) {
			StringMemberList += list.get(i).toString() + "\n";
		}
		// 목록 표시
		ta.setText(StringMemberList);
		
		
		
		Container con = this.getContentPane(); 
		con.setLayout(new BorderLayout()); // 동서남북
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		// jp1 panel
		con.add(jp1,BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout());
		jp1.add(la1); jp1.add(tf1); jp1.add(la2); jp1.add(tf2); jp1.add(la3); jp1.add(tf3); 
		
		// jp2 panel
		con.add(jp2,BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());
		jp2.add(ta); 

		// jp2 panel
		con.add(jp3,BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout());
		jp3.add(bt1); jp3.add(bt2); jp3.add(bt3); jp3.add(bt4); jp3.add(bt5);
		
	
		
		this.setBounds(1200, 200, 700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new JframeWindowClosingEventHandler());
		
		// 로그인
		bt1.addActionListener(new MyListener());
		// 회원가입
		bt2.addActionListener(new MyListener2());
		// 예금
		
		// 출금
	
		// 자금
	}
	class MyListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 회원가입 처리
			String name = tf1.getText();
			String strPassword = tf2.getText();
			String tel = tf3.getText();
			list.add(new Member(name,strPassword,tel));
			ta.setText("회원가입 성공!");
		}
		
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 로그인 처리
			String name = tf1.getText(); // name 변수의 값 입력
			String strPassword = tf2.getText(); //패스워드입력
			
			for(Member member2 : list) {
				if(member2.getName().contains(name) && member2.getSsn().contains(strPassword)) {
					member = member2;
					ta.setText("로그인 성공!");
					break;
				}
			}
			System.out.println(member);	
		}
	}
	
	class JframeWindowClosingEventHandler extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			// 파일 저장 위치
			Member[] list2 = list.toArray(new Member[list.size()]);
			try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
		             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				 oos.writeObject(list2);
		         System.out.println("객체를 파일에 저장했습니다.");
				
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			JFrame frame = (JFrame)e.getWindow();
			frame.dispose();
			System.out.println("windowClosing()");
		}
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
