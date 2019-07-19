package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.DebugGraphics;
import javax.swing.JInternalFrame;



public class Mainpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage window = new Mainpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		//frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		frame.setBounds(100, 100, 950, 550);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Database db;
		db=new Database();
		
		
		JComboBox combo_from = new JComboBox(db.from());
		combo_from.setBackground(Color.GREEN);
		combo_from.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		combo_from.setForeground(Color.BLUE);
		//combo_from.setModel(new DefaultComboBoxModel(new String[] {"", "Bangalore", "Goa", "Shimla", "Kullu"}));
		combo_from.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] a=new String[100];
				String src=(String) combo_from.getSelectedItem();
				//String getText=combo_from.getSelectedItem().toString();
				
			//	System.out.println(src);
				int a1=combo_from.getSelectedIndex();
				db.inserts(a1,src);
				
				
	    	}
		
		});
		//int a=combo_from.getSelectedIndex();
		combo_from.setBounds(55, 211, 180, 43);
		frame.getContentPane().add(combo_from);
		//String s=frame.getContentPane().add(combo_from);
		//System.out.println(src);
		
		JComboBox comboBox_to = new JComboBox(db.to());
		comboBox_to.setBackground(Color.GREEN);
		comboBox_to.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox_to.setForeground(Color.RED);
	    //comboBox_to.setModel(new DefaultComboBoxModel(new String[] {"", "Bangalore", "Goa", "Shimla", "Kullu"}));
		comboBox_to.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] b=new String[100];
				String dst=(String) comboBox_to.getSelectedItem();
				int a2=comboBox_to.getSelectedIndex();
				db.insertd(a2,dst);
				//System.out.println(dst);
				
			}
		});
		
		comboBox_to.setBounds(641, 211, 168, 43);
		frame.getContentPane().add(comboBox_to);
		
		
		
	/*	String s=so1.getSelectedItem();
		String d=do1.getSelectedItem();		
		if(db.checkpvalid(s,d))  */
			
			
		
		
		
		
		
		
		//db.s();
		//System.out.println(db.s());
		
		JButton btnSearchPackages = new JButton("SEARCH PACKAGES");
		btnSearchPackages.setBackground(Color.YELLOW);
		btnSearchPackages.setForeground(Color.MAGENTA);
		btnSearchPackages.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnSearchPackages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(db.s());
				//System.out.println(db.d());
				String sv=db.s();
				String dv=db.d();
				if (sv.equals(dv))
				{
					//System.out.println("Invalid");
					
					JOptionPane.showMessageDialog(null, "INVALID SELECTION....",
			             "FAILED" ,JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "SELECTED",
				             "SUCCESS" ,JOptionPane.INFORMATION_MESSAGE);	
					frame.setVisible(false);
					Packinfo p=new Packinfo();
				}
				
			}
		});
		btnSearchPackages.setBounds(301, 422, 296, 68);
		frame.getContentPane().add(btnSearchPackages);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setForeground(new Color(255, 0, 0));
		lblFrom.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblFrom.setBounds(62, 159, 106, 43);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(Color.RED);
		lblTo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTo.setBounds(641, 181, 56, 22);
		frame.getContentPane().add(lblTo);
		
		JLabel lblWelcomeToYour = new JLabel("WELCOME TO YOUR DREAM DESTINATION....!!!!");
		lblWelcomeToYour.setBackground(new Color(51, 255, 0));
		lblWelcomeToYour.setForeground(new Color(0, 0, 175));
		lblWelcomeToYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToYour.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 38));
		lblWelcomeToYour.setBounds(24, 9, 881, 126);
		frame.getContentPane().add(lblWelcomeToYour);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Bhargavi\\Desktop\\andm1.jpg"));
		lblNewLabel.setBounds(0, 0, 422, 503);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Bhargavi\\Desktop\\mainp1.jpg"));
		lblNewLabel_1.setBounds(539, 9, 393, 494);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	
		
		
		
		
	}
}
