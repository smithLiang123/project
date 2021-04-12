package com.demo;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f=new File("1.csv");
        String absolut=f.getAbsolutePath();
        System.out.println(absolut);
    }
}