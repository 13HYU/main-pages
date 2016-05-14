package ledger;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class Input {
	static Calendar today = Calendar.getInstance();
	static JLabel todayLab;
	
	public static void main(String[] args) {
		JFrame f= new JFrame("Input income/expense");
		f.setLayout(new GridLayout(4,1));
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		JPanel p0 = new JPanel();
		todayLab = new JLabel(today.get(Calendar.MONTH)+1+"/"+today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR));
//		todayLab.setBounds(300, 50, 300, 500);		//왜 크기 조정이 안되지???

		p0.setLayout(new GridBagLayout());
		GridBagConstraints calOpGC = new GridBagConstraints();
		calOpGC.gridx = 1;
		calOpGC.gridy = 1;
		calOpGC.gridwidth = 2;
		calOpGC.gridheight = 1;
		calOpGC.weightx = 1;
		calOpGC.weighty = 1;
		calOpGC.insets = new Insets(5,5,0,0);
		calOpGC.anchor = GridBagConstraints.WEST;
		calOpGC.fill = GridBagConstraints.NONE;
		p0.add(todayLab,calOpGC);
		
		JPanel p1 = new JPanel();

		Choice income = new Choice();
		income.add("Salary");
		income.add("Allowance");
		income.add("Balance from last month");
		income.add("Other");
		
		income.setSize(300, 200);
		income.setLocation(500, 300);
		
	//	JButton btn1 = new JButton("add");
	//	btn1.addActionListener(new ActionListener(){
	//	    public void actionPerformed(ActionEvent e){
	//	        System.out.println(income.getSelectedItem()+" 가(이) 선택되었습니다.");
	//	    }
	//	});
	
		JPanel p2 = new JPanel();
		
		Label lsum = new Label("Amount", Label.RIGHT);
		TextField tsum = new TextField(10);

		Choice currency = new Choice();
		currency.add("KRW");
		currency.add("USD");
		currency.add("EUR");
		currency.add("JPY");
		currency.add("CNY");
		currency.add("AUD");
		currency.add("NZD");
		currency.add("GBP");
		currency.add("CAD");
		currency.add("PHP");
		currency.add("HKD");
		currency.add("THB");
		currency.add("SGD");
		currency.add("INR");
		currency.add("BRL");
		currency.add("TWD");
		currency.add("MYR");
		currency.add("CHF");
		currency.add("VND");
		currency.add("RUB");
		currency.add("IDR");
		currency.add("BDT");
		currency.add("SEK");
		currency.add("NOK");
		currency.add("ZAR");
		
		JPanel p3 = new JPanel();
		
		TextArea ta= new TextArea("Details of your income", 7,30,TextArea.SCROLLBARS_NONE);
		ta.setEditable(true);
			//입력한 내용 반환
		JButton btn2 = new JButton("add");
		btn2.setBackground(new Color(50, 100, 200));
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		    	System.out.println("입력된 돈은 "+tsum.getText()+", 단위는 "+ currency.getSelectedItem()+" 가(이) 입력되었습니다.");
		    	System.out.println("카테고리는 "+income.getSelectedItem()+"가(이) 선택되었습니다.");
		        System.out.println("세부사항으로는 "+ta.getText()+" 가(이) 입력되었습니다.");
		    }
		});
		
		f.add(p0);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		p0.add(todayLab);
		p1.add(income);
//		p1.add(btn1);
		p2.add(lsum);
		p2.add(tsum);
		p2.add(currency);
		p3.add( new Label("Memo/Notes", Label.LEFT),"North");
		p3.add(ta);
		p3.add(btn2);
		f.setSize(1600, 800);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
//		p0.setSize(1000, 50);
//		p1.setSize(1000, 100);
//		p2.setSize(1000, 100);
//		p3.setSize(1000, 200);
		f.setVisible(true);
	}
}
