package com.adolph.erp.buy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyController {

    @RequestMapping(value = "/buy/new")
    public String newOrder(){


        return "ppppppppppp";
    }
}
