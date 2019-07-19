package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package2 window = new Package2();
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
	public Package2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("P2");
		frame.setBounds(100, 100, 650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWiTourismPackage = new JLabel("EXECUTIVE TOURISM PACKAGE ");
		lblWiTourismPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWiTourismPackage.setForeground(Color.ORANGE);
		lblWiTourismPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblWiTourismPackage.setBounds(24, 62, 579, 80);
		frame.getContentPane().add(lblWiTourismPackage);
		
		JLabel lblDescriptionTourPackage = new JLabel("DESCRIPTION:  TOUR PACKAGE FOR 5DAYS/6NIGHTS");
		lblDescriptionTourPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescriptionTourPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescriptionTourPackage.setBounds(34, 165, 530, 158);
		frame.getContentPane().add(lblDescriptionTourPackage);
		
		JLabel lblCostToBe = new JLabel("COST : Rs.25000 PAX");
		lblCostToBe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostToBe.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblCostToBe.setBounds(127, 364, 326, 44);
		frame.getContentPane().add(lblCostToBe);
		
		JButton button = new JButton("CONFIRM");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Paymentdet pd=new Paymentdet();
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button.setBounds(415, 458, 180, 58);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Packinfo p=new Packinfo();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_1.setBounds(24, 499, 118, 37);
		frame.getContentPane().add(button_1);
	}

}
