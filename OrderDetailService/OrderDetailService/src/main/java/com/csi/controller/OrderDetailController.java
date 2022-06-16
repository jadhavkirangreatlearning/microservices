package com.csi.controller;

import com.csi.model.OrderDetail;
import com.csi.service.OrderDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController {

    @Autowired
    OrderDetailServiceImpl orderDetailServiceImpl;

    @PostMapping("/")
    public OrderDetail saveData(@RequestBody OrderDetail orderDetail){
        return orderDetailServiceImpl.saveData(orderDetail);
    }

    @GetMapping("/{orderDetailId}")
    public Optional<OrderDetail> getDataById(@PathVariable int orderDetailId){
        return orderDetailServiceImpl.getDataById(orderDetailId);
    }
}
