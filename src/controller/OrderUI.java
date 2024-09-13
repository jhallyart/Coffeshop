package controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Order;

public class OrderUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField latte;
	private JTextField cappuccino;
	private JTextField blackcoffee;
	private JTextField paymentField; // 付款金額輸入框
	private JTextArea output;
	private JTextArea newspace; // 顯示找零結果的區塊
	private int finalPrice; // 保存消費總金額

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUI frame = new OrderUI();
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
	public OrderUI() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(60, 179, 113));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700); // 調整邊框大小，適應新增的區塊
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(53, 10, 696, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("巨匠行動咖啡店");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 22));  // Changed to 微軟正黑體
		lblNewLabel.setBounds(235, 10, 206, 29);
		panel.add(lblNewLabel);
		
		JPanel 一般顧客 = new JPanel();
		一般顧客.setForeground(new Color(0, 0, 0));
		一般顧客.setBackground(new Color(95, 158, 160));
		一般顧客.setBounds(53, 69, 696, 532);
		contentPane.add(一般顧客);
		一般顧客.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));  // Changed to 微軟正黑體
		lblNewLabel_1.setBounds(25, 10, 140, 30);
		一般顧客.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("拿鐵   140元");
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_1.setBounds(25, 60, 140, 30);
		一般顧客.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" 黑咖啡  70元");
		lblNewLabel_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_2.setBounds(25, 110, 140, 30);
		一般顧客.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("卡布奇諾  120元");
		lblNewLabel_1_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));  // Changed to 微軟正黑體
		lblNewLabel_1_2_1.setBounds(25, 160, 140, 30);
		一般顧客.add(lblNewLabel_1_2_1);
		
		name = new JTextField();
		name.setBounds(240, 10, 140, 30);
		一般顧客.add(name);
		name.setColumns(10);
		
		latte = new JTextField();
		latte.setBounds(240, 60, 140, 30);
		一般顧客.add(latte);
		latte.setColumns(10);
		
		blackcoffee = new JTextField();
		blackcoffee.setColumns(10);
		blackcoffee.setBounds(240, 110, 140, 30);
		一般顧客.add(blackcoffee);
		
		cappuccino = new JTextField();
		cappuccino.setColumns(10);
		cappuccino.setBounds(240, 160, 140, 30);
		一般顧客.add(cappuccino);
		
		JRadioButton noCard = new JRadioButton("無卡（原價）");
		noCard.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		noCard.setBounds(460, 10, 200, 30);
		一般顧客.add(noCard);
		
		JRadioButton sweetCard = new JRadioButton("甜心卡（9折）");
		sweetCard.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		sweetCard.setBounds(460, 60, 200, 30);
		一般顧客.add(sweetCard);
		
		JRadioButton diamondCard = new JRadioButton("金鑽卡（8折）");
		diamondCard.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		diamondCard.setBounds(460, 115, 200, 30);
		一般顧客.add(diamondCard);
		
		ButtonGroup group = new ButtonGroup();
		group.add(noCard);
		group.add(sweetCard);
		group.add(diamondCard);
		
		noCard.setSelected(true);
		
		output = new JTextArea();
		output.setBounds(25, 280, 220, 220);
		一般顧客.add(output);
		
		newspace = new JTextArea(); 
		newspace.setBounds(450, 280, 220, 200);
		一般顧客.add(newspace);
		
		JButton OKbutton = new JButton("OK");
		OKbutton.setBounds(25, 210, 140, 30);
		OKbutton.setFont(new Font("微軟正黑體", Font.PLAIN, 24));  // Changed to 微軟正黑體
		一般顧客.add(OKbutton);
		OKbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = name.getText();
				String Latte = latte.getText().trim();
				String Blackcoffee = blackcoffee.getText().trim();
				String Cappuccino = cappuccino.getText().trim();
				
				String[] text = {Latte, Blackcoffee, Cappuccino};
				
				for (int i = 0; i < text.length; i++) {
					if (text[i].isEmpty()) {
						text[i] = "0";
					}
				}
				
				int L = Integer.parseInt(text[0]);
				int B = Integer.parseInt(text[1]);
				int C = Integer.parseInt(text[2]);
				
				double discountRate = 1.0; 
				if (sweetCard.isSelected()) { 
					discountRate = 0.9;
				} else if (diamondCard.isSelected()) { 
					discountRate = 0.8;
				}
				Order o = new Order(Name, L, B, C, discountRate);
				finalPrice = o.getFinalPrice(); 
				output.setText("點飲料系統:\n" +
					"姓名: " + o.getName() + "\n" +
					"拿鐵: " + o.getLatte() + " 杯\n" +
					"黑咖啡: " + o.getBlackcoffee() + " 杯\n" +
					"卡布奇諾: " + o.getCappuccino() + " 杯\n" +
					"金額: " + o.getFinalPrice() + " 元");
			}
		});
		
		JButton btnChange = new JButton("找零");
		btnChange.setBounds(380, 210, 140, 30);
		btnChange.setFont(new Font("微軟正黑體", Font.PLAIN, 24));  // Changed to 微軟正黑體
		一般顧客.add(btnChange);
		
		JButton btnPrint = new JButton("列印");
		btnPrint.setBounds(540, 210, 140, 30);
		btnPrint.setFont(new Font("微軟正黑體", Font.PLAIN, 20));  // Changed to 微軟正黑體
		一般顧客.add(btnPrint);
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					output.print();  // 列印 output 文本框的內容
				} catch (PrinterException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int payment = Integer.parseInt(paymentField.getText());
				int change = payment - finalPrice;
				int num500 = change / 500;
				change %= 500;
				int num100 = change / 100;
				change %= 100;
				int num50 = change / 50;
				change %= 50;
				int num10 = change / 10;
				change %= 10;
				int num5 = change / 5;
				change %= 5;
				int num1 = change;
				
				newspace.setText("--- 找零明細 ---\n");
				newspace.append("實收: " + payment + " 元\n");
				newspace.append("總價: " + finalPrice + " 元\n");
				newspace.append("找零: " + (payment - finalPrice) + " 元\n");
				newspace.append("500元鈔票: " + num500 + " 張\n");
				newspace.append("100元鈔票: " + num100 + " 張\n");
				newspace.append("50元錢幣: " + num50 + " 個\n");
				newspace.append("10元錢幣: " + num10 + " 個\n");
				newspace.append("5元錢幣: " + num5 + " 個\n");
				newspace.append("1元錢幣: " + num1 + " 個\n");
			}
		});
	}
}