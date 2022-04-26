package com.fireColculation.fireCalculation.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Класс-сущность, принимающая основные параметры расчета
 */
@Getter
@RequiredArgsConstructor
public class Material {

    private String name;
    private Double heatConduction;
    private Long weight;
    private Long square;

}
