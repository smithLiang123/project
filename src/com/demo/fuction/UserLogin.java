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
    UserLogin(){
        this.headers= new String[]{"No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user.csv";
    }

    public static void main(String[] args) {
        UserLogin userLogin=new UserLogin();
        List<String[]> list= userLogin.readUserInfo(userLogin.csvFilePath, userLogin.csvHelper);
//        for (String[] s:list){
//            for (String x:s){
//                System.out.print(x+" ");
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
}
