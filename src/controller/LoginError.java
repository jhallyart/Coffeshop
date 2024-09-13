package controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoginError extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginError frame = new LoginError();
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
	public LoginError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入失敗");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 30));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(174, 87, 131, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("請先註冊");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMemberUI a = new AddMemberUI();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(154, 154, 162, 52);
		contentPane.add(btnNewButton);
	}
}