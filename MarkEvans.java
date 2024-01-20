package inazuma;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarkEvans {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void MarkEvanss() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkEvans window = new MarkEvans();
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
	public MarkEvans() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Mark Evans");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Mark Evans");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(231, 10, 107, 23);
		frame.getContentPane().add(label);

		String me = "<html><p align=justify>Mark Evans is the goalkeeper, defender, and captain of the Raimon Eleven and Inazuma Japan. He is also the grandson of David Evans, who was the coach of the legendary Inazuma Eleven. Mark is described as a soccer loving, cheerful goalkeeper.</p><br><p align=justify>He's the kind of person who never gives up and always thinks of others in front of you. Because a positive personality, one who attracts people from Even if the enemy.</p></html>";
		JLabel lblNewLabel = new JLabel(me);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 17, 203, 420);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Mark Evans.png"));
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
		btnNewButton.setBounds(263, 570, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AxelBlaze ab = new AxelBlaze();
				ab.AxelBlazee();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
