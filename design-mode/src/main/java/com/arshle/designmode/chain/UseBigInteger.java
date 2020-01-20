/*
 * FileName: UseBigInteger.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 大数字具体处理者
 */
package com.arshle.designmode.chain;

import java.math.BigInteger;

/**
 * 〈大数字具体处理者〉<br>
 * 〈大数字具体处理者〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class UseBigInteger implements Handler {
    /**
     * 下一个处理者
     */
    private Handler handler;
    /**
     * 初始数字
     */
    private BigInteger result = new BigInteger("1");
    /**
     * 计算阶乘
     * @param number 数字
     */
    @Override
    public void compuerMultiply(String number) {
        try {
            BigInteger n = new BigInteger(number);
            BigInteger one = new BigInteger("1");
            BigInteger i = one;
            while(i.compareTo(n) <= 0){
                result = result.multiply(i);
                i = i.add(one);
            }
            System.out.println(number + "的阶乘:" + result);
        } catch (Exception e) {
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
