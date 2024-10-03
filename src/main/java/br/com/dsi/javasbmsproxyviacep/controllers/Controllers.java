package br.com.dsi.javasbmsproxyviacep.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ping")
public class Controllers {

    @RequestMapping
    public String ping() {
        return "pong";
    }

}
