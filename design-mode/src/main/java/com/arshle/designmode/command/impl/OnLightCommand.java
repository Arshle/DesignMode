/*
 * FileName: OnLightCommand.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 打开照明灯命令实现类
 */
package com.arshle.designmode.command.impl;

import com.arshle.designmode.command.entity.Light;
import com.arshle.designmode.command.intf.Command;

/**
 * 〈打开照明灯命令实现类〉<br>
 * 〈打开照明灯命令实现类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class OnLightCommand implements Command {
    /**
     * 照明灯
     */
    private Light light;

    public OnLightCommand(Light light){
        this.light = light;
    }
    /**
     * 执行命令
     */
    @Override
    public void execute() {
        light.on();
    }
    /**
     * 获取名称
     * @return 名称
     */
    @Override
    public String getName() {
        return "打开照明灯";
    }
}
