/*
 * FileName: StrategyTwo.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 加密策略2
 */
package com.arshle.designmode.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 〈加密策略2〉<br>
 * 〈加密策略2〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class StrategyTwo implements EncryptStrategy {
    /**
     * 加密密码
     */
    String password;

    StrategyTwo(){
        this.password = "I love this game";
    }

    StrategyTwo(String password){
        if(password.length() == 0){
            this.password = "I love this game";
        }
        this.password = password;
    }
    /**
     * 加密文件
     * 加密算法如下:
     * 使用一个字符串做密码,比如password,将password编码到一个字节数:
     * byte[] p = password.getBytes();
     * 假设p的长度为n,那么就将文件的内容按顺序以n字节为一组(最后一组中的字节个数可小于n),
     * 对每一组中的字节,用数组p的对应字节做异或运算。
     * 比如,某一组中的n字节是a0a1...an-1,那么对该组字节的加密结果c0c1...cn-1是:
     * c0 = (byte)(a0 ^ p[0])
     * c1 = (byte)(a1 ^ p[1])
     * ...
     * cn-1 = (byte)(an-1 ^ p[n - 1])
     * @param file 文件
     */
    @Override
    public void encryptFile(File file) {
        try {
            byte[] a = password.getBytes();
            FileInputStream in = new FileInputStream(file);
            long length = file.length();
            byte[] c = new byte[(int) length];
            int m = in.read(c);
            for(int k = 0; k < m; k++){
                int n = c[k] ^ a[k % a.length];
                c[k] = (byte) n;
            }
            in.close();
            FileOutputStream out = new FileOutputStream(file);
            out.write(c, 0, m);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 解密文件
     * 解密算法为对密文做异或运算
     * @param file 文件
     * @return 解密后的文件
     */
    @Override
    public String decryptFile(File file) {
        try {
            byte[] a = password.getBytes();
            long length = file.length();
            FileInputStream in = new FileInputStream(file);
            byte[] c = new byte[(int) length];
            int m = in.read(c);
            for(int k = 0; k < m; k++){
                int n = c[k] ^ a[k % a.length];
                c[k] = (byte) n;
            }
            in.close();
            return new String(c, 0, m);
        } catch (IOException e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}
