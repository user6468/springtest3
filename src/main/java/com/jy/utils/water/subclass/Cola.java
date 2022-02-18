package com.jy.utils.water.subclass;

import com.jy.utils.water.WaterImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cola extends WaterImpl {
    private String name;
    private Integer count;

    @Override
    public void Introduce() {
        System.out.println("可口可乐有点甜");
    }

}
