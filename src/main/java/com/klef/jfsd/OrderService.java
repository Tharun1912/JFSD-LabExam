package com.klef.jfsd;


import org.springframework.stereotype.Service;

import com.klef.jfsd.Order;
import com.klef.jfsd.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
