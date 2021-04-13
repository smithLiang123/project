package com.demo.fuction;


public class PlayerMain {




    static Window frame;
    // private static final String NATIVE_LIBRARY_SEARCH_PATH = "D:\\Program
    // Files\\VideoLAN\\VLC\\sdk\\lib";

    public static void main(String[] args) {
        frame = new Window();
        frame.setVisible(true);
        frame.getMediaPlayer().playMedia("F:\\1.mp4"); // 直接播放视屏，参数是视屏文件的绝对路径
    }

    }


