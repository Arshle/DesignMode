/*
 * FileName: IteratorAdapter.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 迭代器适配器
 */
package com.arshle.designmode.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 〈迭代器适配器〉<br>
 * 〈迭代器适配器〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class IteratorAdapter implements Iterator<String> {
    /**
     * 枚举器
     */
    private Enumeration<String> bookenum;

    IteratorAdapter(Enumeration<String> bookenum){
        this.bookenum = bookenum;
    }
    /**
     * 是否有下一个元素
     * @return 是否
     */
    @Override
    public boolean hasNext() {
        return bookenum.hasMoreElements();
    }
    /**
     * 下一个元素
     * @return 下一个元素
     */
    @Override
    public String next() {
        return bookenum.nextElement();
    }
    /**
     * 删除元素
     */
    @Override
    public void remove() {
        System.out.println("枚举器没有删除集合元素的方法");
    }
}
