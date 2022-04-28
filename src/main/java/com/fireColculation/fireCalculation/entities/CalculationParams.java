package com.fireColculation.fireCalculation.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Класс-сущность, принимающая основные параметры расчета
 */
@Getter
@RequiredArgsConstructor
public class CalculationParams {

    private List<Material> materials;

    /**
     * Площадь размещения пожарной нагрузки общая
     */
    private Long fireLoadSquare;

    /**
     * Расстояние от поверхности нагрузки до нижнего пояса ферм (балок) или перекрытия
     */
    private Long rangeToLoadSurface;


    public Long methodCalculate(Material materials, Long fireLoadSquare){
        return 1232L;
    }
}
