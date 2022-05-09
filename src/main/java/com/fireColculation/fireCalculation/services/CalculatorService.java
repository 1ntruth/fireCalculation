package com.fireColculation.fireCalculation.services;

import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.entities.Room;
import com.fireColculation.fireCalculation.entities.calculation.CalculationParams;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalculatorService {

    private CalculationParams calculationParams;

    @Nullable
    public void setCalculatorParamsFromDto(InputFormDto inputFormDto) {
        this.calculationParams = CalculationParams.builder()
                .room(Room.builder()
                        .roomName(Optional.ofNullable(inputFormDto)
                                .map(InputFormDto::getRoomName)
                                .orElse(null))
                        .roomHeight(Optional.ofNullable(inputFormDto)
                                .map(InputFormDto::getRoomHeight)
                                .orElse(null))
                        .roomSquare(Optional.ofNullable(inputFormDto)
                                .map(InputFormDto::getRoomSquare)
                                .orElse(null))
                        .distanceFromFireLoad(Optional.ofNullable(inputFormDto)
                                .map(InputFormDto::getDistanceFromFireLoad)
                                .orElse(null))
                        .build())
                .build();
    }
}
