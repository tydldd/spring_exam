package com.ru.spring.examone.test;

import com.ru.spring.examone.entry.People;
import com.ru.spring.examone.entry.Student;
import com.ru.spring.examone.utils.InitSpring;
import org.springframework.context.ApplicationContext;

/**
 * Description: spring可以通过依赖注入DI初始化bean ，并给bean的属性赋值。配置文件spring-ioc.xml
 * User: NanChengRu
 * Date: 13-11-27
 * Time: 下午3:42
 * JDK: 1.6
 * version: 1.0
 */
public class IocTest {

    private static ApplicationContext context = InitSpring.getApplicationContext();

    public static void main(String[] args){
        //得到people bean
        People people = (People)context.getBean("people");
        System.out.println("people name = " + people.getName());
        //得到student bean
        Student student = (Student)context.getBean("student");

        //得到student的属性
        System.out.println("name = " + student.getName() + "  age = " + student.getAge());
        System.out.println("array[0] = " + student.getArray()[0]);
        System.out.println("list[0] = " + student.getList().get(0));
        System.out.println("set = " + student.getSet().iterator().next());
        System.out.println("map = " + student.getMap().get("姓名"));
        System.out.println("properties = " + student.getProperties().getProperty("路径"));

    }
}
