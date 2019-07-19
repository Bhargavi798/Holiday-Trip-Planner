package minip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup implements ActionListener
{  JFrame f = new JFrame("Login");
   JLabel l1,l2,l3,l4,l5,l6;
   JTextField t1,t3,t4,t5;
   JPasswordField t2;
   JButton b1;
   Database db;
   Login L;
	
   Signup()
   { f.setSize(500,900);
     f.getContentPane().setLayout(null);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     l1=new JLabel("Sign Up");
     l1.setBackground(new Color(240, 240, 240));
     l1.setHorizontalAlignment(SwingConstants.CENTER);
     l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
     f.getContentPane().add(l1);
     
     l2=new JLabel("Username");
     l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
     f.getContentPane().add(l2);
     t1=new JTextField();
     t1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
     f.getContentPane().add(t1);
     
     l3=new JLabel("Password");
     l3.setFont(new Font("Times New Roman", Font.BOLD, 25));
     f.getContentPane().add(l3);
     t2=new JPasswordField();
     t2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
     f.getContentPane().add(t2);
	 
     l4=new JLabel("Contact \r\nNo.");
     l4.setFont(new Font("Times New Roman", Font.BOLD, 25));
     f.getContentPane().add(l4);
     t3=new JTextField();
     t3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
     f.getContentPane().add(t3);
     
     l5=new JLabel("Email Id");
     l5.setFont(new Font("Times New Roman", Font.BOLD, 25));
     f.getContentPane().add(l5);
     t4=new JTextField();
     t4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
     f.getContentPane().add(t4);
     
     l6=new JLabel("Address");
     l6.setFont(new Font("Times New Roman", Font.BOLD, 25));
     f.getContentPane().add(l6);
     t5=new JTextField();
     t5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
     f.getContentPane().add(t5);
     
     b1 =new JButton("Submit");
     b1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
	 f.getContentPane().add(b1);
     
     l1.setBounds(80,50,327,64);
	 l2.setBounds(26,158,147,35);
	 l3.setBounds(26,267,124,20);
	 l4.setBounds(23,361,168,35);
	 l5.setBounds(26,474,124,29);
	 l6.setBounds(26,580,100,20);
	 t1.setBounds(212,158,237,35);
	 t2.setBounds(212,267,237,35);
	 t3.setBounds(212,365,237,35);
	 t4.setBounds(212,468,237,35);
	 t5.setBounds(212,564,237,92);
	 b1.setBounds(183,715,154,51);
	 
	 b1.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   { db=new Database();
   
       String u=t1.getText();
       String p=t2.getText();
       int c=Integer.parseInt(t3.getText());
       String ei=t4.getText();
       String a=t5.getText();
       
       f.setVisible(false);
       db.insert(u,p,c,ei,a);
       L=new Login();   
       
   } 
}
