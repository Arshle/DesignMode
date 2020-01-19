/*
 * FileName: OffCameraCommand.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 关闭摄像头命令实现类
 */
package com.arshle.designmode.command.impl;

import com.arshle.designmode.command.entity.Camera;
import com.arshle.designmode.command.intf.Command;

/**
 * 〈关闭摄像头命令实现类〉<br>
 * 〈关闭摄像头命令实现类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class OffCameraCommand implements Command {
    /**
     * 摄像头
     */
    private Camera camera;

    public OffCameraCommand(Camera camera){
        this.camera = camera;
    }
    /**
     * 执行命令
     */
    @Override
    public void execute() {
        camera.off();
    }
    /**
     * 获取名称
     * @return 名称
     */
    @Override
    public String getName() {
        return "关闭摄像头";
    }
}
