package project2Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MyFrame extends JFrame {
	JLabel lb1 = new JLabel("아이디"); 
	JTextField jt1 = new JTextField(); 
	JLabel lb2 = new JLabel("SSN"); 
	JTextField jt2 = new JTextField(); 
	JLabel lb3 = new JLabel("전화번호"); 
	JTextField jt3 = new JTextField(); 	
	JButton jb1 = new JButton("로그인");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	JTextArea ta = new JTextArea();
	List<Member> list = null;
	Member member = null; // 로그인 된 현재 사용자
	
	public MyFrame() {

		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2));
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}
		System.out.println("총회원수:"+list.size());
	
		
		
		Container con = this.getContentPane();
		con.setLayout(null);
		// 아이디
		lb1.setLocation(20,50);
		lb1.setSize(100,30);
		con.add(lb1);
		// 아이디 텍스트 필드
		jt1.setLocation(70,50);
		jt1.setSize(100,30);
		con.add(jt1);
		// SSN 
		lb2.setLocation(190,50);
		lb2.setSize(100,30);
		con.add(lb2);
		// SSN 텍스트 필드
		jt2.setLocation(230,50);
		jt2.setSize(100,30);
		con.add(jt2);
		
		// 전화번호 
		lb3.setLocation(350,50);
		lb3.setSize(100,30);
		con.add(lb3);
		
		// 전화번호 텍스트 필드
		jt3.setLocation(420,50);
		jt3.setSize(100,30);
		con.add(jt3);
		
		// 텍스트 Area
		ta.setLocation(20,120);
		ta.setSize(500,200);
		con.add(ta);
		
		// 로그인 버튼
		con.add(jb1);
		jb1.setLocation(20,350);
		jb1.setSize(100,30);
		jb1.addActionListener(new MyListener()); // 로그인 버튼 클릭시 로그인을 수행해야함.ㅣ
		
		
		
		// 회원가입 버튼
		con.add(jb2);
		jb2.setLocation(120,350);
		jb2.setSize(100,30);
		// 예금 버튼 
		con.add(jb3);
		jb3.setLocation(220,350);
		jb3.setSize(100,30);
		// 출금 버튼
		con.add(jb4);
		jb4.setLocation(320,350);
		jb4.setSize(100,30);
		// 잔고 버튼
		con.add(jb5);
		jb5.setLocation(420,350);
		jb5.setSize(100,30);

	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창을 닫을 때 JFrame 종료.
		this.setTitle("안녕 스윙"); // title
		this.setLocation(700, 300); // 가로 , 세로
		this.setSize(555,500); // 창 사이즈 설정 메서드
		this.setVisible(true); // 창 보이게 하는 메서드
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 로그인 처리
			String name = jt1.getText(); // name 변수의 값 입력
			String strPassword = jt2.getText(); //패스워드입력
			
			for(Member member2 : list) {
				if(member2.getName().contains(name) && member2.getSsn().contains(strPassword)) {
					member = member2;
					System.out.println("로그인 성공!");
					break;
				}
			}
			System.out.println(member);	
		}
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
