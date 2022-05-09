package com.fireColculation.fireCalculation.controllers;

import com.fireColculation.fireCalculation.constants.Materials;
import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.services.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@RequiredArgsConstructor
@Controller
public class DefaultController {

    private final CalculatorService calculatorService;

    @PostMapping("/result")
    public String result(@ModelAttribute InputFormDto inputFormDto, Model model) {
        model.addAttribute("inputFormDto", inputFormDto);
        calculatorService.setCalculatorParamsFromDto(inputFormDto);
        return "result";
    }

    @GetMapping("")
    public String main() {
        return "main";
    }

    @GetMapping("/calculatorPage")
    public String calculatorForm() {
        return "calculatorPage";
    }

    @GetMapping("/inputform")
    public String calulateData(Model model) {
        model.addAttribute("materials", Materials.getAllMaterials());
        model.addAttribute("inputFormDto", InputFormDto.builder().build());
        return "inputForm";
    }
}