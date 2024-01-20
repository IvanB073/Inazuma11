package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NathanSwift {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void NathanSwiftt() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NathanSwift window = new NathanSwift();
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
	public NathanSwift() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Nathan Swift");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Nathan Swift");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(224, 10, 121, 23);
		frame.getContentPane().add(label);

		String ns = "<html><p align=justify>Nathan Swift is one of the main characters in the Inazuma Eleven game, manga, and anime. He is a defender for Raimon, then, he's a midfielder (second and third season) and later on, Inazuma Japan. He also was a forward and the captain of the Dark Emperors in season 2.</p><br><p align=justify>Nathan is shown to have a competitive character, as he likes to play against strong players. Nathan is also shown to have some confidence issues under high pressure, and is afraid of not being able to keep up with the rest of his teammates.</p></html>";
		JLabel lblNewLabel = new JLabel(ns);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 50, 203, 440);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Nathan Swift.png"));
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
				KevinDragonfly kd = new KevinDragonfly();
				kd.KevinDragonflyy();
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
				HurleyKane hk = new HurleyKane();
				hk.HurleyKanee();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
