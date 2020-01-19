/*
 * FileName: Machine.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 小电器类
 */
package com.arshle.designmode.command.machine;

import com.arshle.designmode.command.entity.Camera;
import com.arshle.designmode.command.entity.Light;
import com.arshle.designmode.command.impl.OffCameraCommand;
import com.arshle.designmode.command.impl.OffLightCommand;
import com.arshle.designmode.command.impl.OnCameraCommand;
import com.arshle.designmode.command.impl.OnLightCommand;
import com.arshle.designmode.command.invoke.Invoke;
import javax.swing.*;
import java.awt.*;

/**
 * 〈小电器类〉<br>
 * 〈小电器类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Machine extends JFrame {
    /**
     * 序列化编号
     */
    private static final long serialVersionUID = -203359306050016017L;
    /**
     * 控制摄像头和照明灯的请求者
     */
    private Invoke requestOnCamera, requestOffCamera,requestOnLight,requestOffLight;
    /**
     * 摄像头
     */
    private Camera camera;
    /**
     * 照明灯
     */
    private Light light;

    private Machine(){
        //设置窗口标题
        setTitle("小电器");
        //控制摄像头请求
        camera = new Camera();
        requestOnCamera = new Invoke();
        requestOffCamera = new Invoke();
        //设置命令
        requestOnCamera.setCommand(new OnCameraCommand(camera));
        requestOffCamera.setCommand(new OffCameraCommand(camera));
        //控制照明灯请求
        light = new Light();
        requestOnLight = new Invoke();
        requestOffLight = new Invoke();
        //设置命令
        requestOnLight.setCommand(new OnLightCommand(light));
        requestOffLight.setCommand(new OffLightCommand(light));
        //初始化组件位置
        initPosition();
        setSize(1000, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    /**
     * 初始化组件位置
     */
    private void initPosition(){
        //按钮放在南边
        JPanel pSourth = new JPanel();
        pSourth.add(requestOnCamera.getButton());
        pSourth.add(requestOffCamera.getButton());
        pSourth.add(requestOnLight.getButton());
        pSourth.add(requestOffLight.getButton());
        add(pSourth, BorderLayout.SOUTH);
        //照明灯放在北边
        JPanel pNorth = new JPanel();
        pNorth.add(light);
        add(pNorth, BorderLayout.NORTH);
        //摄像头放在中间
        JPanel pCenter = new JPanel();
        pCenter.setBackground(Color.white);
        pCenter.add(camera);
        add(pCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Machine();
    }
}
