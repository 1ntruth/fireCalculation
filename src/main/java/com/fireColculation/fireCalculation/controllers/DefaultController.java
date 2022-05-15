package com.fireColculation.fireCalculation.controllers;

import com.fireColculation.fireCalculation.constants.MaterialConstant;
import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.services.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

import static com.fireColculation.fireCalculation.utils.messages.ErrorMessages.CALCULATE_RESULT_ERROR;


@Slf4j
@RequiredArgsConstructor
@Controller
public class DefaultController {

    private final CalculatorService calculatorService;

    @PostMapping("/result")
    public String result(@ModelAttribute InputFormDto inputFormDto, Model model) {
        var result = calculatorService.startCalculate(inputFormDto);
        if (Objects.equals(CALCULATE_RESULT_ERROR.getMessage(), result) || Objects.isNull(inputFormDto)) {
            model.addAttribute("errorMessage", CALCULATE_RESULT_ERROR.getMessage());
            return "errorPage";
        }

        model.addAttribute("inputFormDto", inputFormDto);
        model.addAttribute("resultCategory", result);
        return "result";
    }

    @GetMapping("")
    public String calculatorForm() {
        return "main";
    }

    @GetMapping("/inputForm")
    public String calulateData(Model model) {
        model.addAttribute("materials", MaterialConstant.getAllMaterials());
        model.addAttribute("inputFormDto", InputFormDto.builder().build());
        return "inputForm";
    }
}