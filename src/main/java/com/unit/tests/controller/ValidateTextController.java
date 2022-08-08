package com.unit.tests.controller;

import com.unit.tests.service.HandleTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class ValidateTextController {

    @Autowired
    private HandleTextService handleTextService;

    @GetMapping("/number/name/chars")
    public String calcCharNumbers(@RequestParam String text) {
        return handleTextService.numberOfChars(text);
    }

    @GetMapping("/random/number")
    public String getRandomNumber(@RequestParam String name) {
        return handleTextService.getRandomNumber(name);
    }

}
