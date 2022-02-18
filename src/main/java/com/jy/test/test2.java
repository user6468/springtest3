package com.jy.test;

import com.jy.utils.water.Count;
import com.jy.utils.water.Water;
import com.jy.utils.water.WaterImpl;
import com.jy.utils.water.subclass.Cola;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Count count = (Count)applicationContext.getBean("count");

        Cola cola3 = (Cola) applicationContext.getBean("getCola");
        WaterImpl cola4 = (WaterImpl) applicationContext.getBean("getCola");
        count.CountWater(cola3,100);
        count.CountWater(cola3,1000);
        count.CountWater(cola4,100);

        WaterImpl orange = (WaterImpl) applicationContext.getBean("getOrange");
        WaterImpl orange1 = (WaterImpl) applicationContext.getBean("getOrange");
        count.CountWater(orange,400);
        count.CountWater(orange1,900);

//        Cola cola1 = (Cola) applicationContext.getBean("cola");
//        WaterImpl cola2 = (WaterImpl) applicationContext.getBean("cola");
//
//        count.CountWater(cola1,100);
//        count.CountWater(cola1,1000);
//        count.CountWater(cola2,100);


    }
}
