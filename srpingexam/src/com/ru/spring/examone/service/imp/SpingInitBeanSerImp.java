package com.ru.spring.examone.service.imp;

import com.ru.spring.examone.service.SpringInitBeanSerInter;
import org.apache.log4j.Logger;

/**
 * Description:
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午9:36
 * JDK: 1.6
 * version: 1.0
 */
public class SpingInitBeanSerImp implements SpringInitBeanSerInter{

    private Logger log = Logger.getLogger(SpingInitBeanSerImp.class);
    private String testStr = "1234567890";
    public SpingInitBeanSerImp(){
        System.out.println("spring service 实例化");
        log.info("spring service 实例化");
    }

    public String getTestStr(){
        return testStr;
    }
}
