package com.klef.jfsd;


import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.Order;
import com.klef.jfsd.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
