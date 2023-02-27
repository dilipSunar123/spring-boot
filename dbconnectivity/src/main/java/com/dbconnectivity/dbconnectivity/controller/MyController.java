package com.dbconnectivity.dbconnectivity.controller;

import com.dbconnectivity.dbconnectivity.dou.MyDou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements CommandLineRunner {

    @Autowired
    MyDou myDou;

    @Override
    public void run(String... args) throws Exception {
        this.myDou.insertValue(3, "Vicky");
    }
}
