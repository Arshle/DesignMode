/*
 * FileName: Command.java
 * Author:   Arshle
 * Date:     2020年01月19日
 * Description: 命令接口
 */
package com.arshle.designmode.command.intf;

/**
 * 〈命令接口〉<br>
 * 〈命令接口〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();
    /**
     * 获取名称
     * @return 名称
     */
    String getName();
}
