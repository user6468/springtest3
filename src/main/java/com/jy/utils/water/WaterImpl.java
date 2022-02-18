package com.jy.utils.water;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class WaterImpl implements Water {
    private String name;
    private Integer count;

    public void Introduce() {
        System.out.println("这是什么饮料？");
    }

}
