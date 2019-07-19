package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package1 window = new Package1();
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
	public Package1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("P1");
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DESCRIPTION:  TOUR PACKAGE FOR 3DAYS/4NIGHTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(39, 144, 530, 158);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCostToBe = new JLabel("COST : Rs.15000 PAX");
		lblCostToBe.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblCostToBe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostToBe.setBounds(152, 334, 326, 44);
		frame.getContentPane().add(lblCostToBe);
		
		JLabel lblAdventureTourismPackage = new JLabel("DELUXE TOURISM PACKAGE");
		lblAdventureTourismPackage.setForeground(Color.MAGENTA);
		lblAdventureTourismPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdventureTourismPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblAdventureTourismPackage.setBounds(29, 39, 579, 80);
		frame.getContentPane().add(lblAdventureTourismPackage);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Paymentdet pd=new Paymentdet();
				
			}
		});
		btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnConfirm.setBounds(389, 417, 180, 58);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Packinfo p=new Packinfo();
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBack.setBounds(12, 438, 118, 37);
		frame.getContentPane().add(btnBack);
	}

}
