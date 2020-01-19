/*
 * FileName: ShowDigit.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 数字展示观察者类
 */
package com.arshle.designmode.observer;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 〈数字展示观察者类〉<br>
 * 〈数字展示观察者类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ShowDigit extends JPanel implements Observer {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 5085967574241312511L;
    /**
     * 主题
     */
    private Observable subject;
    /**
     * 文本控件
     */
    private JTextArea text;
    /**
     * 数字列表
     */
    private Vector<String> vector;

    ShowDigit(Observable subject){
        //设置主题,添加观察者
        this.subject = subject;
        subject.addObserver(this);
        //设置文本控件
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(true);
        add(new JScrollPane(text));
        //数字列表初始化
        vector = new Vector<>();
    }
    /**
     * 通知更新
     * @param o 主题
     * @param arg 参数,这里是输入的文本字符串
     */
    @Override
    public void update(Observable o, Object arg) {
        //清空文本和数字列表
        text.setText(null);
        text.append("出现的数字有: \n");
        vector.removeAllElements();
        //找出文本中的数字
        String content = arg.toString();
        String regex = "\\D+";
        String[] digitWords = content.split(regex);
        //加入数字列表
        for(String word : digitWords){
            if(! vector.contains(word)){
                vector.add(word);
            }
        }
        //文本显示数字
        for (String word : vector) {
            text.append(word + " ");
        }
    }
}
