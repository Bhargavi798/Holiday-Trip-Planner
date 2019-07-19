package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Packinfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Packinfo window = new Packinfo();
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
	public Packinfo() {
		initialize();
	}  

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PACKAGES AVAILABLE..");
		frame.setForeground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPackagesAvailable = new JLabel("PACKAGES AVAILABLE");
		lblPackagesAvailable.setToolTipText("");
		lblPackagesAvailable.setBackground(Color.RED);
		lblPackagesAvailable.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 38));
		//lblPackagesAvailable.setFont(Color.RED);
		lblPackagesAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		lblPackagesAvailable.setBounds(198, 50, 434, 93);
		frame.getContentPane().add(lblPackagesAvailable);
		
		
		
		JButton btnNewButton = new JButton("Package 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.setVisible(false);
				Package1 p1=new Package1();
					
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(64, 185, 176, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPackage = new JButton("Package 2");
		btnPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Package2 p2=new Package2();
			}
		});
		btnPackage.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnPackage.setBounds(64, 314, 176, 57);
		frame.getContentPane().add(btnPackage);
		
		JButton btnPackage_1 = new JButton("Package 3");
		btnPackage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Package3 p3=new Package3();
				
				
			}
		});
		btnPackage_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnPackage_1.setBounds(64, 451, 176, 57);
		frame.getContentPane().add(btnPackage_1);
		
		JButton btnPackage_2 = new JButton("Package 4");
		btnPackage_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Package4 p4=new Package4();
				
				
			}
		});
		btnPackage_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnPackage_2.setBounds(64, 569, 176, 57);
		frame.getContentPane().add(btnPackage_2);
		
		
	}
}
