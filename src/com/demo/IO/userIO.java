package com.demo.IO;

import com.demo.CSVHelper;
import com.demo.entity.user;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lsm
 * @description
 * 这是负责处理user类IO的类
 * 在构造器初始化的时候就确认了 表头，地址  初始化了 CSVHelper
 *
 * */
public class userIO {
    user user;
    String[] headers;
    CSVHelper csvHelper;
    String csvFilePath;
    public userIO(){
        /**
         * 各个属性存储的顺序：1.号码 2.姓名 3.年龄 4.生日 5.身高 6.体重 7.性别 8.是否是VIP 9.存款 10.密码 11.电话号码
         * */
        this.headers= new String[]{"No.", "Name", "Age", "Birthday","height","weight","Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user1.csv";
    }


    public static void main(String[] args) {
        userIO userIO=new userIO();
        userIO.user=new user(101,"lsm",21,"male",true,99999,"lsm","18589081954","2000/01/01",88,180);
        userIO.writeUserInfo(userIO.user,userIO.csvHelper,userIO.csvFilePath);
  //      userIO.user=new user(999,"lll",23,"male",true,282828,"lsm12345678","18589081954");
  //      userIO.addUser(userIO.user, userIO.csvHelper,userIO.csvFilePath);
        List<String[]> list= userIO.readUserInfo(userIO.csvFilePath, userIO.csvHelper);
        for (String[] s:list){
            for (String x:s){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    /**
     * @author lsm
     * @param csvFilePath csv目标文件的地址目录
     * @param csvHelper 需要用到的CSVHelper实体
     * @param user 需要写入的实体
     * @description
     * 这是writeUserInfo 传入内容写进csv文件
     * @warning 因为是直接写入 所以会覆盖之前写入的内容
     * */
    public void writeUserInfo(user user,CSVHelper csvHelper,String csvFilePath){
        List<String[]> content=new LinkedList<String[]>();
        /**
         * 各个属性存储的顺序：1.号码 2.姓名 3.年龄 4.生日 5.身高 6.体重 7.性别 8.是否是VIP 9.存款 10.密码 11.电话号码
         * */
        String[] temp={user.getNo()+"",user.getName(),""+user.getAge(),user.getBirthday(),
                ""+user.getHeight(),""+user.getWeight(),user.getGender(),
                ""+user.isVip(),""+user.getDeposit(),user.getPassword(),user.getPhoneNumber()};
        content.add(temp);
        csvHelper.writeCSV(csvFilePath,content);
    }
    /**
     * @author lsm
     * @param csvHelper CSVHelper实体
     * @param csvFilePath csv文件地址
     * @description
     * 读文件 将数据结构化的读出 存入list
     * */
    public List<String[]> readUserInfo(String csvFilePath,CSVHelper csvHelper){
        List<String[]> result = csvHelper.readCSV(csvFilePath,false);
        return result;
    }
    /**
     * @author lsm
     * @param csvFilePath
     * @param user
     * @param csvHelper
     * @description
     * 在csv文件后追加内容，
     *
     * */
    public void addUser(user user,CSVHelper csvHelper,String csvFilePath){
        List<String[]> content=new LinkedList<String[]>();
        String[] temp={user.getNo()+"",user.getName(),""+user.getAge(),user.getGender(),""+user.isVip(),""+user.getDeposit(),user.getPassword(),user.getPhoneNumber()};
        content.add(temp);
        csvHelper.addCSV(csvFilePath,content);
    }

}
