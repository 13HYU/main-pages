package ledger;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		JButton button=(JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button"+e.getButton());
		System.out.println("마우스 버튼 누름");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("커서 위 마우스");
	}
	public void mousePressed(MouseEvent e){};
	public void mouseReleased(MouseEvent e){};
	public void mouseExited(MouseEvent e){};
}

class RunningProcess {
	
	public static void main(String[] args) {
		JFrame frm=new JFrame("First Swing");
		frm.setBounds(120,120,400,200);
		frm.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("My Button");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2=new JButton("Your Button");
//		btn2.addMouseListener(listener);
		btn2.addActionListener(new ActionListener(){
	//		Nextpage nextpage;
		
			public void actionPerformed(ActionEvent e) {
				btn2.setText("I don't know");
//				this.nextpage=new Nextpage();
			}
			
		});
		
		JButton btn3=new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}

class Nextpage {
	
	public static void main(String[] args) {
		JFrame frm=new JFrame("First Swing");
		frm.setBounds(120,120,400,200);
		frm.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("A");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2=new JButton("B");
//		btn2.addMouseListener(listener);
		btn2.addActionListener(new ActionListener(){
			MemoCalendar memoCalendar;
		
			public void actionPerformed(ActionEvent e) {
				this.memoCalendar=new MemoCalendar();
			}
			
		});
		
		JButton btn3=new JButton("C");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
		
	}
}