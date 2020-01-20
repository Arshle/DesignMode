/*
 * FileName: ReadAndWriteFacad.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 外观类
 */
package com.arshle.designmode.facade;

/**
 * 〈外观类〉<br>
 * 〈外观类〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ReadAndWriteFacad {

    private ReadFile readFile;

    private AnalyzeInformation analyzeInformation;

    private WriteFile writeFile;

    public ReadAndWriteFacad(){
        readFile = new ReadFile();
        analyzeInformation = new AnalyzeInformation();
        writeFile = new WriteFile();
    }
    /**
     * 进行文件操作
     * @param readFileName 读取文件名
     * @param delContent 删除的文本
     * @param savedFileName 保存文件名
     */
    public void doOption(String readFileName, String delContent, String savedFileName){
        String content = readFile.readFileContent(readFileName);
        System.out.println("读取文件" + readFileName + "的内容:");
        System.out.println(content);
        String savedContent = analyzeInformation.getSavedContent(content, delContent);
        writeFile.writeToFile(savedFileName, savedContent);
        System.out.println("保存到文件" + savedContent + "中的内容:");
        System.out.println(savedContent);
    }
}
