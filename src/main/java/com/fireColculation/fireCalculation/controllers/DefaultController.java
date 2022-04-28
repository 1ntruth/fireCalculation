package com.fireColculation.fireCalculation.controllers;

import com.fireColculation.fireCalculation.constants.Materials;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class DefaultController {

    @PostMapping("/health")
    public String health() {
        return "health";
    }

    @GetMapping("")
    public String mainPage() {
        return "main";
    }

    @GetMapping("/inputform")
    public String calulateData(Model model) {
        model.addAttribute("materials", Materials.getAllMaterialNameList());
        return "inputForm";
    }

    @GetMapping("/inputform/")
    public String getMaterialsNameList(Model model) {
        model.addAttribute("materials", Materials.getAllMaterialNameList());
        return "main";//заменить на форму итогового расчета
    }
}
