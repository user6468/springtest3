package com.jy.test;

import com.jy.utils.drinking.PersonService;
import com.jy.utils.water.Water;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        PersonService personService = (PersonService) applicationContext.getBean("american");

        personService.drinkwater();
        Water water = personService.getGetOrange();
        System.out.println(water);
        water.Introduce();

    }
}
