/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 应用程序
 */
package com.arshle.designmode.chain;

/**
 * 〈应用程序〉<br>
 * 〈应用程序〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Application {
    /**
     * 不同的具体处理者
     */
    private Handler useInt, useLong, useBig;
    /**
     * 创建责任链
     */
    public void createChain(){
        useInt = new UseInt();
        useLong = new UseLong();
        useBig = new UseBigInteger();
        useInt.setNextHandler(useLong);
        useLong.setNextHandler(useBig);
    }
    /**
     * 处理客户端请求
     * @param number 数字
     */
    public void responseClient(String number){
        useInt.compuerMultiply(number);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createChain();
        application.responseClient("32");
    }
}
