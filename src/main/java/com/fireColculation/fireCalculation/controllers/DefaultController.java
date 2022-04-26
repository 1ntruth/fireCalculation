package com.fireColculation.fireCalculation.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class DefaultController {

    @GetMapping("/health")
    public String health() {
        return "health";
    }
}
