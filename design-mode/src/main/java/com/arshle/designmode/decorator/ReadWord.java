/*
 * FileName: ReadWord.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 读取英文单词抽象组件
 */
package com.arshle.designmode.decorator;

import java.io.File;
import java.util.ArrayList;

/**
 * 〈读取英文单词抽象组件〉<br>
 * 〈读取英文单词抽象组件〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public abstract class ReadWord {
    /**
     * 读取文件中的英文单词
     * @param file 文件
     * @return 英文单词列表
     */
    public abstract ArrayList<String> readWord(File file);
}
