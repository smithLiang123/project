package com.demo.fuction;

import java.io.*;

public class SearchUpdateTxt {


    public void UpdateInfo(String newstr, String userName) throws Exception{

        File file = new File("data//user.csv");

        String indexstr = userName;

        BufferedReader br = new BufferedReader(new FileReader(file));//读文件
        StringBuffer bf = new StringBuffer();
        String rl = null;
        boolean status;
        while ((rl = br.readLine()) != null) {
            status = rl.contains(indexstr);
            if (status) {
                bf.append(newstr + "\r\n");
            } else {
                bf.append(rl + "\r\n");
            }
        }
        br.close();

        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(bf.toString());
        out.flush();
        out.close();
    }
}
