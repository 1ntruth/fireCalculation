package com.fireColculation.fireCalculation.services;

import com.fireColculation.fireCalculation.converters.InputFormDtoConverter;
import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.repository.CalculationParams;
import com.fireColculation.fireCalculation.utils.CalculationUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
@AllArgsConstructor
public class CalculatorService {

    private CalculationParams calculationParams;
    private InputFormDto inputFormDto;
    private InputFormDtoConverter inputFormDtoConverter;

    public String startCalculate(InputFormDto inputFormDto) {
        calculationParams = inputFormDtoConverter.convertFromDtoToCalculatorParams(inputFormDto);
        return CalculationUtils.calculationB1ToB4(calculationParams);
    }
}