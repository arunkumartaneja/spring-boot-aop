package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.model.AppModel;
import com.example.aop.service.AppService;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/")
    public AppModel getData() {
        return appService.getData();
    }

    @RequestMapping("/name/{name}")
    public AppModel getData(@PathVariable String name) {
        return appService.getData(name);
    }

    @RequestMapping("/error-log")
    public AppModel generateError() throws Exception {
        return appService.generateError();
    }
}
