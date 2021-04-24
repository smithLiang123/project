package com.demo.fuction;
import com.demo.CSVHelper;
import com.demo.entity.user;

import java.text.SimpleDateFormat;
import java.util.List;

public class UserRegister {
    com.demo.entity.user user;
    String[] headers;
    CSVHelper csvHelper;
    String csvFilePath;
    public UserRegister(){
        this.headers= new String[]{"No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user.csv";
    }/**无参默认构造器*/
    public UserRegister(user user){
        this.headers= new String[]{"No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user.csv";
        this.user=user;
    }/**以user为参数的UserRegister构造器*/

    public static void main(String[] args) {
//        UserRegister userRegister=new UserRegister();
//        userRegister.user=new user(100,"lsm",21,"male",true,10000,"lsm12345678","18589081954","2000/01/01",85.8,180);
//        userRegister.add_user(userRegister);

    }
    /**
     * @param user
     * @description
     * @date 2021/4/6
     * @author lsm
     * 验证是否是合法注册，若是合法注册则注册成功，若是非法注册则抛出异常
     * */
    public static user verify(user user){
        return user;
    }
    /**
     * @param csvFilePath
     * @param csvHelper
     * @date 2021/4/6
     * @author lsm
     * @description
     * 将所有的用户信息读取出来
     * */
    public List<String[]> readUserInfo(String csvFilePath, CSVHelper csvHelper){
        List<String[]> result = csvHelper.readCSV(csvFilePath,false);
        return result;
    }
    /**
     * @date 2021/4/6
     * @author lsm
     * @description
     * 默认输入正确，添加用户信息
     * */
    public int add_user(UserRegister userRegister)  {
        List<String[]> old=csvHelper.readCSV(this.csvFilePath,false);
        com.demo.entity.user raw=userRegister.user;
        if (raw.getPhoneNumber()==null){
            return 2;
        }
        if (userRegister.PhoneCheck(raw.getPhoneNumber())){
            return 3;
        }
        if (raw.getName()==null){
            return 4;
        }
        if (raw.getHeight()<40||raw.getHeight()>230){
            return 5;
        }
        if (raw.getWeight()<0||raw.getWeight()>500){
            return 6;
        }
        if (find(old,raw.getPhoneNumber(),10)){
//            System.out.println("已注册");
            return 7;
        }
        if (find(old,raw.getName(),1)){
            return 8;
        }


        add_headers(userRegister.csvHelper.getHeaders(),userRegister.csvFilePath);
        String[] user_info=userRegister.user.user_info();
        old.add(user_info);
        csvHelper.writeCSV(this.csvFilePath,old);
        return 1;
    }

    public void add_headers(String[] str,String csvFilePath){//添加表头
        csvHelper.writeCSV(csvFilePath,str);
    }


    public boolean find(List<String[]> list,String value,int pos){
        for (String[] s:list){
            if (s[pos].equals(value)) {
                return true;
            }
        }
        return false;
    }
    public boolean PhoneCheck(String phone){
        int temp;
        byte[] bt;
        if (phone.length()==11){
            bt=phone.getBytes();
            for (int i=0;i<bt.length;i++){
                temp=bt[i]-48;
                if (temp<0||temp>9){
                    return true;
                }
            }
                return false;
        }
        return true;
    }

}
