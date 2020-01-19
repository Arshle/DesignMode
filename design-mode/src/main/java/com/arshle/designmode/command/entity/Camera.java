/*
 * FileName: Camera.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 摄像头类
 */
package com.arshle.designmode.command.entity;

import javax.swing.*;

/**
 * 〈摄像头类〉<br>
 * 〈摄像头类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Camera extends JPanel {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = -1506725087214487604L;
    /**
     * 摄像头名称
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

    public Camera(){
        label = new JLabel("我是摄像头");
        add(label);
    }
    /**
     * 打开摄像头
     */
    public void on(){
        label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("img/cameraOpen.jpg").getPath()));
    }
    /**
     * 关闭摄像头
     */
    public void off(){
        label.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("img/cameraClosed.jpg").getPath()));
    }
}
