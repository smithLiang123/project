package com.demo.fuction;
import com.demo.CSVHelper;
import com.demo.IO.userIO;
import com.demo.entity.user;

import java.util.List;
import java.util.Scanner;

public class userLogin {
    user user;
    String[] headers;
    CSVHelper csvHelper;
    String csvFilePath;
    userLogin(){
        this.headers= new String[]{"No.", "Name", "Age", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="C://Users//13188//Desktop//大三下学期//软件工程//data//user.csv";
    }

    public static void main(String[] args) {
        userLogin userLogin=new userLogin();
        List<String[]> list= userLogin.readUserInfo(userLogin.csvFilePath, userLogin.csvHelper);
//        for (String[] s:list){
//            for (String x:s){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }
        Scanner scanner=new Scanner(System.in);
        String PN=scanner.nextLine();
        String passWord=scanner.nextLine();


            String[] find = userLogin.find(list, PN);
            if (find != null) {
                boolean login = userLogin.match(find, passWord);
                if (login) {
                    System.out.println("欢迎登陆 用户："+find[7]);

                }
            }


    }
    public List<String[]> readUserInfo(String csvFilePath,CSVHelper csvHelper){
        List<String[]> result = csvHelper.readCSV(csvFilePath,false);
        return result;
    }

    public String[] find(List<String[]> list,String phoneNumber){
        for (String[] s:list){
            if (s[7].equals(phoneNumber)){
                return s;
            }
            System.out.println();
        }
        return null;
    }
    public boolean match(String[] list,String password){
        if (list[6].equals(password)){
            return true;
        }else {
            return false;
        }

    }
}
