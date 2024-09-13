package controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AddMemberError extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberError frame = new AddMemberError();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddMemberError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(24, 40, 435, 311);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號重複");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(178, 111, 92, 41);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("重新註冊");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AddMemberUI a = new AddMemberUI();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(148, 162, 141, 49);
		panel.add(btnNewButton);
	}
}