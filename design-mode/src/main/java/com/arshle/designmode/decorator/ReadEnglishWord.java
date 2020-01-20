/*
 * FileName: ReadEnglishWord.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 读取英文单词具体组件
 */
package com.arshle.designmode.decorator;

import java.io.*;
import java.util.ArrayList;

/**
 * 〈读取英文单词具体组件〉<br>
 * 〈读取英文单词具体组件〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ReadEnglishWord extends ReadWord {
    /**
     * 读取英文单词
     * @param file 文件
     * @return 单词列表
     */
    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String> wordList = new ArrayList<>();
        try (FileReader inOne = new FileReader(file)){
            BufferedReader inTwo = new BufferedReader(inOne);
            String s;
            while((s = inTwo.readLine()) != null){
                wordList.add(s);
            }
            inTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}
