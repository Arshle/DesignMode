/*
 * FileName: EncodeContext.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 编码上下文
 */
package com.arshle.designmode.strategy;

import java.io.File;

/**
 * 〈编码上下文〉<br>
 * 〈编码上下文〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class EncodeContext {
    /**
     * 加密策略
     */
    EncryptStrategy strategy;

    public void setStrategy(EncryptStrategy strategy){
        this.strategy = strategy;
    }
    /**
     * 加密文件
     * @param file 文件
     */
    public void encryptFile(File file){
        strategy.encryptFile(file);
    }
    /**
     * 解密文件
     * @param file 文件
     * @return 解密后的文件
     */
    public String decryptFile(File file){
        return strategy.decryptFile(file);
    }
}
