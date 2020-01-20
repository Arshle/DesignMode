/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 应用程序
 */
package com.arshle.designmode.strategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 〈应用程序〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Application {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        File one = new File(Application.class.getClassLoader().getResource("txt/A.txt").getPath());
        File two = new File(Application.class.getClassLoader().getResource("txt/B.txt").getPath());
        EncodeContext encode = new EncodeContext();
        encode.setStrategy(new StrategyOne("你好 hello"));
        encode.encryptFile(one);
        System.out.println(one.getName() + "加密后的内容:");
        String s;
        try {
            FileReader inOne = new FileReader(one);
            BufferedReader inTwo = new BufferedReader(inOne);
            while((s = inTwo.readLine()) != null){
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = encode.decryptFile(one);
        System.out.println(one.getName() + "解密后的内容:");
        System.out.println(str);
        encode.setStrategy(new StrategyTwo("篮球 game"));
        encode.encryptFile(two);
        System.out.println("\n" + two.getName() + "加密后的内容:");
        try {
            FileReader inOne = new FileReader(two);
            BufferedReader inTwo = new BufferedReader(inOne);
            while((s = inTwo.readLine()) != null){
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        str = encode.decryptFile(two);
        System.out.println(two.getName() + "解密后的内容:");
        System.out.println(str);
    }
}
