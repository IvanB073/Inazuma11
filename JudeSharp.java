package inazuma;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JudeSharp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void JudeSharpp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JudeSharp window = new JudeSharp();
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
	public JudeSharp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Jude Sharp");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Jude Sharp");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(232, 10, 105, 23);
		frame.getContentPane().add(label);

		String js = "<html><p align=justify>Jude Sharp is the former captain of the Royal Academy Soccer team and one of the forwards of the Royal Academy, though it is often termed 'midfielder'. He is mostly the strategist of the team. He has been nicknamed by many \"the Expert Play-maker\".</p><br><p align=justify>Jude seems very logical and rational, as he is a genius game strategist, Japan's command tower, knowing every single important thing there is to know about his potential opponents.</html>";
		JLabel lblNewLabel = new JLabel(js);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 40, 203, 400);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Jude Sharp.png"));
		lblNewLabel_1.setBounds(263, 50, 285, 474);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inazuma11 window = new Inazuma11();
				window.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBack.setFocusPainted(false);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(20, 570, 89, 23);
		frame.getContentPane().add(btnBack);

		JButton btnNewButton = new JButton("Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AxelBlaze ab = new AxelBlaze();
				ab.AxelBlazee();
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
				ByronLove bl = new ByronLove();
				bl.ByronLovee();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
