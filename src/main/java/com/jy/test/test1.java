package com.jy.test;

import com.jy.utils.water.Water;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Water water = (Water) applicationContext.getBean("getOrange");
        System.out.println(water);


    }
}
