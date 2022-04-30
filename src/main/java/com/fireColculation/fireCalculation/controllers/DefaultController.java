package com.fireColculation.fireCalculation.controllers;

import com.fireColculation.fireCalculation.constants.Materials;
import com.fireColculation.fireCalculation.dto.InputFormDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@ComponentScan("/resource")
@RestController
public class DefaultController {

    @PostMapping("/result")
    public String health(
            @ModelAttribute InputFormDto inputFormDto) {
        System.out.println(inputFormDto.toString());
        return "result";
    }

    @GetMapping("")
    @ResponseBody
    public String main() {
        return "main";
    }

    @GetMapping("/calculatorForm")
    public String calculatorForm() {
        return "calculatorPage";
    }

    @GetMapping("/inputform")
    public String calulateData(Model model, @ModelAttribute InputFormDto inputFormDto) {
        model.addAttribute("materialNameList", Materials.getAllMaterialNameList());
        return "inputForm";
    }

    @GetMapping("/inputform/")
    public String getMaterialsNameList(Model model) {
        model.addAttribute("materials", Materials.getAllMaterialNameList());
        return "calculatorPage";//заменить на форму итогового расчета
    }

}
