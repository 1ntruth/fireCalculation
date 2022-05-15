package com.fireColculation.fireCalculation.repository;

import com.fireColculation.fireCalculation.entities.Material;
import com.fireColculation.fireCalculation.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Класс-сущность, принимающая основные параметры расчета
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class CalculationParams {

    /**
     * Параметры помещения
     */
    private Room room;

    /**
     * Список материалов
     */
    private List<Material> materials;
}
