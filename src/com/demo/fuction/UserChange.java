package com.demo.fuction;

import com.demo.CSVHelper;
import com.demo.entity.user;

import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * 更改用户信息。。。
 *
 *
 * */
public class UserChange {
    com.demo.entity.user user;
    String[] headers;
    CSVHelper csvHelper;
    String csvFilePath;
    public UserChange(user user){
        this.user=user;
        this.headers= new String[]{"No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"};
        this.csvHelper=new CSVHelper(headers,',');
        this.csvFilePath="data//user.csv";
    }
    /**
     *
     * 预计功能 复写user信息
     * */

    public static void main(String[] args) {
        user user=new user(1,"lsm",21,"male",true,10000,"1111","18589081954","2000/01/01",85.8,180);
        UserChange userChange=new UserChange(user);
        userChange.changeUserInfo(userChange);
    }


    public void changeUserInfo(UserChange userChange){
        List<String[]> UInfo=readUserInfo(userChange.csvFilePath,userChange.csvHelper);

//        for (int i=0;i<UInfo.size();i++){
//            String[] x=UInfo.get(i);
//            if (x[10].equals(userChange.user.getPhoneNumber())){
//                System.out.println("find");
//                x[0]=userChange.user.getNo()+"";
//                x[1]=userChange.user.getName();
//                x[2]=userChange.user.getAge()+"";
//                x[3]=userChange.user.getBirthday()+"";
//                x[4]=userChange.user.getHeight()+"";
//                x[5]=userChange.user.getWeight()+"";
//                x[6]=userChange.user.getGender()+"";
//                x[7]=userChange.user.isVip()+"";
//                x[8]=userChange.user.getDeposit()+"";
//                x[9]=userChange.user.getPassword()+"";
//                x[10]=userChange.user.getPhoneNumber()+"";
//            }
//        }
        for (String[] s:UInfo){
            if (s[10].equals(userChange.user.getPhoneNumber())){
                System.out.println("find");
                s[0]=userChange.user.getNo()+"";
                s[1]=userChange.user.getName();
                s[2]=userChange.user.getAge()+"";
                s[3]=userChange.user.getBirthday()+"";
                s[4]=userChange.user.getHeight()+"";
                s[5]=userChange.user.getWeight()+"";
                s[6]=userChange.user.getGender()+"";
                s[7]=userChange.user.isVip()+"";
                s[8]=userChange.user.getDeposit()+"";
                s[9]=userChange.user.getPassword()+"";
                s[10]=userChange.user.getPhoneNumber()+"";
                /**
                 *int no1, String name2, int age3, String gender4,
                 *                 boolean vip5, double deposit6,String password7,String phoneNumber8,
                 *                  String birthday9,double height10,double weight11
                 *
                 * "No.", "Name", "Age","Birthday","Height","Weight", "Gender", "vip", "Deposit","Password","Phone"
                 *  0        1      2       3        4         5        6         7       8         9          10
                 * */
            }
        }
        writeUserInfo(userChange.user, userChange.csvHelper, userChange.csvFilePath);
    }




    public List<String[]> readUserInfo(String csvFilePath, CSVHelper csvHelper){
        List<String[]> result = csvHelper.readCSV(csvFilePath,false);
        return result;
    }

    public String[] find(List<String[]> list,String phoneNumber){
        for (String[] s:list){
            if (s[10].equals(phoneNumber)){
                return s;
            }
            System.out.println();
        }
        return null;
    }

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
}
