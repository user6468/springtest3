package com.jy.utils.drinking.subclass;

import com.jy.utils.drinking.PersonServiceImpl;
import com.jy.utils.water.Water;

public class American extends PersonServiceImpl {
    @Override
    public void drinkwater() {
        System.out.println("美国人喝饮料");
    }

    @Override
    public Water getGetCola() {
        return super.getGetCola();
    }
}
