package com.codegym.c0424m1orm.controller;

import com.codegym.c0424m1orm.model.Customer;
import com.codegym.c0424m1orm.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;  // Assuming ICustomerService is an interface with a method getAllCustomers()

    @GetMapping("")
    public String getAllCustomers() {
        List<Customer> customerList = customerService.findAll();
        return "";
    }
}
