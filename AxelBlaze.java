package inazuma;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AxelBlaze {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void AxelBlazee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AxelBlaze window = new AxelBlaze();
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
	public AxelBlaze() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Axel Blaze");
		frame.setBounds(70, 10, 582, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Axel Blaze");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(237, 10, 95, 23);
		frame.getContentPane().add(label);

		String ab = "<html><p align=justify>Axel Blaze is the ace striker in the Raimon Eleven team. He is known as Flame Striker for his famous killer move, Fire Tornado. He is considered to be the best striker in the world. He is a one man army and completely plays for his team.</p><p align=justify>The main protagonist - Mark Evans sees him as his best friend and admires him. He is the ace striker and voice of the team. His sister Julia is in coma, because of Ray Dark's interference to stop him playing against the Royal Academy. He keeps an amulet given by his sister, and makes a promise with her to stop playing football.</p></html>";
		JLabel lblNewLabel = new JLabel(ab);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 46, 203, 463);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Inazuma11\\Axel Blaze.png"));
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
				MarkEvans me = new MarkEvans();
				me.MarkEvanss();
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
				JudeSharp js = new JudeSharp();
				js.JudeSharpp();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(459, 570, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
