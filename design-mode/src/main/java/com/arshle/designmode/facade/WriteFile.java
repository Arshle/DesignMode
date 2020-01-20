/*
 * FileName: WriteFile.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 写文件子系统
 */
package com.arshle.designmode.facade;

import java.io.*;

/**
 * 〈写文件子系统〉<br>
 * 〈写文件子系统〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class WriteFile {
    /**
     * 写到文件
     * @param fileName 文件名
     * @param content 文本
     */
    public void writeToFile(String fileName, String content){
        StringBuilder str = new StringBuilder();
        try {
            StringReader inOne = new StringReader(content);
            BufferedReader inTwo = new BufferedReader(inOne);
            FileWriter outOne = new FileWriter(fileName);
            BufferedWriter outTwo = new BufferedWriter(outOne);
            String s;
            while((s = inTwo.readLine()) != null){
                outTwo.write(s);
                outTwo.newLine();
                outTwo.flush();
            }
            inOne.close();
            inTwo.close();
            outOne.close();
            outTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
