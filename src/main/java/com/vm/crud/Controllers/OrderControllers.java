package com.vm.crud.Controllers;

import com.vm.crud.Services.OrderService;
import com.vm.crud.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrderControllers {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @PostMapping
    public Order creatOrder(@RequestBody Order order) {
        return orderService.creatOrder(order);
    }
}
