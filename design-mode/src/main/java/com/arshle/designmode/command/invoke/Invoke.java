/*
 * FileName: Invoke.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 请求者类
 */
package com.arshle.designmode.command.invoke;

import com.arshle.designmode.command.intf.Command;
import javax.swing.*;

/**
 * 〈请求者类〉<br>
 * 〈请求者类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Invoke {
    /**
     * 按钮
     */
    private JButton button;
    /**
     * 命令
     */
    private Command command;

    public Invoke(){
        button = new JButton();
        button.addActionListener(e -> executeCommand());
    }
    /**
     * 设置命令
     * @param command 命令
     */
    public void setCommand(Command command){
        this.command = command;
        button.setText(command.getName());
    }

    public JButton getButton(){
        return button;
    }
    /**
     * 执行命令
     */
    private void executeCommand(){
        command.execute();
    }
}
