/*
 * FileName: BookNameList.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 图书名称列表
 */
package com.arshle.designmode.adapter;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 〈图书名称列表〉<br>
 * 〈图书名称列表〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class BookNameList {
    /**
     * 图书列表
     */
    private Vector<String> vector;
    /**
     * 枚举器
     */
    private Enumeration<String> bookenum;

    BookNameList(){
        vector = new Vector<>();
    }
    /**
     * 初始化图书列表名称
     * 真实系统可能从一个数据库中得到图书名称
     */
    public void setBookName(){
        vector.add("Java 程序设计");
        vector.add("J2ME 程序设计");
        vector.add("XML 程序设计");
        vector.add("JSP 程序设计");
    }
    /**
     * 获取枚举器
     * @return 枚举器
     */
    public Enumeration<String> getEnumeration(){
        return vector.elements();
    }
}
