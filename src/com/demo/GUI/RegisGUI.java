package com.demo.GUI;

import com.demo.entity.user;
import com.demo.fuction.UserRegister;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	private JTextField txtPho;          //phone no
	private JTextField txtPwd;        //password
	private JTextField txtHei;        //height
	private JTextField txtWei;        //weight
	private JTextField txtName;        //name

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
		
/*MENU BAR*/		
		/*Button: HOME*/
		JButton btnHome = new JButton("HOME");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnHome.setBounds(110, 35, 90, 20);
		//set transparent
		btnHome.setContentAreaFilled(false);//设置按钮透明
		btnHome.setBorder(null);//取消边框
		//jump to another page
		btnHome.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	HomeGUI frame = new HomeGUI(new user());
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnHome.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnHome.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnHome.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnHome);
		
		/*Button: VIDEO*/
		JButton btnVid = new JButton("VIDEO");
		btnVid.setForeground(Color.WHITE);
		btnVid.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVid.setBounds(210, 35, 90, 20);
		//set transparent
		btnVid.setContentAreaFilled(false);//设置按钮透明
		btnVid.setBorder(null);//取消边框
		//jump to another page
		btnVid.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	VidGUI_1 frame = new VidGUI_1(new user());
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnVid.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnVid.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnVid.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnVid);
		
		/*Button: VIP*/
		JButton btnVIP = new JButton("VIP");
		btnVIP.setForeground(Color.WHITE);
		btnVIP.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVIP.setBounds(305, 35, 90, 20);
		//set transparent
		btnVIP.setContentAreaFilled(false);//设置按钮透明
		btnVIP.setBorder(null);//取消边框
		//jump to another page
		btnVIP.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	//some code
		    }
		});
		//btn change color
		btnVIP.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnVIP.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnVIP.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnVIP);
		
		/*Button: COACH*/
		JButton btnCoa = new JButton("COACH");
		btnCoa.setForeground(Color.WHITE);
		btnCoa.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCoa.setBounds(400, 35, 90, 20);
		//set transparent
		btnCoa.setContentAreaFilled(false);//设置按钮透明
		btnCoa.setBorder(null);//取消边框
		//jump to another page
		btnCoa.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	//some code
		    }
		});
		//btn change color
		btnCoa.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnCoa.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnCoa.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnCoa);
		
		/*Button: REGISTER*/
		JButton btnReg = new JButton("REGISTER");
		btnReg.setForeground(Color.WHITE);
		btnReg.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnReg.setBounds(500, 35, 145, 20);
		//set transparent
		btnReg.setContentAreaFilled(false);//设置按钮透明
		btnReg.setBorder(null);//取消边框
		//jump to another page
		btnReg.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	RegisGUI frame = new RegisGUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnReg.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnReg.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnReg.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnReg);
		
		/*Button: SIGN IN*/
		JButton btnSig = new JButton("SIGN IN");
		btnSig.setForeground(Color.WHITE);
		btnSig.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSig.setBounds(655, 35, 90, 20);
		//set transparent
		btnSig.setContentAreaFilled(false);//设置按钮透明
		btnSig.setBorder(null);//取消边框
		//jump to another page
		btnSig.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		        SignGUI frame = new SignGUI();
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnSig.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnSig.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnSig.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnSig);
/*MENU BAR END*/
		
		/*Label: Register*/
		JLabel lblReg = new JLabel("REGISTER");
		lblReg.setForeground(Color.WHITE);
		lblReg.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblReg.setBounds(340, 100, 180, 30);
		contentPane.add(lblReg);
		
		/*Label: Phone No.*/
		JLabel lblPho = new JLabel("Phone No.");
		lblPho.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPho.setForeground(Color.WHITE);
		lblPho.setBounds(280, 160, 110, 30);
		contentPane.add(lblPho);
		/*TextField: Phone No.*/
		txtPho = new JTextField();
		txtPho.setBounds(405, 165, 160, 20);
		contentPane.add(txtPho);
		txtPho.setColumns(10);
		
		/*Label: Password*/
		JLabel lblPwd = new JLabel("Password");
		lblPwd.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPwd.setForeground(Color.WHITE);
		lblPwd.setBounds(280, 200, 110, 30);
		contentPane.add(lblPwd);
		/*TextField: Password*/
		txtPwd = new JTextField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(405, 205, 160, 20);
		contentPane.add(txtPwd);
		
		/*Label: Height*/
		JLabel lblHei = new JLabel("Height");
		lblHei.setForeground(Color.WHITE);
		lblHei.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblHei.setBounds(280, 240, 110, 30);
		contentPane.add(lblHei);
		/*TextField: Height*/
		txtHei = new JTextField();
		txtHei.setColumns(10);
		txtHei.setBounds(405, 245, 160, 20);
		contentPane.add(txtHei);
		
		/*Label: Weight*/
		JLabel lblWei = new JLabel("Weight");
		lblWei.setForeground(Color.WHITE);
		lblWei.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblWei.setBounds(280, 280, 110, 30);
		contentPane.add(lblWei);
		/*TextField: Weight*/
		txtWei = new JTextField();
		txtWei.setColumns(10);
		txtWei.setBounds(405, 285, 160, 20);
		contentPane.add(txtWei);
		
		/*Label: Name*/
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblName.setBounds(280, 320, 110, 30);
		contentPane.add(lblName);
		/*TextField: Name*/
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(405, 325, 160, 20);
		contentPane.add(txtName);
		
		/**Button: SIGN UP
		 *
		 *
		 * 这是核心业务
		 *
		 *
		 *
		 *
		 * */
		JButton btnSigUp = new JButton("SIGN UP");
		btnSigUp.setForeground(Color.WHITE);
		btnSigUp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnSigUp.setBounds(370, 380, 90, 20);
		//set transparent
		btnSigUp.setContentAreaFilled(false);//设置按钮透明
		btnSigUp.setBorder(null);//取消边框
		btnSigUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {    //注册第一版
				
				String phone=txtPho.getText();
				String password=txtPwd.getText();
				String height=txtHei.getText();
				String weight=txtWei.getText();
				String name=txtName.getText();
				user user=new user(phone,password,height,weight,name);
				UserRegister userRegister=new UserRegister(user);
				int status;
				if ((status=userRegister.add_user(userRegister))==1){
					System.out.println("good job");
				}else if (status==7){
					System.out.println("phone repeat");
				}else if (status==3){
					System.out.println("phone check wrong");
				}else if(status==8){
					System.out.println("name repeat");
				}else if (status==2){
					System.out.println("phone number can't be null");
				}else if (status==4){
					System.out.println("name can't be null");
				}else if (status==5){
					System.out.println("please enter right height");
				}else if (status==6){
					System.out.println("please enter right weight");
				}

				
		        //打开新的窗口
		    	HomeGUI frame = new HomeGUI(new user());
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
			}
		});
		//btn change color
		btnSigUp.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnSigUp.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnSigUp.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnSigUp);
		
		/*Shade*/
		JLabel lblSha = new JLabel(new ImageIcon("img/shade.png"));
		lblSha.setBounds(500, 0, 145, 90);
		contentPane.add(lblSha);
		
		/*Back ground*/
		JLabel lblBg = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblBg.setBounds(0, 0, 870, 490);
		contentPane.add(lblBg);

	}
}
