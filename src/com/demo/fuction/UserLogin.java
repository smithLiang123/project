package com.demo.fuction;

import com.demo.CSVHelper;
import com.demo.entity.user;

import java.util.List;
import java.util.Scanner;

public class UserLogin {
    user user;
    String[] headers;
    CSVHelper csvHelper;
    String csvFilePath;
    public UserLogin(){
        this.headers= new String[]{"No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user.csv";
    }

    public static void main(String[] args) {
        UserLogin userLogin=new UserLogin();
        List<String[]> list= userLogin.readUserInfo(userLogin.csvFilePath, userLogin.csvHelper);
//        for (String[] s:list){
//            for (String x:s){
//                System.out.print(x+" ");18589081954
//            }
//            System.out.println();
//        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入电话");
        String PN=scanner.nextLine();
        System.out.println("请输入密码");
        String passWord=scanner.nextLine();

            String[] find = userLogin.find(list, PN);
            if (find != null) {
                boolean login = userLogin.match(find, passWord);
                if (login) {
                    System.out.println("欢迎登陆 用户："+find[0]);

                }
            }


    }

    /**
     * @param csvFilePath
     * @param csvHelper
     * @date 2021/3/31
     * @author lsm
     * @description
     * 将所有的用户信息读取出来
     * */
    public List<String[]> readUserInfo(String csvFilePath,CSVHelper csvHelper){
        List<String[]> result = csvHelper.readCSV(csvFilePath,false);
        return result;
    }
    /**
     * @param list
     * @param phoneNumber
     * @return 如果匹配成功返回用户信息
     * @date 2021/3/31
     * @author lsm
     * @description
     * 按用户手机号查找用户信息

     * */
    public String[] find(List<String[]> list,String phoneNumber){
        for (String[] s:list){
            if (s[10].equals(phoneNumber)){
                return s;
            }else if(s[0].equals(phoneNumber)){
                return s;
            }
            System.out.println();
        }
        return null;
    }
    /**
     * @param list
     * @param password
     * @return 是否匹配成功
     * @date 2021/3/31
     * @author lsm
     * @description
     * 验证密码是否正确
     *
     * */
    public boolean match(String[] list,String password){
        if (list[9].equals(password)){
            return true;
        }else {
            return false;
        }

    }
    /**
     * @param phoneNumber
     * @para password
     * @author lsm
     * @date 2021/4/6
     * @description 登录功能
     * @return boolean
     * */
    public user user_login(String phoneNumber,String password){

        UserLogin userLogin=new UserLogin();
        List<String[]> list= userLogin.readUserInfo(userLogin.csvFilePath, userLogin.csvHelper);

        String[] find = userLogin.find(list, phoneNumber);
        if (find != null) {
            boolean login = userLogin.match(find, password);
            if (login) {
                System.out.println("欢迎登陆 用户："+find[1]);
                /**以后肯定有用*/
                user user1 = new user(Long.parseLong(find[0]),find[1],Integer.parseInt(find[2]),find[6],Boolean.parseBoolean(find[7]),
                        Double.parseDouble(find[8]),find[9],find[10],find[3],Double.parseDouble(find[4]),Double.parseDouble(find[5])
                        );
                //登陆成功，返回有数据的user
                return user1;
            }
        }
/**
 *int no1, String name2, int age3, String gender4,
 *                 boolean vip5, double deposit6,String password7,String phoneNumber8,
 *                  String birthday9,double height10,double weight11
 *
 * "No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"
 *  0        1      2       3        4         5        6         7       8         9          10
 * */

        //登陆失败，返回没有数据的user
        user nullUser = new user();
        return nullUser;
    }

}
