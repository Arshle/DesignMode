/*
 * FileName: Light.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 照明灯类
 */
package com.arshle.designmode.command.entity;

import javax.swing.*;

/**
 * 〈照明灯类〉<br>
 * 〈照明灯类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Light extends JPanel {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = -2049123321431840934L;
    /**
     * 名称
     */
    String name;
    /**
     * 图标
     */
    Icon imageIcon;
    /**
     * 标签
     */
    private JLabel label;

    public Light(){
        label = new JLabel("我是照明灯");
        add(label);
    }
    /**
     * 打开照明灯
     */
    public void on(){
        label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("img/lightOpen.jpg").getPath()));
    }
    /**
     * 关闭照明灯
     */
    public void off(){
        label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("img/lightClose.jpg").getPath()));
    }
}
