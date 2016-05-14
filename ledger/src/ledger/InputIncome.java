package ledger;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class InputIncome {
	static Calendar today = Calendar.getInstance();
	static JLabel todayLab;
	
	public static void main(String[] args) {
		JFrame f= new JFrame("Input income/expense");
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//프레임
		
		JPanel p0 = new JPanel();
		todayLab = new JLabel(today.get(Calendar.MONTH)+1+"/"+today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR));
		Font font = new Font("SansSerif",Font.BOLD,40);
		todayLab.setFont(font);
//		todayLab.setBounds(300, 50, 300, 500);		//왜 크기 조정이 안되지???

		
		JPanel p1 = new JPanel();

		Choice income = new Choice();
		income.add("Salary");
		income.add("Allowance");
		income.add("Balance from last month");
		income.add("Other");
		
		income.setSize(300, 200);
		income.setLocation(500, 300);
		
	
		JPanel p2 = new JPanel();
		
		Label lsum = new Label("Amount ", Label.RIGHT);
		Font font2 = new Font("SansSerif",Font.BOLD,15);
		lsum.setFont(font2);

		TextField tsum = new TextField(20);

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
		
		f.setLayout(new BorderLayout());
		f.add(p0,BorderLayout.NORTH	);
		f.add(p1, BorderLayout.WEST);
		f.add(p2, BorderLayout.CENTER);
		f.add(p3, BorderLayout.SOUTH);
		

		
//		p0.setLayout(new GridBagLayout());
		p1.setLayout(new GridBagLayout());
		p2.setLayout(new GridBagLayout());
//		p3.setLayout(new GridBagLayout());
		p3.setLayout(new BorderLayout(10,10));
		
		Label null2 = new Label("  ");
		p3.add(null2,BorderLayout.SOUTH);
		JLabel memo = new JLabel("Memo/Notes", Label.LEFT);
		p3.add(memo, BorderLayout.WEST);
		p3.add(ta, BorderLayout.CENTER);
		p3.add(btn2, BorderLayout.EAST);
		

		
		p0.setLayout(new BorderLayout());
		Label null_ = new Label("  ");
		p0.add(null_, BorderLayout.NORTH);
		p0.add(todayLab, BorderLayout.CENTER);
		todayLab.setHorizontalAlignment(SwingConstants.CENTER);
		todayLab.setVerticalAlignment(SwingConstants.CENTER);

		
		GridBagConstraints calOpGC = new GridBagConstraints();
		calOpGC.gridx = 1;
		calOpGC.gridy = 2;
		calOpGC.gridwidth = 1;
		calOpGC.gridheight = 2;
		calOpGC.weightx = 1;
		calOpGC.weighty = 1;
		calOpGC.insets = new Insets(5,5,0,0);
		calOpGC.anchor = GridBagConstraints.WEST;
		calOpGC.fill = GridBagConstraints.NONE;
	
		p1.add(income, calOpGC);
		
		calOpGC.gridx = 1;
		calOpGC.gridy = 3;
		p2.add(lsum,calOpGC);
		p2.add(tsum,calOpGC);
		
		calOpGC.gridx = 2;
		calOpGC.gridy = 3;
		p2.add(currency,calOpGC);
/*		
		calOpGC.gridx = 1;
		calOpGC.gridy = 4;
		JLabel memo = new JLabel("Memo/Notes", Label.LEFT);
//		p3.add( new Label("Memo/Notes", Label.LEFT),"North");
		p3.add(memo, calOpGC);
		calOpGC.weightx = 1;
		calOpGC.gridx = 2;
		p3.add(ta,calOpGC);
		calOpGC.gridx = 3;
		p3.add(btn2,calOpGC);
*/		
		f.setSize(600, 600);
//		f.setLocationRelativeTo(null);
//		f.setResizable(false);
//		p0.setSize(1000, 50);
//		p1.setSize(1000, 100);
//		p2.setSize(1000, 100);
//		p3.setSize(1000, 200);
		f.setVisible(true);
	}
}
