package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package3 window = new Package3();
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
	public Package3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("P3");
		frame.setBounds(100, 100, 650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("CONFIRM");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Paymentdet pd=new Paymentdet();
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button.setBounds(425, 473, 180, 58);
		frame.getContentPane().add(button);
		
		JLabel lblPilgrimageTourismPackage = new JLabel("PREMIUM TOURISM PACKAGE ");
		lblPilgrimageTourismPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilgrimageTourismPackage.setForeground(Color.BLUE);
		lblPilgrimageTourismPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblPilgrimageTourismPackage.setBounds(26, 45, 579, 80);
		frame.getContentPane().add(lblPilgrimageTourismPackage);
		
		JLabel lblDescriptionTourPackage = new JLabel("DESCRIPTION:  TOUR PACKAGE FOR 7DAYS/8NIGHTS");
		lblDescriptionTourPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescriptionTourPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescriptionTourPackage.setBounds(55, 138, 530, 158);
		frame.getContentPane().add(lblDescriptionTourPackage);
		
		JLabel lblCostToBe = new JLabel("COST : Rs.35000 PAX");
		lblCostToBe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostToBe.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblCostToBe.setBounds(148, 337, 326, 44);
		frame.getContentPane().add(lblCostToBe);
		
		JButton button_1 = new JButton("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Packinfo p=new Packinfo();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_1.setBounds(12, 512, 118, 37);
		frame.getContentPane().add(button_1);
	}

}
