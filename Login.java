package minip;
import javax.swing.*;

import java.awt.Window;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;


public class Login implements ActionListener 
{ JFrame f = new JFrame("Login");
  JLabel l1,l2,l3;
  JPasswordField t2;
  JButton b1,b2;
  Database db;
  Signup S;
  private JTextField t1;
  
  Login()
  {
	    f.getContentPane().setBackground(new Color(255, 255, 255));
	    f.setSize(600,600);
	    f.getContentPane().setLayout(null);
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	  
	    l1=new JLabel("USER LOGIN ");
	    l1.setBackground(Color.BLACK);
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
	    l1.setForeground(new Color(255, 0, 255));
	    l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
	    f.getContentPane().add(l1);
	   
	    l2=new JLabel("Username");
	    l2.setForeground(Color.RED);
	    l2.setFont(new Font("Times New Roman", Font.BOLD, 30));
	    f.getContentPane().add(l2);
	    

	    t1 = new JTextField();
	    t1.setColumns(10);
	    t1.setFont(new Font("Tahoma", Font.PLAIN, 28));
	    t1.setBounds(266, 232, 255, 43);
	    f.getContentPane().add(t1);
	    
	    
	    l3=new JLabel("Password");
	    l3.setForeground(Color.RED);
	    l3.setFont(new Font("Times New Roman", Font.BOLD, 30));
	    f.getContentPane().add(l3);
	  
	    t2=new JPasswordField();
	    t2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
	    f.getContentPane().add(t2);
	    
	    b1 =new JButton("Login");
	    b1.setForeground(Color.BLACK);
	    b1.setBackground(new Color(240, 240, 240));
	    b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
	    f.getContentPane().add(b1);
	    
	    b2 =new JButton("Sign Up");
	    b2.setFont(new Font("Tahoma", Font.PLAIN, 28));
	    f.getContentPane().add(b2);
	    
	    l1.setBounds(61,13,427,74);
	    l2.setBounds(61,244,165,20);
	    l3.setBounds(64,343,135,29);
	    t2.setBounds(266,333,255,39);
	    b1.setBounds(213,419,250,39);
	    b2.setBounds(12,490,135,39);
	   
	    b1.addActionListener(this);
	    b2.addActionListener(this);
  }  
     
  public void actionPerformed(ActionEvent e)
  { db=new Database();
 
 
	  if(e.getSource()==b1)
      { String u=t1.getText();
        String p=t2.getText();
        
        if(db.checkLogin(u,p))
        { b1.setBackground(Color.green);
        	JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                JOptionPane.INFORMATION_MESSAGE);
        
        f.setVisible(false);
      Mainpage m=new Mainpage();
   //  m.setVisible(true);
        }
        else
        { 
        	b1.setBackground(Color.RED);
        	JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                JOptionPane.ERROR_MESSAGE); }
       
       // M.setVisible(true);
        
      } 
	  
	  if(e.getSource()==b2)
	  { f.setVisible(false);
	    S=new Signup();
	  }
	  
	  
  }
 }
