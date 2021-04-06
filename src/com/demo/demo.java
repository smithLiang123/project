package com.demo;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

/**
 *
 * 这是一个demo  没有什么用   如果想看一下csv怎么回事可供参考
 *
 * */
public class demo {
    public static void main(String[] args) {
        writeCSV();
        readCSV();
    }
    public static void writeCSV(){

        String csvFilePath="data//1.csv";
        try {
            //创建csv写对象， CSVWriter(文件路径，分隔符，编码格式)
            CsvWriter csvWriter=new CsvWriter(csvFilePath,',',Charset.forName("UTF-8"));
            String[] csvHeader={"编号","姓名","年龄"};
            csvWriter.writeRecord(csvHeader);
            for (int i=0;i<20;i++){
                String[] csvContent={"000"+i,"StemQ","1"+i};
                csvWriter.writeRecord(csvContent);
            }
            csvWriter.close();
            System.out.println("csv文件已经写入");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readCSV(){
        try{
            //保存数据
            ArrayList<String[]> csvFileList=new ArrayList<String[]>();
            String csvFilePath="data//1.csv";
            CsvReader reader=new CsvReader(csvFilePath,',',Charset.forName("UTF-8"));
            //跳过表头
            reader.readHeaders();
            //逐行读入除了表头内的数据
            while (reader.readRecord()){
                System.out.println(reader.getRawRecord());
                csvFileList.add(reader.getValues());
            }
            reader.close();
            for (int row=0;row<csvFileList.size();row++){
                String cell=csvFileList.get(row)[1];
                System.out.println(cell);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
