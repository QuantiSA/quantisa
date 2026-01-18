package org.quantisa.monolith.controller;

import org.quantisa.monolith.service.MonolithM1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monolith")
public class M1Controller {

    @Autowired
    private MonolithM1Service monolithM1Service;

    @GetMapping("/msg")
    public String getMessage() {

        return "Hello M1 Controller --> " + monolithM1Service.getMessage();
    }

}
