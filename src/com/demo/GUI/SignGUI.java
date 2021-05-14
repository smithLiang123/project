package com.demo.GUI;

import com.demo.entity.user;
import com.demo.fuction.UserLogin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SignGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPho;
	private JTextField txtPwd;

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
		    	//打开新的窗口
		    	CohGUI_1 frame = new CohGUI_1(new user());
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
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
		
		/*Label: Phone No.*/
		JLabel lblPho = new JLabel("Phone No.");
		lblPho.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblPho.setForeground(Color.WHITE);
		lblPho.setBounds(265, 175, 125, 30);
		contentPane.add(lblPho);
		/*TextField: Account*/
		txtPho = new JTextField();
		txtPho.setBounds(405, 180, 160, 20);
		contentPane.add(txtPho);
		txtPho.setColumns(10);
		
		/*Label: Password*/
		JLabel lblPwd = new JLabel("Password");
		lblPwd.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblPwd.setForeground(Color.WHITE);
		lblPwd.setBounds(280, 240, 110, 30);
		contentPane.add(lblPwd);
		/*TextField: Password*/
		txtPwd = new JTextField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(405, 245, 160, 20);
		contentPane.add(txtPwd);
		
		/*Button: LOG IN*/
		JButton btnLog = new JButton("LOG IN");
		btnLog.setForeground(Color.WHITE);
		btnLog.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLog.setBounds(300, 320, 90, 20);
		//set transparent
		btnLog.setContentAreaFilled(false);//设置按钮透明
		btnLog.setBorder(null);//取消边框
		btnLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//登陆信息比对
				String phone=txtPho.getText();     //txtPho是手机号
				String password=txtPwd.getText();  //txtPwd是密码
				UserLogin userLogin=new UserLogin();
				user u = userLogin.user_login(phone,password);

				if(u.getName() == null) {
					JOptionPane.showConfirmDialog(contentPane, "The Phone number or Password you entered is incorrect",
							"Login failed", JOptionPane.ERROR_MESSAGE);
			        //登陆不成功刷新登陆界面
			        SignGUI frame = new SignGUI();
					frame.setVisible(true);
			        dispose();
				}
				//登陆成功以后进入主页
				else {
			    	HomeGUI frame = new HomeGUI(u);
					frame.setVisible(true);
			        dispose();
				}
			}
		});
		//btn change color
		btnLog.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnLog.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnLog.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnLog);
		
		/*Button: REGISTER*/
		JButton btnReg2 = new JButton("REGISTER");
		btnReg2.setForeground(Color.WHITE);
		btnReg2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnReg2.setBounds(420, 320, 100, 20);
		//set transparent
		btnReg2.setContentAreaFilled(false);//设置按钮透明
		btnReg2.setBorder(null);//取消边框
		//jump to another page
		btnReg2.addActionListener(new ActionListener() {
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
		btnReg2.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnReg2.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnReg2.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnReg2);

		/*Shade*/
		JLabel lblSha = new JLabel(new ImageIcon("img/shade.png"));
		lblSha.setBounds(655, 0, 90, 90);
		contentPane.add(lblSha);
		
		/*Back ground*/
		JLabel lblBg = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblBg.setBounds(0, 0, 870, 490);
		contentPane.add(lblBg);
		
	}
}
