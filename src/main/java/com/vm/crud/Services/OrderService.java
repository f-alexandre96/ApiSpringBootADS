package com.vm.crud.Services;

import com.vm.crud.models.Order;
import com.vm.crud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
   private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order creatOrder(Order order){
        return orderRepository.save(order);
    }

}
