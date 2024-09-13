package controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Member;
import util.Cal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSuccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccess frame = new LoginSuccess();
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
	public LoginSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入成功");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 30));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(254, 117, 129, 50);
		contentPane.add(lblNewLabel);
		
		JLabel show = new JLabel("");
		show.setFont(new Font("微軟正黑體", Font.BOLD, 16));  // Changed to 微軟正黑體
		show.setBounds(165, 34, 135, 25);
		contentPane.add(show);
		
		JTextArea output = new JTextArea();
		output.setBounds(111, 275, 391, 191);
		contentPane.add(output);
		
		JButton btnNewButton = new JButton("確認");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderUI frame = new OrderUI();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(218, 202, 185, 50);
		contentPane.add(btnNewButton);
	}
}