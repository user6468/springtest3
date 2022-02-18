package com.jy.utils.drinking;

import com.jy.utils.water.Water;
import lombok.Data;

@Data
public class PersonServiceImpl implements PersonService {
    Water getCola;
    Water getOrange;

    public void drinkwater() {
        System.out.println("喝饮料");
    }

    public Water getGetCola(){
        return getCola;
    }

    public Water getGetOrange(){
        return getOrange;
    }

}
