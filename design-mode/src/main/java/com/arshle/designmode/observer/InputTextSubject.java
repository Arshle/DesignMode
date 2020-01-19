/*
 * FileName: InputTextSubject.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 输入框主题类
 */
package com.arshle.designmode.observer;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.util.Observable;

/**
 * 〈输入框主题类〉<br>
 * 〈输入框主题类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class InputTextSubject extends Observable {
    /**
     * 文本内容
     */
    private String content;
    /**
     * 文本控件
     */
    private JTextArea text;

    InputTextSubject(){
        //设置文本控件
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        //为文本添加监听器
        Document document = text.getDocument();
        document.addDocumentListener(new DocumentListener() {
            /**
             * 插入更新
             * @param e 事件
             */
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }
            /**
             * 移除更新
             * @param e 事件
             */
            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }
            /**
             * 修改更新
             * @param e 事件
             */
            @Override
            public void changedUpdate(DocumentEvent e) {
                //获取文本控件中的文本
                content = text.getText();
                //调用父类主题变化,并通知观察者
                setChanged();
                notifyObservers(content);
            }
        });
    }
    /**
     * Getters
     */
    public String getContent() {
        return content;
    }

    public JTextArea getText() {
        return text;
    }
}
