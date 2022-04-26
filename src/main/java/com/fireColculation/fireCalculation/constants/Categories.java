package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Константы категорий Пожарной нагрузки помещений
 */
@Getter
@AllArgsConstructor
public enum Categories {

    B1("B1", 1L, 1L, 180L),
    B2("B2", 2L, 181L, 1400L),
    B3("B3", 3L, 1401L, 2200L),
    B4("B4", 4L, 2201L, 99999L);

    private final String name;

    private final Long code;

    private Long min;

    private Long max;
}
