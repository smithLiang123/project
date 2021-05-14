package com.demo.fuction;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Appointment2 {
	
    
    String coachname[] = {"Tim", "Peter", "Risa"};
    String coach[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
    int checktable[] = {0, 0, 0, 0, 0, 0, 0, 0};
    String name;
    String num;
    String str = null;
    char[] chars=new char[14];
    //static Appointment2 appointment2 = new Appointment2();
    int posite = 0;
    char[] checkchar = new char[7];
    int n;


    public static void main(String[] args) {
    	
    	/*
    	try {
    		showInfo();
    		Appoint();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
    	
    }
    
    

    public String[] showInfo(String CohName,String CohNum, String userName) throws Exception {
    	
//        System.out.println("请输入需要预约的教练:");
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
    	

    	name = CohName;
    	num = CohNum;
    	
        File file = new File("data//" + name + ".txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        int row = 0;
        while ((line = in.readLine()) != null) {
            String[] temp = line.split("\t");

            for (int j = 0; j <= 7; j++) {
                checktable[j] = (int) Double.parseDouble(temp[j]);
            }
        }

        in.close();

        String csvFile = "data//user.csv";
        String line1 = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            line1 = br.readLine();
            String[] trainer = line1.split(cvsSplitBy);
          
            for(int k=1;k<14;k++)
            {
                if(num.matches(trainer[k]))
                    posite=k;
            }
            while ((line1 = br.readLine()) != null) {

                // use comma as separator
                String[] country = line1.split(cvsSplitBy);
                
                if(userName == null) {
                    for (row = 0; row <= 7; row++) {
                        if (checktable[row] == 1)
                        	coach[row] = "Occupied";//coach[row] = "已被占用";
                    }
                }
                else if (country[1].matches(userName)) {
                    str=line1;
                    chars = country[posite].toCharArray();
                    checkchar=chars;
                    for (row = 0; row <= 7; row++) {
                        if (checktable[row] == 1)
                        	coach[row] = "Occupied";//coach[row] = "已被占用";
                        
                        int i = row+1;
                        if (checktable[row] == 1 && chars[i]== '1')
                        	coach[row] = "Reserved";//coach[row] = "已预约";
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(coach[0] + " " + coach[1] + " " + coach[2] + " " + coach[3] + " " + coach[4] + " " + coach[5] + " " + coach[6] + " " + coach[7]);
        
        return coach;
    }


    public void Appoint(String ApDate, String userName) throws Exception{
        
        while (true) {
//            System.out.println("请输入需要预约的日期:");
//            Scanner scanner2 = new Scanner(System.in);
//            String date = scanner2.nextLine();
        	
        	String date = ApDate;
        	
            if (date.matches(coach[0]) || date.matches(coach[1]) || date.matches(coach[2]) || date.matches(coach[3]) || date.matches(coach[4]) || date.matches(coach[5]) || date.matches(coach[6]) || date.matches(coach[7])) {

                n = findtime(date);
                break;
            }

            System.out.println("请重新输入预约时间");
        }
        int ii = n+1;
        checkchar[ii]='1';
        checktable[n] = 1;

        String[] checkstr=str.split(",");
        
        checkstr[posite]=new String(checkchar);
        StringBuffer sb = new StringBuffer();
        String s=null;
        for(int i=0;i<checkstr.length;i++) {
            s=sb.append(checkstr[i]+",").toString();
        }
        String newstr=s.substring(0,s.length()-1);

        try {
            FileWriter fw = new FileWriter("data//"+name+".txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int v : checktable) {

                    bw.write(String.valueOf(v) + "\t");

            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SearchUpdateTxt searchUpdateTxt=new SearchUpdateTxt();
        searchUpdateTxt.UpdateInfo(newstr, userName);

        System.out.println("预约成功");
    }
    
    public int findcoach(String name)
    {
        Appointment2 appointment2= new Appointment2();
        int i=0;
        int coachnumber= coach.length;

        for(i=0;i<coachnumber;i++)
        {

            if(name.matches(coach[i]))
                break;
        }
        return i;
    }

    public int findtime(String time)
    {
        Appointment2 appointment2= new Appointment2();
        int coachnumber= coach.length;
        int i=0;
        for(i=0;i<coachnumber;i++)
        {
            if(time.matches(coach[i]))
                break;
        }
        return i;
    }

}
