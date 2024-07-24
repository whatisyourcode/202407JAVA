package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	String[] stand = {"stand.gif"};
	String[] walk = {"walk1.gif","walk2.gif"};
	String[] run = {"run1.gif", "run2.gif","run3.gif"};
	
	String[][] move = { stand,walk,run };
	String[] resultMove = stand;

	
	MyFrame() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field field = new Field();
		Control control = new Control();
		this.add(field, BorderLayout.CENTER);
		this.add(control, BorderLayout.SOUTH);
		this.setBounds(1200,100,500,500);
		this.setVisible(true);
		
		Thread thread = new Thread(field);
		thread.start();
		
	}
	
	private class Field extends JPanel implements Runnable {
		JLabel lb1; 
		Field(){
			this.setLayout(new BorderLayout()); 
			lb1 = new JLabel();
			lb1.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(lb1, BorderLayout.CENTER);
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				String[] path = resultMove;
				for(int i=0; i<path.length; i++) {
					lb1.setIcon(new ImageIcon("./src/"+ path[i]));
					//System.out.println(i);
					try {
						Thread.sleep(300);
					} catch(InterruptedException e) {
						
					}
				}
			}
		}
	}
	
	private class Control extends JPanel implements ActionListener {
		private JButton standingBtn, walkingBtn, runningBtn;
		
		public Control() {
			this.setLayout(new FlowLayout());
			
			standingBtn = new JButton("Standing");
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");
			
			standingBtn.addActionListener(this);
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);
			
			this.add(standingBtn);
			this.add(walkingBtn);
			this.add(runningBtn);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == standingBtn) {
				resultMove = move[0];
			}else if(e.getSource()==walkingBtn) {
				resultMove = move[1];
			}else if(e.getSource()==runningBtn) {
				resultMove = move[2];
			}
		}
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
