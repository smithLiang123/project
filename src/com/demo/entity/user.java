package com.demo.entity;

public class user {
    public static void main(String[] args) {
        user user=new user(100,"lsm",21,"male",true,10000,"lsm12345678","18589081954");
        System.out.println(user);
    }
    private int no;
    private String name;
    private int age;
    private String gender;
    private boolean vip;
    private double deposit;
    private String password;
    private String phoneNumber;

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

    public user(){}
    public user(int no, String name, int age, String gender, boolean vip, double deposit,String password,String phoneNumber){
        setNo(no);
        setName(name);
        setAge(age);
        setGender(gender);
        setVip(vip);
        setDeposit(deposit);
        setPassword(password);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return "{"+ no +','+
                 name+','+
                age+','+
                gender + ','+
                vip +','
                 + deposit +','+password+
                ','+phoneNumber+
                '}';
    }
}
