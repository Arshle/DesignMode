/*
 * FileName: ShowWord.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 单词展示观察者类
 */
package com.arshle.designmode.observer;

import javax.swing.*;
import java.util.*;

/**
 * 〈单词展示观察者类〉<br>
 * 〈单词展示观察者类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ShowWord extends JPanel implements Observer {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 8457079725581571404L;
    /**
     * 主题
     */
    private Observable subject;
    /**
     * 文本控件
     */
    private JTextArea text;
    /**
     * 单词列表
     */
    private TreeSet<String> wordList;

    ShowWord(Observable subject){
        //设置主题并添加观察者
        this.subject = subject;
        subject.addObserver(this);
        //设置文本控件
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        add(new JScrollPane(text));
        //单词列表初始化
        wordList = new TreeSet<>();
    }
    /**
     * 通知更新
     * @param o 主题
     * @param arg 参数,这里是输入的文本字符串
     */
    @Override
    public void update(Observable o, Object arg) {
        //清空文本和单词列表
        text.setText(null);
        text.append("出现的单次有(按字典顺序): \n");
        wordList.clear();
        //找出文本中的单词
        String content = arg.toString();
        String regex = "[\\s\\d\\p{Punct}]+";
        String[] words = content.split(regex);
        Collections.addAll(wordList, words);
        //把单词拼接到文本控件中
        for (String str : wordList) {
            text.append(str + " ");
        }
    }
}
