package com.jy.utils.water.subclass;

import com.jy.utils.water.WaterImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orange extends WaterImpl {
    private String name;
    private Integer count;

    @Override
    public void Introduce() {
        System.out.println("果粒多橙汁");
    }

}
