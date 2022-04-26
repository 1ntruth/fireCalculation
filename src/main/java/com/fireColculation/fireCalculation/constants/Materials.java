package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Константы материалов, где
 * name - наименование материала
 * heatConduction  - его теплопроводность
 */
@Getter
@AllArgsConstructor
public enum Materials {


    POLISTEROL("Полистерол ПСБ-С", 41.65);

    private final String name;
    private final Double heatConduction;
}
