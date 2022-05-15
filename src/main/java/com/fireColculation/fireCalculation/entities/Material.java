package com.fireColculation.fireCalculation.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Класс-сущность, принимающая основные параметры расчета
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@Component
@NoArgsConstructor
public class Material {

    private Integer id;
    private String name;
    private Double heatValue;
    private Double weight;
    private Double resultHeatValue;
}