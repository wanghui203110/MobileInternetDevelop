package com.itworker.test;

import com.itworker.service.AccotService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){

        // 1.加载配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 2.获取对象
        AccotService accotService = (AccotService) applicationContext.getBean("accotService");

        // 3.调用方法
        accotService.findAll();
    }
}
