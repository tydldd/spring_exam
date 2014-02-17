package com.ru.spring.examone.action;

import com.ru.spring.examone.entry.Student;
import com.ru.spring.examone.service.SpringInitBeanSerInter;
import com.ru.spring.examone.utils.InitSpring;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

/**
 * Description: 测试spring何时初始化bean
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午6:03
 * JDK: 1.6
 * version: 1.0
 */
public class SpringInitBeanAction {
    private Logger log = Logger.getLogger(SpringInitBeanAction.class);
    //spring注入，提供get set方法
    private SpringInitBeanSerInter springService;

    public SpringInitBeanAction(){
        System.out.println("sping action 初始化");
        log.info("sping action 初始化");
    }

    //@Log4jTest
    public void test1(){
        ApplicationContext context = InitSpring.getApplicationContext();
        Student student = (Student) context.getBean("student");
        System.out.println("name1 = " + student.getName());
    }

    public SpringInitBeanSerInter getSpringService() {
        return springService;
    }

    public void setSpringService(SpringInitBeanSerInter springService) {
        this.springService = springService;
    }
}
