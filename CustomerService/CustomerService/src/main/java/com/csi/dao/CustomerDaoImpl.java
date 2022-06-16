package com.csi.dao;


import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.OrderDetail;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    RestTemplate restTemplate;

    public Customer saveData(Customer customer) {
        return customerRepoImpl.save(customer);
    }

    public RestTemplateVO getDataById(int customerId) {
        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Customer customer = customerRepoImpl.findByCustomerId(customerId);

        Product product = restTemplate.getForObject("http://ProductService/products/"+ customer.getProductId(), Product.class);

        OrderDetail orderDetail = restTemplate.getForObject("http://OrderDetailService/orderdetails/"+customer.getOrderDetailId(), OrderDetail.class);

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setProduct(product);
        restTemplateVO.setOrderDetail(orderDetail);

        return restTemplateVO;
    }
}
