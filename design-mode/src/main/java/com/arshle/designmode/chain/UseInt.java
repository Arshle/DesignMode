/*
 * FileName: UseInt.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 整型具体处理者
 */
package com.arshle.designmode.chain;

/**
 * 〈整型具体处理者〉<br>
 * 〈整型具体处理者〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class UseInt implements Handler {
    /**
     * 下一个处理者
     */
    private Handler handler;
    /**
     * 初始数字
     */
    private int result = 1;
    /**
     * 计算阶乘
     * @param number 数字
     */
    @SuppressWarnings("Duplicates")
    @Override
    public void compuerMultiply(String number) {
        try {
            int n = Integer.parseInt(number);
            int i = 1;
            while(i <= n){
                result = result * i;
                if(result <= 0){
                    System.out.println("超出我的能力范围,我计算不了");
                    handler.compuerMultiply(number);
                    return;
                }
                i ++;
            }
            System.out.println(number + "的阶乘:" + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    /**
     * 设置下一个处理者
     * @param handler 下一个处理者
     */
    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
