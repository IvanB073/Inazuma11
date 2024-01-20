package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShawnFroste {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void ShawnFrostee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShawnFroste window = new ShawnFroste();
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
	public ShawnFroste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Shawn Froste");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Shawn Froste");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(222, 10, 125, 23);
		frame.getContentPane().add(label);

		String sf = "<html><p align=justify>Shawn Froste is able to switch between defense and offense due to having his decesased twin brother Aiden's soul along with his own in his body, giving him a split personality. Later on though, they merged creating the new \"Shaun\".</p><br><p align=justify>He is a very skilled and enjoys having fun while training. He is a very timid person and used to be a defender. He can be either a defender or a striker, and is good at both. However, he actually harbors his deceased twin brother's soul and his own.</p></html>";
		JLabel lblNewLabel = new JLabel(sf);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 8, 203, 484);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Shawn Froste.png"));
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
				ByronLove bl = new ByronLove();
				bl.ByronLovee();
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
				XavierFoster xf = new XavierFoster();
				xf.XavierFosterr();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
