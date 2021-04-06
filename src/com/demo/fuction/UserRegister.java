package com.demo.fuction;
import com.demo.CSVHelper;
import com.demo.entity.user;

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
        UserRegister userRegister=new UserRegister();
        userRegister.user=new user(100,"lsm",21,"male",true,10000,"lsm12345678","18589081954","2000/01/01",85.8,180);
        userRegister.add_user(userRegister);
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
    public void add_user(UserRegister userRegister){
        List<String[]> old=csvHelper.readCSV(this.csvFilePath,false);
        add_headers(userRegister.csvHelper.getHeaders(),userRegister.csvFilePath);
        String[] user_info=userRegister.user.user_info();
        old.add(user_info);
        csvHelper.writeCSV(this.csvFilePath,old);
    }

    public void add_headers(String[] str,String csvFilePath){//添加表头
        csvHelper.writeCSV(csvFilePath,str);
    }





}
