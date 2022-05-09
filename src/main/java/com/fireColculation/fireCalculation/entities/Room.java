package com.fireColculation.fireCalculation.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Room {

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
}
