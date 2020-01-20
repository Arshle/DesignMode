/*
 * FileName: NewBookNameList.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 新的图书名称列表
 */
package com.arshle.designmode.adapter;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 〈新的图书名称列表〉<br>
 * 〈新的图书名称列表〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class NewBookNameList {
    /**
     * 图书列表
     */
    private LinkedList<String> bookList;
    /**
     * 迭代器
     */
    private Iterator<String> iterator;

    NewBookNameList(Iterator<String> iterator){
        bookList = new LinkedList<>();
        this.iterator = iterator;
    }
    /**
     * 初始化图书名称
     */
    public void setBookName(){
        while (iterator.hasNext()){
            String name = iterator.next();
            bookList.add(name);
        }
    }
    /**
     * 获取图书名称
     */
    public void getBookName(){
        Iterator<String> iter = bookList.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
    }
}
