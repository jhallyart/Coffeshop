package controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private static MemberServiceImpl msi = new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(132, 106, 80, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		lblNewLabel_1.setBounds(132, 184, 69, 39);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(250, 100, 250, 45);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(250, 180, 250, 43);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username = username.getText();
				String Password = password.getText();
				
				Member m = msi.Login(Username, Password);
				
				if (m != null) {
					LoginSuccess l = new LoginSuccess();
					l.setVisible(true);
					dispose();
				} else {
					LoginError l = new LoginError();
					l.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(116, 263, 106, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("註冊");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMemberUI a = new AddMemberUI();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(328, 265, 172, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("會員登入系統");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 30));  // Changed to 微軟正黑體
		lblNewLabel_2.setBounds(273, 39, 180, 39);
		contentPane.add(lblNewLabel_2);
	}
}