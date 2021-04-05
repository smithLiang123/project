package com.demo.entity;

import java.util.Date;

public class user {
    /**
     * @author lsm
     * @date 2021/4/1
     * @description User:
     *             No;name;birthday;gender;vip;deposit;height;weight;password;PhoneNumber;
     *
     *
     *
     *
     *
     * */

    public static void main(String[] args) {
        user user=new user(100,"lsm",21,"male",true,10000,"lsm12345678","18589081954","2000/01/01",85.8,180);
        System.out.println(user);
    }
    private int no;
    private String name;
    private int age;
    private String birthday;    //new
    private double height;    //new
    private double weight;     //new
    private String gender;
    private boolean vip;
    private double deposit;
    private String password;
    private String phoneNumber;
/** getter and setter   */
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public user(){}
    public user(int no, String name, int age, String gender,
                boolean vip, double deposit,String password,String phoneNumber,
                 String birthday,double height,double weight){
        setNo(no);
        setName(name);
        setAge(age);
        setGender(gender);
        setVip(vip);
        setDeposit(deposit);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setBirthday(birthday);
        setHeight(height);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "user{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", vip=" + vip +
                ", deposit=" + deposit +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
