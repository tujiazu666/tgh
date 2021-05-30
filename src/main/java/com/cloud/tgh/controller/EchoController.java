package com.cloud.tgh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "服务：  " + message ;
    }
}
