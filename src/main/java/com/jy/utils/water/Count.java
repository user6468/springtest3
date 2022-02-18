package com.jy.utils.water;

import org.springframework.stereotype.Component;

@Component
public class Count {
    public int CountWater(WaterImpl water, Integer sum){
        Integer a = water.getCount() - sum;
        water.setCount(a);
        return a;
    }
}
