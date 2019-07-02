package com.codegym.controller;

import com.codegym.persistence.CalculatorImpl;
import com.codegym.persistence.GeneralCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CalculatorController {
    CalculatorImpl calculator = new CalculatorImpl();
    @RequestMapping(value = "/form")
    public String showProducts( Model model) {

        return "/form";
    }
    @RequestMapping(value = "result")
    public String result( @RequestParam("usd") float usd , Model model) {
        float result = calculator.conver(usd);
        model.addAttribute("result", result);
        return "/result";
    }
}
