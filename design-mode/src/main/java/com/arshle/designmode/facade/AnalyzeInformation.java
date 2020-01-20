/*
 * FileName: AnalyzeInformation.java
 * Author:   Arshle
 * Date:     2020年01月20日
 * Description: 分析文本信息子系统
 */
package com.arshle.designmode.facade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 〈分析文本信息子系统〉<br>
 * 〈分析文本信息,去除用户不需要的部分〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class AnalyzeInformation {
    /**
     * 获取保留的文本
     * @param content 文本
     * @param deleteContent 删除的文本
     * @return 保留的文本
     */
    public String getSavedContent(String content, String deleteContent){
        Pattern p = Pattern.compile(deleteContent);
        Matcher m = p.matcher(content);
        return m.replaceAll("");
    }
}
