/*
 * FileName: WordDecorator.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 读取单词具体装饰器
 */
package com.arshle.designmode.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 〈读取单词具体装饰器〉<br>
 * 〈读取单词具体装饰器〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class WordDecorator extends Decorator {
    /**
     * 装饰文件
     */
    private File decoratorFile;

    WordDecorator(ReadWord reader, File decoratorFile){
        super(reader);
        this.decoratorFile = decoratorFile;
    }
    /**
     * 读取英文单词
     * @param file 文件
     * @return 单词列表
     */
    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String> wordList = reader.readWord(file);
        try{
            FileReader inOne = new FileReader(decoratorFile);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s;
            int m = 0;
            while((s = inTwo.readLine()) != null){
                String word = wordList.get(m);
                word = word.concat(" | " + s);
                wordList.set(m, word);
                m ++;
                if(m > wordList.size()){
                    break;
                }
            }
            inTwo.close();
            inOne.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return wordList;
    }
}
