package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/")
    public Customer saveData(@RequestBody Customer customer){
        return customerServiceImpl.saveData(customer);
    }

    @GetMapping("/{customerId}")
    public RestTemplateVO getDataById(@PathVariable int customerId){
        return customerServiceImpl.getDataById(customerId);
    }
}
