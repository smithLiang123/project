package com.demo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
/**
 * @author lsm
 * @date 2021/3/30
 * @Description csvHelper
 * 一切的csv操作最终都是从这边写入
 * 目前实现了：read，write，add；
 * warning：现在的write会直接覆盖掉之前写的内容慎用，add作为进阶版的write可以解决此问题
 *
 * */
public class CSVHelper {
    private String[] headers;                             //csv文件的表头，也就是属性
    private char seperator = ',';                         //告诉csv是用生么符号分割数据
    public char getSeperator() { return seperator;	}
    public void setSeperator(char seperator) {
        this.seperator = seperator;
    }
    public String[] getHeaders() {
        return headers;
    }
    public void setHeaders(String[] headers) {
        this.headers = headers;
    }
    public CSVHelper() {}
    public CSVHelper(String[] x) {
        this.setHeaders(x);
    }
    public CSVHelper(String[] x,char y){
        this.setHeaders(x);
        this.setSeperator(y);
    }              /**现在使用的CSVHelper构造器，x代表表头，y代表分隔符*/
/**
 * 读取CVS文件
 *
 * @param path
 * @param skipHeaders
 * @return List<String[]> 将读到的数据以字符串数组的方式存在链表里
 */

    public List<String[]> readCSV(String path, boolean skipHeaders) {
        List<String[]> result = new LinkedList<>();

        try {			// 第一参数：读取文件的路径; 第二个参数：分隔符; 第三个参数：字符集
             CsvReader csvReader = new CsvReader(path, seperator, Charset.forName("UTF-8"));
            // 是否跳过标题
            if (!skipHeaders) {
                csvReader.readHeaders();
            } 			// 读取每行的内容
            while (csvReader.readRecord()) {
                String[] line = csvReader.getValues();
                result.add(line);
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return result;
    }
/**
 * 写入csv
 * @param path
 * @param content
 * @description 将处理好的list写进path目标文件
 */
    public void writeCSV(String path, List<String[]> content) {
        try {
            CsvWriter csvWriter = new CsvWriter(path, seperator, Charset.forName("UTF-8")); // 写表头和内容
            csvWriter.writeRecord(headers);
            for (int i = 0; i < content.size(); i++) {
                String[] line = content.get(i);
                csvWriter.writeRecord(line);
            } 			// 关闭csvWriter
            csvWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    public void writeCSV(String path,String[] content){
        try {
            CsvWriter csvWriter = new CsvWriter(path, seperator, Charset.forName("UTF-8")); // 写表头和内容
            csvWriter.writeRecord(headers);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 追加 csv
     * @param path
     * @param content
     * @description 在path目标文件末尾追加内容
     * */
    public void addCSV(String path,List<String[]> content){
        List<String[]> result = new LinkedList<>();//新建空list存放数据
        try {			// 第一参数：读取文件的路径; 第二个参数：分隔符; 第三个参数：字符集
            CsvReader csvReader = new CsvReader(path, seperator, Charset.forName("UTF-8"));
            // 跳过标题
            csvReader.readHeaders();
            while (csvReader.readRecord()) {
                String[] line = csvReader.getValues();
                result.add(line);
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        for (String[] s:content){//在result中添加新的内容
            result.add(s);
        }
        try {
            CsvWriter csvWriter = new CsvWriter(path, seperator, Charset.forName("UTF-8")); // 写表头和内容
            csvWriter.writeRecord(headers);
            for (int i = 0; i < result.size(); i++) {
                String[] line = result.get(i);
                csvWriter.writeRecord(line);
            } 			// 关闭csvWriter
            csvWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

}
