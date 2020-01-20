/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 应用程序
 */
package com.arshle.designmode.decorator;

import java.io.File;
import java.util.ArrayList;

/**
 * 〈应用程序〉<br>
 * 〈应用程序〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Application {

    public static void main(String[] args) {
        ArrayList<String> wordList;
        //装饰器1读取英文单词,并加上中文解释
        ReadEnglishWord rew = new ReadEnglishWord();
        WordDecorator wd1 = new WordDecorator(rew, new File(rew.getClass().getClassLoader().getResource("txt/chinese.txt").getPath()));
        ReadWord reader = wd1;
        wordList = reader.readWord(new File(rew.getClass().getClassLoader().getResource("txt/word.txt").getPath()));
        //打印
        for(String word : wordList){
            System.out.println(word);
        }
        //装饰器2在装饰器1基础上加上英文句子解释
        reader = new WordDecorator(wd1, new File(rew.getClass().getClassLoader().getResource("txt/englishSentence.txt").getPath()));
        wordList = reader.readWord(new File(rew.getClass().getClassLoader().getResource("txt/word.txt").getPath()));
        //打印
        for(String word : wordList){
            System.out.println(word);
        }
    }
}
