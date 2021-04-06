package com.demo.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignGUI frame = new SignGUI();
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
	public SignGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Button: HOME*/
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(110, 35, 90, 20);
		//set transparent
		btnNewButton.setContentAreaFilled(false);//设置按钮透明
		btnNewButton.setBorder(null);//取消边框
		//jump to another page
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	HomeGUI frame = new HomeGUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton);
		
		/*Button: VIDEO*/
		JButton btnNewButton2 = new JButton("VIDEO");
		btnNewButton2.setForeground(Color.WHITE);
		btnNewButton2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton2.setBounds(210, 35, 90, 20);
		//set transparent
		btnNewButton2.setContentAreaFilled(false);//设置按钮透明
		btnNewButton2.setBorder(null);//取消边框
		//jump to another page
		btnNewButton2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	VidGUI_1 frame = new VidGUI_1();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton2);
		
		/*Button: SALES*/
		JButton btnNewButton3 = new JButton("SALES");
		btnNewButton3.setForeground(Color.WHITE);
		btnNewButton3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton3.setBounds(305, 35, 90, 20);
		//set transparent
		btnNewButton3.setContentAreaFilled(false);//设置按钮透明
		btnNewButton3.setBorder(null);//取消边框
		//jump to another page
		btnNewButton3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	SaleGUI_1 frame = new SaleGUI_1();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton3);
		
		/*Button: BOOK*/
		JButton btnNewButton4 = new JButton("BOOK");
		btnNewButton4.setForeground(Color.WHITE);
		btnNewButton4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton4.setBounds(405, 35, 90, 20);
		//set transparent
		btnNewButton4.setContentAreaFilled(false);//设置按钮透明
		btnNewButton4.setBorder(null);//取消边框
		//jump to another page
		btnNewButton4.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	BookGUI_1 frame = new BookGUI_1();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton4);
		
		/*Button: INFORMATION*/
		JButton btnNewButton5 = new JButton("INFORMATION");
		btnNewButton5.setForeground(Color.WHITE);
		btnNewButton5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton5.setBounds(500, 35, 145, 20);
		//set transparent
		btnNewButton5.setContentAreaFilled(false);//设置按钮透明
		btnNewButton5.setBorder(null);//取消边框
		//jump to another page
		btnNewButton5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	InfoUI frame = new InfoUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton5);
		
		/*Button: SIGN IN*/
		JButton btnNewButton6 = new JButton("SIGN IN");
		btnNewButton6.setForeground(Color.WHITE);
		btnNewButton6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton6.setBounds(655, 35, 90, 20);
		//set transparent
		btnNewButton6.setContentAreaFilled(false);//设置按钮透明
		btnNewButton6.setBorder(null);//取消边框
		//jump to another page
		btnNewButton6.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		        SignGUI frame = new SignGUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton6);
		
		/*Label: Account*/
		JLabel lblNewLabel_1 = new JLabel("Account");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(280, 175, 110, 30);
		contentPane.add(lblNewLabel_1);
		/*TextField: Account*/
		textField = new JTextField();
		textField.setBounds(405, 180, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/*Label: Password*/
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(280, 240, 110, 30);
		contentPane.add(lblNewLabel_2);
		/*TextField: Password*/
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(405, 245, 160, 20);
		contentPane.add(textField_1);
		
		/*Button: LOG IN*/
		JButton btnNewButton7 = new JButton("LOG IN");
		btnNewButton7.setForeground(Color.WHITE);
		btnNewButton7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton7.setBounds(300, 320, 90, 20);
		//set transparent
		btnNewButton7.setContentAreaFilled(false);//设置按钮透明
		btnNewButton7.setBorder(null);//取消边框
		contentPane.add(btnNewButton7);
		
		/*Button: REGISTER*/
		JButton btnNewButton8 = new JButton("REGISTER");
		btnNewButton8.setForeground(Color.WHITE);
		btnNewButton8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton8.setBounds(420, 320, 100, 20);
		//set transparent
		btnNewButton8.setContentAreaFilled(false);//设置按钮透明
		btnNewButton8.setBorder(null);//取消边框
		//jump to another page
		btnNewButton8.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	RegisGUI frame = new RegisGUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		contentPane.add(btnNewButton8);

		/*Shade*/
		JLabel lblNewLabel = new JLabel(new ImageIcon("img/shade.png"));
		lblNewLabel.setBounds(655, 0, 90, 90);
		contentPane.add(lblNewLabel);
		
		/*Back ground*/
		JLabel lblNewLabel2 = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblNewLabel2.setBounds(0, 0, 870, 490);
		contentPane.add(lblNewLabel2);
		
	}
}
