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

public class Package4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package4 window = new Package4();
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
	public Package4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("P4");
		frame.setBounds(100, 100, 650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTourismPackage = new JLabel("CUSTOM TOURISM PACKAGE ");
		lblTourismPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblTourismPackage.setForeground(Color.GREEN);
		lblTourismPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblTourismPackage.setBounds(25, 44, 579, 80);
		frame.getContentPane().add(lblTourismPackage);
		
		JLabel lblDescriptionCustomPackage = new JLabel("DESCRIPTION:  CUSTOM PACKAGE");
		lblDescriptionCustomPackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescriptionCustomPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescriptionCustomPackage.setBounds(35, 141, 530, 158);
		frame.getContentPane().add(lblDescriptionCustomPackage);
		
		JLabel lblCostToBe = new JLabel("COST : Rs.50000 PAX");
		lblCostToBe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostToBe.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblCostToBe.setBounds(139, 361, 326, 44);
		frame.getContentPane().add(lblCostToBe);
		
		JButton button = new JButton("CONFIRM");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Paymentdet pd=new Paymentdet();
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button.setBounds(419, 473, 180, 58);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Packinfo p=new Packinfo();
				
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		button_1.setBounds(12, 521, 118, 37);
		frame.getContentPane().add(button_1);
	}

}
