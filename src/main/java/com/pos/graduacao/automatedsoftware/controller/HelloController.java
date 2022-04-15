package com.pos.graduacao.automatedsoftware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/pos/graducao")
public class HelloController {

    @GetMapping("/aulas")
    public String retornaAula() {
        return "Automated Software Testing";
    }
}
