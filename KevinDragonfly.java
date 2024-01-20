package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KevinDragonfly {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void KevinDragonflyy() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KevinDragonfly window = new KevinDragonfly();
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
	public KevinDragonfly() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Kevin Dragonfly");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Kevin Dragonfly");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(211, 10, 147, 23);
		frame.getContentPane().add(label);

		String kd = "<html><p align=justify>Kevin Dragonfly is the second striker of Raimon Soccer Club. He is one the earliest member to join the club. He is a bit aggressive but is actually a nice guy. He never wants to lose to Axel or Shawn and didn't give up the ace striker seat.</p><br><p align=justify>But he is really a odd friend of both Axel and Shawn. He can easily get angry like when one of Zeus Jr High players mocks his teammates or when Axel left the team and was replaced by Shawn Frost.</p></html>";
		JLabel lblNewLabel = new JLabel(kd);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 40, 203, 380);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Kevin Dragonfly.png"));
		lblNewLabel_1.setBounds(263, 50, 285, 474);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				XavierFoster xf = new XavierFoster();
				xf.XavierFosterr();
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
				NathanSwift ns = new NathanSwift();
				ns.NathanSwiftt();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
