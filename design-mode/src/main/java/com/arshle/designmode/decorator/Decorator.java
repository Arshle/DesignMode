/*
 * FileName: Decorator.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 装饰器
 */
package com.arshle.designmode.decorator;

/**
 * 〈装饰器〉<br>
 * 〈装饰器〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public abstract class Decorator extends ReadWord {
    /**
     * 读取单词抽象组件引用
     */
    ReadWord reader;

    public Decorator(){

    }

    Decorator(ReadWord reader){
        this.reader = reader;
    }
}
