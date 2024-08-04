package project4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Project4 extends JFrame {
	
	JTextField tf = new JTextField(5);
	JButton bt = new JButton();
	JTextArea ta = new JTextArea();
	
	public Project4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SELECT SQL");
		this.setLocation(700,300);
		this.setSize(555,500);
		this.setVisible(true);
		
		Container con = this.getContentPane();
		con.setLayout(null);
		
		tf.setLocation(50,50);
		tf.setSize(450,35);
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
			
		}	 
	}
	
	

	public static void main(String[] args) {
		new Project4();
	}

}
