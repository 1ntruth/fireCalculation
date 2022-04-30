package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Константы материалов, где
 * name - наименование материала
 * heatValue  - удельная теплота сгорания материала
 */
@Getter
@AllArgsConstructor
public enum Materials {


    POLISTEROL(0,"Полистерол ПСБ-С", 41.65),
    POLISTEROL1(1,"Полистерол ПСБ-С1", 1.0),
    POLISTEROL2(2,"Полистерол ПСБ-С2", 2D),
    POLISTEROL3(3,"Полистерол ПСБ-С3", 3D);

    private final Integer code;
    private final String name;
    private final Double heatValue;

    public static List<String> getAllMaterialNameList(){
        return List.of(
                POLISTEROL.getName(),
                POLISTEROL1.getName(),
                POLISTEROL2.getName(),
                POLISTEROL3.getName());
    }

    public static Map<String, Double> getAllMaterials(){
        var materials = new HashMap<String, Double>();
        materials.put(POLISTEROL.getName(), POLISTEROL.getHeatValue());
        materials.put(POLISTEROL1.getName(), POLISTEROL1.getHeatValue());
        materials.put(POLISTEROL2.getName(), POLISTEROL2.getHeatValue());
        materials.put(POLISTEROL3.getName(), POLISTEROL3.getHeatValue());
        return materials;
    }
}
