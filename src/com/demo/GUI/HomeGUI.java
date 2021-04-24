package com.demo.GUI;

import com.demo.entity.user;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;


public class HomeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGUI frame = new HomeGUI(new user());
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
	public HomeGUI(user u) {
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
		    	HomeGUI frame = new HomeGUI(u);
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
		    	VidGUI_1 frame = new VidGUI_1(u);
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
		
		//判断用户是否登陆
		//如果未登陆，则显示register
		if(u.getName() == null) {
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
		}
		//如果已登陆，则显示information
		else {
			/*Button: INFORMATION*/
			JButton btnInf = new JButton("INFORMATION");
			btnInf.setForeground(Color.WHITE);
			btnInf.setFont(new Font("Times New Roman", Font.BOLD, 18));
			btnInf.setBounds(505, 35, 145, 20);
			//set transparent
			btnInf.setContentAreaFilled(false);//设置按钮透明
			btnInf.setBorder(null);//取消边框
			//jump to another page
			btnInf.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	//some code
			    }
			});
			//btn change color
			btnInf.addMouseListener(new MouseListener() {
				    public void mouseClicked(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {btnInf.setForeground(Color.YELLOW);}
					public void mouseExited(MouseEvent e) {btnInf.setForeground(Color.WHITE);}
					public void mousePressed(MouseEvent e) {}
					public void mouseReleased(MouseEvent e) {}
			});
			contentPane.add(btnInf);
		}

		//判断用户是否登陆
		//如果未登陆，则显示sign in
		if(u.getName() == null) {
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
		}
		//如果已登陆，则显示welcome，且点击即可退出登陆
		else {
			/*Button: LOG OUT*/
			JButton btnLogO = new JButton("WELCOME " + u.getName());
			btnLogO.setForeground(Color.WHITE);
			btnLogO.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			btnLogO.setBounds(655, 35, 150, 20);
			//set transparent
			btnLogO.setContentAreaFilled(false);//设置按钮透明
			btnLogO.setBorder(null);//取消边框
			//jump to another page
			btnLogO.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	//检验是否确定退出登陆
			    	int ifLogOut = JOptionPane.showConfirmDialog(contentPane, "Are you sure you want to log out?", "LOG OUT", JOptionPane.YES_NO_CANCEL_OPTION);
			    	if(ifLogOut == JOptionPane.YES_OPTION){
				    	HomeGUI frame = new HomeGUI(new user());
						frame.setVisible(true);
				        dispose();
			    	}
			    }
			});
			//btn change color
			btnLogO.addMouseListener(new MouseListener() {
				    public void mouseClicked(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {btnLogO.setForeground(Color.YELLOW);}
					public void mouseExited(MouseEvent e) {btnLogO.setForeground(Color.WHITE);}
					public void mousePressed(MouseEvent e) {}
					public void mouseReleased(MouseEvent e) {}
			});
			contentPane.add(btnLogO);
		}
/*MENU BAR END*/
		
		/*Title*/
		JLabel lblTit = new JLabel("GROUP 74's GYM");
		lblTit.setForeground(Color.WHITE);
		lblTit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTit.setBounds(170, 230, 210, 40);
		contentPane.add(lblTit);
		
		/*Sub-title*/
		JLabel lblTit2 = new JLabel("THE BEST GYM YOU HAVE EVER SEEN");
		lblTit2.setForeground(Color.WHITE);
		lblTit2.setFont(new Font("等线", Font.PLAIN, 18));
		lblTit2.setBounds(120, 310, 300, 51);
		contentPane.add(lblTit2);
		
		/*Shade*/
		JLabel lblSha = new JLabel(new ImageIcon("img/shade.png"));
		lblSha.setBounds(110, 0, 90, 90);
		contentPane.add(lblSha);
		
		/*Back ground*/
		JLabel lblBg = new JLabel(new ImageIcon("img/home-bg.jpg"));
		lblBg.setBounds(0, 0, 870, 490);
		contentPane.add(lblBg);

	}
}
