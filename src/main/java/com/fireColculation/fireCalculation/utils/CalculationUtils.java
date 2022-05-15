package com.fireColculation.fireCalculation.utils;


import com.fireColculation.fireCalculation.constants.CategoryConstant;
import com.fireColculation.fireCalculation.entities.Material;
import com.fireColculation.fireCalculation.repository.CalculationParams;
import lombok.experimental.UtilityClass;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

import static com.fireColculation.fireCalculation.utils.messages.ErrorMessages.CALCULATE_RESULT_ERROR;

@UtilityClass
public class CalculationUtils {

    public static String calculationB1ToB4(CalculationParams calculationParams) {
        var materialsSumHeatValue = (Double) Optional.ofNullable(calculationParams.getMaterials())
                .orElse(Collections.emptyList())
                .stream()
                .filter(material -> !Objects.isNull(material.getResultHeatValue()))
                .mapToDouble(Material::getResultHeatValue).sum();

        var categories = CategoryConstant.getListB1ToB4Categories();
        return categories
                .stream()
                .filter(x -> materialsSumHeatValue <= x.getMax())
                .filter(x -> materialsSumHeatValue >= x.getMin())
                .findFirst()
                .map(CategoryConstant::getName).orElse(CALCULATE_RESULT_ERROR.getMessage());
    }
}
