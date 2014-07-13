package com.ru.spring.examone.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: 初始化spring容器。这个容器是重量级的，只需要初始化一个new ClassPathXmlApplicationContext("")。
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午5:57
 * JDK: 1.6
 * version: 1.0
 */
public class InitSpring {

    public InitSpring(){
        System.out.println("使用无参构造函数初始化");
    }

    public static class InnerClass{
        private static ApplicationContext context =
                new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return InnerClass.context;
    }
}
