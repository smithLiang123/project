package com.demo.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import com.demo.entity.user;
import com.demo.fuction.Window;


public class VidGUI_1 extends JFrame {

	private JPanel contentPane;
	static Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VidGUI_1 frame = new VidGUI_1(new user());
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
	public VidGUI_1(user u) {
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
		
		/*Button: HIIT*/
		JButton btnHitt = new JButton("HIIT");
		btnHitt.setForeground(Color.WHITE);
		btnHitt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnHitt.setBounds(0, 100, 90, 20);
		//set transparent
		btnHitt.setContentAreaFilled(false);//设置按钮透明
		btnHitt.setBorder(null);//取消边框
		//jump to another page
		btnHitt.addActionListener(new ActionListener() {
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
		btnHitt.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnHitt.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnHitt.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnHitt);
		//Shade of Button
		JLabel lblBtnSha = new JLabel(new ImageIcon("img/shade.png"));
		lblBtnSha.setBounds(0, 85, 100, 50);
		contentPane.add(lblBtnSha);
		
		/*Button: Yoga*/
		JButton btnYoga = new JButton("Yoga");
		btnYoga.setForeground(Color.WHITE);
		btnYoga.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnYoga.setBounds(0, 150, 90, 20);
		//set transparent
		btnYoga.setContentAreaFilled(false);//设置按钮透明
		btnYoga.setBorder(null);//取消边框
		//jump to another page
		btnYoga.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	VidGUI_2 frame = new VidGUI_2(u);
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnYoga.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {btnYoga.setForeground(Color.YELLOW);}
			public void mouseExited(MouseEvent e) {btnYoga.setForeground(Color.WHITE);}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnYoga);
		
		/*Button: Strength*/
		JButton btnStr = new JButton("Strength");
		btnStr.setForeground(Color.WHITE);
		btnStr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnStr.setBounds(3, 200, 90, 20);
		//set transparent
		btnStr.setContentAreaFilled(false);//设置按钮透明
		btnStr.setBorder(null);//取消边框
		//jump to another page
		btnStr.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	VidGUI_3 frame = new VidGUI_3(u);
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnStr.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {btnStr.setForeground(Color.YELLOW);}
			public void mouseExited(MouseEvent e) {btnStr.setForeground(Color.WHITE);}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnStr);
		
		/*Vid1*/
		JLabel lblVid1 = new JLabel(new ImageIcon("img/cover-hitt-01.jpg"));
		lblVid1.setBounds(120, 115, 320, 180);
		contentPane.add(lblVid1);
		//播放按钮
		JButton btnVid1 = new JButton("<html>"
										+ "<center>10 Min HIIT to burn calories | Standing Full Body Workout - No Equipment</center>"
									+ "</html>");
		btnVid1.setForeground(Color.WHITE);
		btnVid1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVid1.setBounds(140, 300, 280, 90);
		//set transparent
		btnVid1.setContentAreaFilled(false);//设置按钮透明
		btnVid1.setBorder(null);//取消边框
		//实现播放功能
		btnVid1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				frame = new Window(u);
				frame.setVisible(true);
				frame.getMediaPlayer().playMedia("vid/hitt-01.mp4"); // 直接播放视屏，参数是视屏文件的绝对路径
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnVid1.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {btnVid1.setForeground(Color.YELLOW);}
			public void mouseExited(MouseEvent e) {btnVid1.setForeground(Color.WHITE);}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnVid1);
		
		/*Vid2*/
		JLabel lblVid2 = new JLabel(new ImageIcon("img/cover-hitt-02.jpg"));
		lblVid2.setBounds(500, 115, 320, 180);
		contentPane.add(lblVid2);
		//播放按钮
		JButton btnVid2 = new JButton("<html>"
										+ "<center>10 MINUTE FAT BURNING MORNING ROUTINE</center>"
										+ "<center>Do this every day</center>"
									+ "</html>");
		btnVid2.setForeground(Color.WHITE);
		btnVid2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnVid2.setBounds(500, 300, 280, 90);
		//set transparent
		btnVid2.setContentAreaFilled(false);//设置按钮透明
		btnVid2.setBorder(null);//取消边框
		//实现播放功能
		btnVid2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				frame = new Window(u);
				frame.setVisible(true);
				frame.getMediaPlayer().playMedia("vid/hitt-02.mp4"); // 直接播放视屏，参数是视屏文件的绝对路径
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnVid2.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {btnVid2.setForeground(Color.YELLOW);}
			public void mouseExited(MouseEvent e) {btnVid2.setForeground(Color.WHITE);}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnVid2);
		
		/*Shade*/
		JLabel lblSha = new JLabel(new ImageIcon("img/shade.png"));
		lblSha.setBounds(210, 0, 90, 90);
		contentPane.add(lblSha);
		
		/*Back ground*/
		JLabel lblBg = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblBg.setBounds(0, 0, 870, 490);
		contentPane.add(lblBg);


	}
}
