package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HurleyKane {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void HurleyKanee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HurleyKane window = new HurleyKane();
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
	public HurleyKane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Hurley Kane");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Hurley Kane");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(228, 10, 113, 23);
		frame.getContentPane().add(label);

		String hk = "<html><p align=justify>Hurley Kane is a defender of Raimon and Inazuma Japan with shirt number 4. He is 17 years old and previously played as a captain in the Mary Times Memorial, in Okinawa. Hurley is a very energetic and positive guy.</p><br><p align=justify>In addition to football, his biggest passion is surfing, which is why he is very attached to the ocean, often missing it. He is very cheerful and helpful to everyone, and has an optimistic and serene character.</p></html>";
		JLabel lblNewLabel = new JLabel(hk);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 30, 203, 420);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Hurley Kane.png"));
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
		btnNewButton.setBounds(20, 570, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NathanSwift ns = new NathanSwift();
				ns.NathanSwiftt();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(263, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AustinHobbes ah = new AustinHobbes();
				ah.AustinHobbess();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
