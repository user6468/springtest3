package com.jy.utils.watermaching;

import com.jy.utils.water.Water;
import com.jy.utils.water.subclass.Cola;
import com.jy.utils.water.subclass.Orange;

import java.util.HashMap;
import java.util.Map;

public class WaterMachineFactory extends WaterMachine {
    private Map<Integer, Water> waterMap;

    public WaterMachineFactory(){
        waterMap = new HashMap<Integer, Water>();
        waterMap.put(1,new Cola("可乐",1000));
        waterMap.put(2,new Orange("橙汁",1000));
    }


    public Water output(Integer id) {
        return waterMap.get(id);
    }

}
