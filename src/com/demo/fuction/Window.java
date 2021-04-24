package com.demo.fuction;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.demo.GUI.HomeGUI;
import com.demo.GUI.VidGUI_1;
import com.demo.entity.user;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

@SuppressWarnings("serial")
public class Window extends JFrame{

    private JPanel contentPane; //顶层容器，整个播放页面的容器
    private JMenuBar menuBar;   //菜单栏
    private JButton backBtn;	//返回
    private JPanel panel;   //控制区域容器
    private JProgressBar progress;  //进度条
    private JPanel progressPanel;   //进度条容器
    private JPanel controlPanel;    //控制按钮容器
    private JButton btnPlay,btnPause,vol;   //控制按钮，停止、播放、暂停、音量图标
    private JSlider slider;     //声音控制块
    private  Timer  timer ;


    EmbeddedMediaPlayerComponent playerComponent;   //媒体播放器组件

    //MainWindow构造方法，创建视屏播放的主界面
    public Window(user u){
        setTitle("ViDEO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,80,900,600);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        /*视频播放窗口中的菜单栏*/
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        backBtn=new JButton("Back");     //设置菜单名
        menuBar.add(backBtn);

        //返回按钮
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	//停止视频
                getMediaPlayer().stop();
                if(timer.isRunning()) {
                    timer.stop();//停止；
                }
                getProgressBar().setValue(-1);
                
                //返回video界面
                VidGUI_1 frame = new VidGUI_1(u);
				frame.setVisible(true);
		        dispose();
            }
        });

        /*视屏窗口中播放界面部分*/
        JPanel videoPane=new JPanel();
        contentPane.add(videoPane, BorderLayout.CENTER);
        videoPane.setLayout(new BorderLayout(0,0));

        playerComponent=new EmbeddedMediaPlayerComponent();
        videoPane.add(playerComponent);



        /*视屏窗口中控制部分*/

        panel=new JPanel();     //实例化控制区域容器
        videoPane.add(panel,BorderLayout.SOUTH);

        progressPanel=new JPanel(); //实例化进度条容器
        panel.add(progressPanel, BorderLayout.NORTH);

        //添加进度条
        progress=new JProgressBar();
        progressPanel.add(progress);
        //panel.add(progress,BorderLayout.NORTH);
        progress.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){     //点击进度条调整视屏播放进度
                int x=e.getX();
                getMediaPlayer().setTime((long) ((float)x/progress.getWidth() *getMediaPlayer().getLength()));

            }
        });
        progress.setStringPainted(true);


        controlPanel=new JPanel();      //实例化控制按钮容器
        panel.add(controlPanel,BorderLayout.SOUTH);

        //添加播放按钮
        btnPlay=new JButton("▶");
        btnPlay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                getMediaPlayer().play();
                //判断timer是否正在运行；
                if(!timer.isRunning()) {
                    timer.start(); //启动；
                }
            }
        });
        controlPanel.add(btnPlay);

        //添加暂停按钮
        btnPause=new JButton("||");
        btnPause.setFont(new Font("宋体", Font.BOLD, 12));
        btnPause.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                //PlayerMain.dispose();
                getMediaPlayer().pause();
            }
        });
        controlPanel.add(btnPause);
        
        //扬声器图标
        vol=new JButton("  🔊");
        vol.setContentAreaFilled(false);//设置按钮透明
        vol.setBorder(null);//取消边框
        controlPanel.add(vol);

        //添加声音控制块
        slider=new JSlider();
        slider.setValue(80);
        slider.setMaximum(100);
        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub

                getMediaPlayer().setVolume(slider.getValue());
            }
        });
        controlPanel.add(slider);


        //视频表面的鼠标事件监听
        playerComponent.getVideoSurface().addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("**************");
            }
        });


        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long total = getMediaPlayer().getLength();

                long curr = getMediaPlayer().getTime();
                float percent = (float) curr / total;
                getProgressBar().setValue((int)(percent*100));

            }
        });

        timer.start();


        addWindowListener(new WindowAdapter() { // 用于监听此窗口的关闭事件,等同于“退出登录功能”
            @Override
            public void windowClosing(WindowEvent e) {
                exitActionPerformed();
            }
        });
    }

    //获取播放媒体实例（某个视频）
    public EmbeddedMediaPlayer getMediaPlayer() {
        return playerComponent.getMediaPlayer();
    }

    //获取进度条实例
    public JProgressBar getProgressBar() {
        return progress;
    }

    /**
     * 退出；
     */
    public void exitActionPerformed() {
        getMediaPlayer().release();
        System.exit(0);
    }

}