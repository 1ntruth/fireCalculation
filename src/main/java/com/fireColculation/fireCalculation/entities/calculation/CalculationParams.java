package com.fireColculation.fireCalculation.entities.calculation;

import com.fireColculation.fireCalculation.entities.Material;
import com.fireColculation.fireCalculation.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Класс-сущность, принимающая основные параметры расчета
 */
@Getter
@Setter
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalculationParams {

    /**
     * Параметры помещения
     */
    private Room room;

    /**
     * Расстояние от поверхности нагрузки до нижнего пояса ферм (балок) или перекрытия
     */
    private Long rangeToLoadSurface;


    public Long methodCalculate(Material materials, Long fireLoadSquare){
        return 1232L;
    }
}
