package com.demo;

import java.io.File;
import java.io.IOException;

public class Main {
/**
 *
 *
 * 废物文件 别看了
 *
 *
 *
 * */
    public static void main(String[] args) throws IOException {
	// write your code here
        File file=new File("C:\\Users\\13188\\Desktop\\大三下学期\\软件工程\\jjjj.txt");
        File dir=new File("test");
        //dir.mkdir();
        file.mkdir();
        System.out.println(dir.getAbsolutePath());
    }
}
