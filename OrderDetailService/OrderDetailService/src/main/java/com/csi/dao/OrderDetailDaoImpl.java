package com.csi.dao;

import com.csi.model.OrderDetail;
import com.csi.repo.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderDetailDaoImpl {

    @Autowired
    OrderDetailRepo orderDetailRepoImpl;


    public OrderDetail saveData(OrderDetail orderDetail) {
        return orderDetailRepoImpl.save(orderDetail);
    }

    public Optional<OrderDetail> getDataById(int orderDetailId) {
        return orderDetailRepoImpl.findById(orderDetailId);
    }
}
