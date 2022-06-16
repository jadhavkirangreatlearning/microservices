package com.csi.service;

import com.csi.dao.OrderDetailDaoImpl;
import com.csi.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailServiceImpl {

    @Autowired
    OrderDetailDaoImpl orderDetailDaoImpl;


    public OrderDetail saveData(OrderDetail orderDetail) {
        return orderDetailDaoImpl.saveData(orderDetail);
    }

    public Optional<OrderDetail> getDataById(int orderDetailId) {
        return orderDetailDaoImpl.getDataById(orderDetailId);
    }
}
