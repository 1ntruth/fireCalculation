package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Константы категорий Пожарной нагрузки помещений
 */
@Getter
@AllArgsConstructor
public enum CategoryConstant {

    B1("B1", 1, 2201.0, Double.MAX_VALUE),
    B2("B2", 2, 1401.0, 2200.0),
    B3("B3", 3, 181.0, 1400.0),
    B4("B4", 4, 1.0, 180.0);

    private final String name;

    private final Integer code;

    private final Double min;

    private final Double max;

    public static List<CategoryConstant> getListB1ToB4Categories() {
        return List.of(B1, B2, B3, B4);
    }

    public static CategoryConstant getCategoryById(Integer id) {
        return getListB1ToB4Categories()
                .stream()
                .filter(categoryConstant -> id.equals(categoryConstant.code))
                .collect(Collectors.toList())
                .get(0);
    }
}
