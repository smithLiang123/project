package com.demo.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InfoUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoUI frame = new InfoUI();
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
	public InfoUI() {
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
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(280, 160, 110, 30);
		contentPane.add(lblNewLabel_1);
		/*TextField: Account*/
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(405, 165, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/*Label: Password*/
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(280, 200, 110, 30);
		contentPane.add(lblNewLabel_2);
		/*TextField: Password*/
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(405, 205, 160, 20);
		contentPane.add(textField_1);
		
		/*Label: Height*/
		JLabel lblNewLabel_2_1 = new JLabel("Height");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_1.setBounds(280, 240, 110, 30);
		contentPane.add(lblNewLabel_2_1);
		/*TextField: Height*/
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(405, 245, 160, 20);
		contentPane.add(textField_2);
		
		/*Label: Weight*/
		JLabel lblNewLabel_2_2 = new JLabel("Weight");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_2.setBounds(280, 280, 110, 30);
		contentPane.add(lblNewLabel_2_2);
		/*TextField: Weight*/
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(405, 285, 160, 20);
		contentPane.add(textField_3);
		
		/*Label: Birthday*/
		JLabel lblNewLabel_2_3 = new JLabel("Birthday");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_3.setBounds(280, 320, 110, 30);
		contentPane.add(lblNewLabel_2_3);
		/*TextField: Birthday*/
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(405, 325, 160, 20);
		contentPane.add(textField_4);

		/*Button: change information*/
		JButton btnNewButton_1 = new JButton("change");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(580, 195, 80, 40);
		//set transparent
		btnNewButton_1.setContentAreaFilled(false);//设置按钮透明
		btnNewButton_1.setBorder(null);//取消边框
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("change");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBounds(580, 235, 80, 40);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("change");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBounds(580, 275, 80, 40);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("change");
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBounds(580, 315, 80, 40);
		contentPane.add(btnNewButton_1_3);
		
		/*Shade*/
		JLabel lblNewLabel = new JLabel(new ImageIcon("img/shade.png"));
		lblNewLabel.setBounds(500, 0, 145, 90);
		contentPane.add(lblNewLabel);
		
		/*Back ground*/
		JLabel lblNewLabel2 = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblNewLabel2.setBounds(0, 0, 870, 490);
		contentPane.add(lblNewLabel2);

		


	}
}
