package minip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Paymentdet {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paymentdet window = new Paymentdet();
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
	public Paymentdet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BOOKING DETAILS");
		frame.setBounds(100, 100, 650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNoOfPassengers = new JLabel("No of travellers");
		lblNoOfPassengers.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNoOfPassengers.setBounds(31, 154, 127, 35);
		frame.getContentPane().add(lblNoOfPassengers);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(223, 155, 238, 35);
		frame.getContentPane().add(comboBox);
		
		JLabel lblDateOfJourney = new JLabel("Date of journey");
		lblDateOfJourney.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateOfJourney.setBounds(31, 239, 127, 29);
		frame.getContentPane().add(lblDateOfJourney);
		
		textField = new JTextField();
		textField.setBounds(223, 233, 329, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(337, 324, 283, 40);
		frame.getContentPane().add(l1);
		
		JButton btnTotalCost = new JButton("CALCULATE TOTAL COST");
		btnTotalCost.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnTotalCost.setBounds(31, 324, 224, 40);
		frame.getContentPane().add(btnTotalCost);
		
		JLabel lblNewLabel = new JLabel("BOOKING CONFIRMATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(85, 35, 441, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PROCEED TO PAYMENT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(191, 453, 321, 96);
		frame.getContentPane().add(btnNewButton);
	}
}
