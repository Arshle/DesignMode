/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 应用程序
 */
package com.arshle.designmode.adapter;

import java.util.Enumeration;

/**
 * 〈应用程序〉<br>
 * 〈应用程序〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class Application {

    public static void main(String[] args) {
        BookNameList oldBookList = new BookNameList();
        oldBookList.setBookName();
        Enumeration<String> bookenum = oldBookList.getEnumeration();
        IteratorAdapter adapter = new IteratorAdapter(bookenum);
        NewBookNameList newBookList = new NewBookNameList(adapter);
        newBookList.setBookName();
        System.out.println("导入到新系统中的图书列表:");
        newBookList.getBookName();
    }
}
