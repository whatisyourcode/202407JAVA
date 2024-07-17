package swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class MyFrame {
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}

class MouseListenerEx extends JFrame { 
	JPanel jp = new JPanel(); // FlowLayout 기본 
	JLabel la = new JLabel("No Mouse Event");
	
	MouseListenerEx() {
		this.setContentPane(jp); // 기본 content판에다가 panel 판을 더함.
		jp.add(la);				// panel 위에 label 을 더함.
		this.setSize(700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램이 종료 되는 설정
		
		jp.addMouseListener(new MyMouseListener());
		jp.addMouseMotionListener(new MyMouseListener());
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("click(" + e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("press(" + e.getX() + "," + e.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("release(" + e.getX() + "," + e.getY()+")");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jp.setBackground(Color.CYAN);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			jp.setBackground(Color.BLACK);
			
		}
		// MouseMotionListener  
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Drag(" + e.getX() + "," + e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Move(" + e.getX() + "," + e.getY()+")");
			
		}
		
	}
}

