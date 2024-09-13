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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

public class AddMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String Id = null;
	private JPanel contentPane;
	private JTextField memberno;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private static MemberServiceImpl msi = new MemberServiceImpl();
	private JTextField sum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberUI frame = new AddMemberUI();
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
	public AddMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(23, 36, 390, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員資料");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 21));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(188, 45, 97, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("編號");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1.setBounds(53, 93, 56, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("姓名");
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_1.setBounds(53, 121, 56, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("帳號");
		lblNewLabel_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_2.setBounds(53, 155, 56, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("密碼");
		lblNewLabel_1_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_3.setBounds(53, 189, 56, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("地址");
		lblNewLabel_1_4.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_4.setBounds(53, 223, 56, 24);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("電話");
		lblNewLabel_1_5.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_5.setBounds(53, 257, 56, 24);
		panel.add(lblNewLabel_1_5);
		
		memberno = new JTextField();
		memberno.setBounds(188, 84, 96, 24);
		panel.add(memberno);
		memberno.setColumns(10);
		
		name = new JTextField();
		name.setBounds(188, 124, 96, 21);
		panel.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setBounds(188, 158, 96, 21);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(188, 192, 96, 21);
		panel.add(password);
		password.setColumns(10);
		
		address = new JTextField();
		address.setBounds(188, 226, 96, 21);
		panel.add(address);
		address.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(188, 257, 96, 21);
		panel.add(phone);
		phone.setColumns(10);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String UserName = username.getText();
				
				if (msi.findByUsername(UserName)) {
					AddMemberError a = new AddMemberError();
					a.setVisible(true);
					dispose();
				} else {
					Member m = new Member();
					m.setMemberno(Integer.parseInt(memberno.getText()));
					m.setName(name.getText());
					m.setUsername(username.getText());
					m.setPassword(password.getText());
					m.setPhone(phone.getText());
					m.setAddress(address.getText());
					m.setSum(Integer.parseInt(sum.getText()));
					msi.addMember(m);
					
					AddMemberSuccess a = new AddMemberSuccess();
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(120, 355, 149, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("累積金額");
		lblNewLabel_1_5_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_5_1.setBounds(53, 291, 83, 24);
		panel.add(lblNewLabel_1_5_1);
		
		sum = new JTextField();
		sum.setColumns(10);
		sum.setBounds(188, 288, 96, 21);
		panel.add(sum);
	}
}