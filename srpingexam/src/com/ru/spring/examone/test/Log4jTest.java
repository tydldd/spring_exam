package com.ru.spring.examone.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Description: 在web.xml中配置的log4j只允许通过web.xml配置的链接使用如struts和servlet。
 *          如果是单个类需要重新配置log4j配置文件
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午7:15
 * JDK: 1.6
 * version: 1.0
 */
public class Log4jTest {
    Logger log = Logger.getLogger(Log4jTest.class);

    @org.junit.Test
    public void test(){
        String log4jPath = Log4jTest.class.getResource("/resources/config/log4j.properties").getPath();
        PropertyConfigurator.configure(log4jPath);
        log.info("测试在单个类中使用log4j，需要单独配置");
    }
}
