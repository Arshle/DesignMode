/*
 * FileName: Application.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 应用程序
 */
package com.arshle.designmode.facade;

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
        ReadAndWriteFacad clientFacad = new ReadAndWriteFacad();
        String readFileName = Application.class.getClassLoader().getResource("html/index.html").getPath();
        String delContent = "<[^>]*>";
        String savedFileName = "/Users/arshle/Desktop/index.html";
        clientFacad.doOption(readFileName, delContent, savedFileName);
    }
}
