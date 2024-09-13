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

public class AddMemberSuccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberSuccess frame = new AddMemberSuccess();
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
	public AddMemberSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("註冊成功");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(191, 85, 95, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("重新登入");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LoginUI l = new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(165, 153, 137, 58);
		contentPane.add(btnNewButton);
	}
}