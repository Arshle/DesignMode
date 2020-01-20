/*
 * FileName: Handler.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 处理者接口
 */
package com.arshle.designmode.chain;

/**
 * 〈处理者接口〉<br>
 * 〈处理者接口〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public interface Handler {
    /**
     * 计算阶乘
     * @param number 数字
     */
    void compuerMultiply(String number);
    /**
     * 设置下一个处理者
     * @param handler 下一个处理者
     */
    void setNextHandler(Handler handler);
}
