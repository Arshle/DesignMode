/*
 * FileName: EncryptStrategy.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 加密策略
 */
package com.arshle.designmode.strategy;

import java.io.File;

/**
 * 〈加密策略〉<br>
 * 〈加密策略〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public interface EncryptStrategy {
    /**
     * 加密文件
     * @param file 文件
     */
    void encryptFile(File file);
    /**
     * 解密文件
     * @param file 文件
     * @return 解密后的文件
     */
    String decryptFile(File file);
}
