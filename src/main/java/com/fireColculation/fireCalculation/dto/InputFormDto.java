package com.fireColculation.fireCalculation.dto;

import com.fireColculation.fireCalculation.entities.Material;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


/**
 * Транспортный обьект пожарного расчета категорий B1-B4
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class InputFormDto {

    /**
     * Название помещения
     */
    private String roomName;

    /**
     * Площадь помещения
     */
    private Double roomSquare;

    /**
     * Высота помещения
     */
    private Double roomHeight;

    /**
     * Расстояние от пожарной нагрузки до низа конструкций
     */
    private Double distanceFromFireLoad;

    /**
     * Данные о материалах (6 шт)
     */
    private Material first;
    private Material second;
    private Material third;
    private Material fourth;
    private Material fifth;
    private Material sixth;
}