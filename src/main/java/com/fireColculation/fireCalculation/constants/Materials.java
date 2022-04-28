package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * Константы материалов, где
 * name - наименование материала
 * heatValue  - удельная теплота сгорания материала
 */
@Getter
@AllArgsConstructor
public enum Materials {


    POLISTEROL("Полистерол ПСБ-С", 41.65),
    POLISTEROL1("Полистерол ПСБ-С1", 41.65),
    POLISTEROL2("Полистерол ПСБ-С2", 41.65),
    POLISTEROL3("Полистерол ПСБ-С3", 41.65);

    private final String name;
    private final Double heatValue;

    public static List<String> getAllMaterialNameList(){
        return List.of(
                POLISTEROL.getName(),
                POLISTEROL1.getName(),
                POLISTEROL2.getName(),
                POLISTEROL3.getName());
    }
}
