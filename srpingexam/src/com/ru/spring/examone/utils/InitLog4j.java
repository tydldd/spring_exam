package com.ru.spring.examone.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description:
 * User: NanChengRu
 * Date: 13-11-24
 * Time: 下午5:38
 * JDK: 1.6
 * version: 1.0
 */
public class InitLog4j implements Servlet{

    private Logger log = Logger.getLogger(InitLog4j.class);
    /**
     * 初始化log4j
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        String log4jPath = InitLog4j.class.getResource("/resources/config/log4j.properties").getPath();
        PropertyConfigurator.configure(log4jPath);
        log.debug("log4j初始化完成！");
        log.debug("log4j路径:" + log4jPath);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getServletInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void destroy() {
        log.debug("log4j被销毁！");
    }
}
