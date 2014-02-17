package com.ru.spring.examone.entry;

import org.apache.log4j.Logger;

import java.util.*;

/**
 * Description: student的实体类
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午5:10
 * JDK: 1.6
 * version: 1.0
 */
public class Student {
    Logger log = Logger.getLogger(Student.class);
    private String name;
    private int age;
    private Date date;
    private String[] array;
    private List<String> list;
    private Set set;
    private Map<String, String> map;
    private Properties properties;


    /**
     * 默认构造函数，spring使用它初始化bean
     */
    public Student(){
        System.out.println("Student对象使用spring初始化！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
