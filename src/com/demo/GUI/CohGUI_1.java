package com.demo.GUI;

import com.demo.entity.user;
import com.demo.fuction.Appointment2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class CohGUI_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CohGUI_1 frame = new CohGUI_1(new user());
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
	public CohGUI_1(user u) {
		
		Appointment2 ap = new Appointment2();
		String apResult[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
		
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
		    	//打开新的窗口
		    	CohGUI_1 frame = new CohGUI_1(u);
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
				    public void mouseEntered(MouseEvent e) {btnLogO.setForeground(Color.YELLOW);btnLogO.setText("Log Out");}
					public void mouseExited(MouseEvent e) {btnLogO.setForeground(Color.WHITE);btnLogO.setText("WELCOME " + u.getName());}
					public void mousePressed(MouseEvent e) {}
					public void mouseReleased(MouseEvent e) {}
			});
			contentPane.add(btnLogO);
		}
/*MENU BAR END*/
		
		/*Button: Coach1*/
		JButton btnCoh1 = new JButton("Tim   ♂");
		btnCoh1.setForeground(Color.WHITE);
		btnCoh1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCoh1.setBounds(0, 100, 90, 20);
		//set transparent
		btnCoh1.setContentAreaFilled(false);//设置按钮透明
		btnCoh1.setBorder(null);//取消边框
		//jump to another page
		btnCoh1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	CohGUI_1 frame = new CohGUI_1(u);
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnCoh1.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnCoh1.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnCoh1.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnCoh1);
		//Shade of Button
		JLabel lblBtnSha = new JLabel(new ImageIcon("img/shade.png"));
		lblBtnSha.setBounds(0, 85, 100, 50);
		contentPane.add(lblBtnSha);
		
		/*Button: Coach2*/
		JButton btnCoh2 = new JButton("Peter  ♂");
		btnCoh2.setForeground(Color.WHITE);
		btnCoh2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCoh2.setBounds(0, 150, 90, 20);
		//set transparent
		btnCoh2.setContentAreaFilled(false);//设置按钮透明
		btnCoh2.setBorder(null);//取消边框
		//jump to another page
		btnCoh2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	CohGUI_2 frame = new CohGUI_2(u);
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnCoh2.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnCoh2.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnCoh2.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnCoh2);
		
		/*Button: Coach3*/
		JButton btnCoh3 = new JButton("Risa   ♀");
		btnCoh3.setForeground(Color.WHITE);
		btnCoh3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCoh3.setBounds(0, 200, 90, 20);
		//set transparent
		btnCoh3.setContentAreaFilled(false);//设置按钮透明
		btnCoh3.setBorder(null);//取消边框
		//jump to another page
		btnCoh3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //打开新的窗口
		    	CohGUI_3 frame = new CohGUI_3(u);
				frame.setVisible(true);
				//关闭旧窗口
		        dispose();
		    }
		});
		//btn change color
		btnCoh3.addMouseListener(new MouseListener() {
			    public void mouseClicked(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {btnCoh3.setForeground(Color.YELLOW);}
				public void mouseExited(MouseEvent e) {btnCoh3.setForeground(Color.WHITE);}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
		});
		contentPane.add(btnCoh3);
		
/*Content*/		
		/*Date1*/
		JLabel lblDate1 = new JLabel("Mon.");
		lblDate1.setForeground(Color.WHITE);
		lblDate1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblDate1.setBounds(110, 65, 70, 44);
		contentPane.add(lblDate1);

		/*Date2*/
		JLabel lblDate2 = new JLabel("Wen.");
		lblDate2.setForeground(Color.WHITE);
		lblDate2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblDate2.setBounds(110, 245, 70, 50);
		contentPane.add(lblDate2);
		
		/*初始化显示教练的预约时间表*/
		try {
			apResult = ap.showInfo("Tim","coh1",u.getName());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(apResult[0]);
		
		/*Slot1*/
		JLabel lblSlt1 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt1.setBounds(150, 115, 138, 105);
		contentPane.add(lblSlt1);
		//预约按钮
		JButton btnslt1 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[0].equals("Occupied")) {
			btnslt1.setText("[Occupied]");
			lblSlt1.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[0].equals("Reserved")) {
    		btnslt1.setText("[Reserved]");
    		lblSlt1.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt1.setText("8:00-10:00 a.m.");
    		btnslt1.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("1", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt1.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt1.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt1.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt1.setForeground(Color.WHITE);
		btnslt1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt1.setBounds(133, 215, 170, 50);
		//set transparent
		btnslt1.setContentAreaFilled(false);//设置按钮透明
		btnslt1.setBorder(null);//取消边框
		contentPane.add(btnslt1);

		/*Slot2*/
		JLabel lblSlt2 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt2.setBounds(295, 115, 138, 105);
		contentPane.add(lblSlt2);
		//预约按钮
		JButton btnslt2 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[1].equals("Occupied")) {
			btnslt2.setText("[Occupied]");
			lblSlt2.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[1].equals("Reserved")) {
    		btnslt2.setText("[Reserved]");
    		lblSlt2.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt2.setText("10:00-12:00 a.m.");
    		btnslt2.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("2", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt2.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt2.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt2.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt2.setForeground(Color.WHITE);
		btnslt2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt2.setBounds(275, 215, 170, 50);
		//set transparent
		btnslt2.setContentAreaFilled(false);//设置按钮透明
		btnslt2.setBorder(null);//取消边框
		contentPane.add(btnslt2);

		/*Slot3*/
		JLabel lblSlt3 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt3.setBounds(440, 115, 138, 105);
		contentPane.add(lblSlt3);
		//预约按钮
		JButton btnslt3 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[2].equals("Occupied")) {
			btnslt3.setText("[Occupied]");
			lblSlt3.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[2].equals("Reserved")) {
    		btnslt3.setText("[Reserved]");
    		lblSlt3.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt3.setText("14:00-16:00 p.m.");
    		btnslt3.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("3", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt3.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt3.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt3.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt3.setForeground(Color.WHITE);
		btnslt3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt3.setBounds(423, 215, 170, 50);
		//set transparent
		btnslt3.setContentAreaFilled(false);//设置按钮透明
		btnslt3.setBorder(null);//取消边框
		contentPane.add(btnslt3);

		/*Slot4*/
		JLabel lblSlt4 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt4.setBounds(585, 115, 138, 105);
		contentPane.add(lblSlt4);
		//预约按钮
		JButton btnslt4 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[3].equals("Occupied")) {
			btnslt4.setText("[Occupied]");
			lblSlt4.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[3].equals("Reserved")) {
    		btnslt4.setText("[Reserved]");
    		lblSlt4.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt4.setText("16:00-18:00 p.m.");
    		btnslt4.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("4", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt4.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt4.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt4.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt4.setForeground(Color.WHITE);
		btnslt4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt4.setBounds(568, 215, 170, 50);
		//set transparent
		btnslt4.setContentAreaFilled(false);//设置按钮透明
		btnslt4.setBorder(null);//取消边框
		contentPane.add(btnslt4);

		/*Slot5*/
		JLabel lblSlt5 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt5.setBounds(150, 295, 138, 105);
		contentPane.add(lblSlt5);
		//预约按钮
		JButton btnslt5 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[4].equals("Occupied")) {
			btnslt5.setText("[Occupied]");
			lblSlt5.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[4].equals("Reserved")) {
    		btnslt5.setText("[Reserved]");
    		lblSlt5.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt5.setText("8:00-10:00 a.m.");
    		btnslt5.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("5", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt5.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt5.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt5.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt5.setForeground(Color.WHITE);
		btnslt5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt5.setBounds(135, 395, 170, 50);
		//set transparent
		btnslt5.setContentAreaFilled(false);//设置按钮透明
		btnslt5.setBorder(null);//取消边框
		contentPane.add(btnslt5);

		/*Slot6*/
		JLabel lblSlt6 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt6.setBounds(295, 295, 138, 105);
		contentPane.add(lblSlt6);
		//预约按钮
		JButton btnslt6 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[5].equals("Occupied")) {
			btnslt6.setText("[Occupied]");
			lblSlt6.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[5].equals("Reserved")) {
    		btnslt6.setText("[Reserved]");
    		lblSlt6.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt6.setText("10:00-12:00 a.m.");
    		btnslt6.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("6", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt6.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt6.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt6.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt6.setForeground(Color.WHITE);
		btnslt6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt6.setBounds(280, 395, 170, 50);
		//set transparent
		btnslt6.setContentAreaFilled(false);//设置按钮透明
		btnslt6.setBorder(null);//取消边框
		contentPane.add(btnslt6);

		/*Slot7*/
		JLabel lblSlt7 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt7.setBounds(440, 295, 138, 105);
		contentPane.add(lblSlt7);
		//预约按钮
		JButton btnslt7 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[6].equals("Occupied")) {
			btnslt7.setText("[Occupied]");
			lblSlt7.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[6].equals("Reserved")) {
    		btnslt7.setText("[Reserved]");
    		lblSlt7.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt7.setText("14:00-16:00 p.m.");
    		btnslt7.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("7", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt7.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt7.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt7.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt7.setForeground(Color.WHITE);
		btnslt7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt7.setBounds(425, 395, 170, 50);
		//set transparent
		btnslt7.setContentAreaFilled(false);//设置按钮透明
		btnslt7.setBorder(null);//取消边框
		contentPane.add(btnslt7);

		/*Slot8*/
		JLabel lblSlt8 = new JLabel(new ImageIcon("img/coh.jpg"));
		lblSlt8.setBounds(585, 295, 138, 105);
		contentPane.add(lblSlt8);
		//预约按钮
		JButton btnslt8 = new JButton("");
		//如果已经预约，则显示Occupied，且图片变为深色
		if(apResult[7].equals("Occupied")) {
			btnslt8.setText("[Occupied]");
			lblSlt8.setIcon(new ImageIcon("img/coh-opy.jpg"));
		}
		//如果自己预约，则显示Reserved，且图片高亮
    	else if(apResult[7].equals("Reserved")) {
    		btnslt8.setText("[Reserved]");
    		lblSlt8.setIcon(new ImageIcon("img/coh-rev.jpg"));
    		//取消预定
    	}
		//如果未预约，则显示当前时间段
    	else {
    		btnslt8.setText("16:00-18:00 p.m.");
    		btnslt8.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	//如果未登陆，则跳转登陆
    		    	if(u.getName() == null) {
    		    		SignGUI frame = new SignGUI();
    					frame.setVisible(true);
    			        dispose();
    		    	}
    		    	//如果已经登陆，则点击按钮预约
    		    	else {
    			    	//检验是否确定预约
    			    	int ifApo = JOptionPane.showConfirmDialog(contentPane, "Are you sure to make an appointment for the current period?","Appointment", JOptionPane.YES_NO_CANCEL_OPTION);
    			    	if(ifApo == JOptionPane.YES_OPTION){
        		    		try {
    							ap.Appoint("8", u.getName());
    						} catch (Exception e1) {
    							// TODO Auto-generated catch block
    							e1.printStackTrace();
    						}
        		    		//打开新的窗口
        			    	CohGUI_1 frame = new CohGUI_1(u);
        					frame.setVisible(true);
        					//关闭旧窗口
        			        dispose();
    			    	}
    		    	}
    		    }
    		});
    		//btn change color
    		btnslt8.addMouseListener(new MouseListener() {
    		    public void mouseClicked(MouseEvent e) {}
    			public void mouseEntered(MouseEvent e) {btnslt8.setForeground(Color.YELLOW);}
    			public void mouseExited(MouseEvent e) {btnslt8.setForeground(Color.WHITE);}
    			public void mousePressed(MouseEvent e) {}
    			public void mouseReleased(MouseEvent e) {}
    		});
    	}
		btnslt8.setForeground(Color.WHITE);
		btnslt8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnslt8.setBounds(570, 395, 170, 50);
		//set transparent
		btnslt8.setContentAreaFilled(false);//设置按钮透明
		btnslt8.setBorder(null);//取消边框
		contentPane.add(btnslt8);
/*Content End*/	
		
		/*Shade*/
		JLabel lblSha = new JLabel(new ImageIcon("img/shade.png"));
		lblSha.setBounds(402, 0, 90, 90);
		contentPane.add(lblSha);
		
		/*Back ground*/
		JLabel lblBg = new JLabel(new ImageIcon("img/page-bg.jpg"));
		lblBg.setBounds(0, 0, 870, 490);
		contentPane.add(lblBg);

	}
}
