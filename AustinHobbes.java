package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AustinHobbes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void AustinHobbess() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AustinHobbes window = new AustinHobbes();
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
	public AustinHobbes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Austin Hobbes");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Austin Hobbes");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(218, 10, 133, 23);
		frame.getContentPane().add(label);

		String ah = "<html><p align=justify>Austin Hobbes is one of the supporting characters, that was chosen to join Inazuma Japan. Hobbes can be a shy and quite an innocent boy. Though he may be shy at times, he is very strong and has an unmistakable huge amount of potential in soccer, as he has impressive natural talent at the sport.</p><br><p align=justify>At the same time, he is a very helpful and concerned boy when it comes to helping his mother and even insists on running the restaurant himself when she was feeling ill.</p></html>";
		JLabel lblNewLabel = new JLabel(ah);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 40, 203, 420);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Austin Hobbes.png"));
		lblNewLabel_1.setBounds(263, 50, 285, 474);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inazuma11 window = new Inazuma11();
				window.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(263, 570, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HurleyKane hk = new HurleyKane();
				hk.HurleyKanee();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
