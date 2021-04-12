package com.demo.GUI;

import com.demo.entity.user;
import com.demo.fuction.UserRegister;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kxj
 * @date 2021/3/31
 * @description
 * 注册界面前端
 *
 *
 *
 *
 * */

public class RegisGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;          //account
	private JTextField textField_1;        //password
	private JTextField textField_2;        //height
	private JTextField textField_3;        //weight
	private JTextField textField_4;        //birthday

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisGUI frame = new RegisGUI();
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
	public RegisGUI() {
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
		btnNewButton.addActionListener(new ActionListener() {//Home
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	HomeGUI frame = new HomeGUI(new user());
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
		    	//some code
				JOptionPane.showMessageDialog(null, "Developing...");  
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
		    	//some code
				JOptionPane.showMessageDialog(null, "Developing...");  
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
		    	//some code
				JOptionPane.showMessageDialog(null, "Developing...");  
		    }
		});
		contentPane.add(btnNewButton4);
		
		/*Button: REGISTER*/
		JButton btnNewButton8 = new JButton("REGISTER");
		btnNewButton8.setForeground(Color.WHITE);
		btnNewButton8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton8.setBounds(500, 35, 145, 20);
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
		
		/*Button: SIGN IN*/
		JButton btnNewButton6 = new JButton("SIGN IN");
		btnNewButton6.setForeground(Color.WHITE);
		btnNewButton6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton6.setBounds(655, 35, 90, 20);
		//set transparent
		btnNewButton6.setContentAreaFilled(false);//设置按钮透明
		btnNewButton6.setBorder(null);//取消边框
		//jump to another page
		btnNewButton6.addActionListener(new ActionListener() {//sign in
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
		
		/*Label: Register*/
		JLabel lblNewLabel_3 = new JLabel("REGISTER");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_3.setBounds(340, 100, 180, 30);
		contentPane.add(lblNewLabel_3);
		
		/*Label: Phone No.*/
		JLabel lblNewLabel_1 = new JLabel("Phone No.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(280, 160, 110, 30);
		contentPane.add(lblNewLabel_1);
		/*TextField: Phone No.*/
		textField = new JTextField();
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
		textField_3.setColumns(10);
		textField_3.setBounds(405, 285, 160, 20);
		contentPane.add(textField_3);
		
		/*Label: Name*/
		JLabel lblNewLabel_2_3 = new JLabel("Name");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_3.setBounds(280, 320, 110, 30);
		contentPane.add(lblNewLabel_2_3);
		/*TextField: Name*/
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(405, 325, 160, 20);
		contentPane.add(textField_4);
		
		/*Button: SIGN UP*/
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(370, 380, 90, 20);
		//set transparent
		btnNewButton_1.setContentAreaFilled(false);//设置按钮透明
		btnNewButton_1.setBorder(null);//取消边框
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {    //注册第一版
				
				String phone=textField.getText();
				String password=textField_1.getText();
				String height=textField_2.getText();
				String weight=textField_3.getText();
				String name=textField_4.getText();
				user user=new user(phone,password,height,weight,name);
				UserRegister userRegister=new UserRegister(user);
				userRegister.add_user(userRegister);
				
		        //打开新的窗口
		    	HomeGUI frame = new HomeGUI(new user());
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
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
