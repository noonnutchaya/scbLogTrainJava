package com.digitalacademy.loan.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/loan")
public class LoanController {

    private static final Logger log = LogManager.getLogger(LoanController.class.getName());

    @Autowired
    public LoanController() {

    }

    @GetMapping("/info/{id}")
    public HttpEntity<?> getLoanInfoCustomerId(@PathVariable Long id) {
        log.info("get loan customer by id = {}", id);
        System.out.println("get loan customer by id : " + id);

        return ResponseEntity.ok().build();
    }

}
