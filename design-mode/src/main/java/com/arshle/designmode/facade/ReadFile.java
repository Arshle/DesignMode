/*
 * FileName: ReadFile.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 读取文件子系统
 */
package com.arshle.designmode.facade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 〈读取文件子系统〉<br>
 * 〈读取文件子系统〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ReadFile {
    /**
     * 读取文件的文本内容
     * @param fileName 文件名
     * @return 文本内容
     */
    public String readFileContent(String fileName){
        StringBuilder str = new StringBuilder();
        try {
            FileReader inOne = new FileReader(fileName);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s;
            while((s = inTwo.readLine()) != null){
                str.append(s);
                str.append("\n");
            }
            inOne.close();
            inTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(str);
    }
}
