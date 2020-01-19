/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 应用类
 */
package com.arshle.designmode.observer;

import javax.swing.*;
import java.awt.*;

/**
 * 〈应用类〉<br>
 * 〈应用类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Application extends JFrame {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = 7454677857209259156L;

    private Application(){
        //主题初始化
        InputTextSubject textSubject = new InputTextSubject();
        //观察者初始化
        ShowWord observerOne = new ShowWord(textSubject);
        ShowDigit observerTwo = new ShowDigit(textSubject);
        //设置格式
        setLayout(new FlowLayout());
        add(new JScrollPane(textSubject.getText()));
        add(observerOne);
        add(observerTwo);
        setBounds(20, 20, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();
    }
}
