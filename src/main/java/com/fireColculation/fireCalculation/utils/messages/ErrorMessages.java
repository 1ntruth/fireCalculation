package com.fireColculation.fireCalculation.utils.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessages {

    CALCULATE_RESULT_ERROR("Ошибка рассчета пожарной категории В1-В4");

    private String message;
}
