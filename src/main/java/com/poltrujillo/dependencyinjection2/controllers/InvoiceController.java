package com.poltrujillo.dependencyinjection2.controllers;

import com.poltrujillo.dependencyinjection2.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private Invoice invoice;
    @GetMapping("/show")
    public Invoice show() {
        return invoice;
    }
}
