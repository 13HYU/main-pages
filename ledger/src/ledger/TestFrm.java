package ledger;

import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;

public class TestFrm extends JFrame{
       public TestFrm() {
           setTitle("changchangchang");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         Container contentPane = getContentPane();
         contentPane.setBackground(Color.ORANGE);
         contentPane.setLayout(new FlowLayout());
               
         contentPane.add(new JButton("OK"));
         contentPane.add(new JButton("cancel"));
         contentPane.add(new JButton("Ignore"));
         
         contentPane.add(new JTextField(20));
         
         setSize(300,150);
         setVisible(true);
      }

      public static void main(String[] args) {
         new TestFrm();
      }
}
 