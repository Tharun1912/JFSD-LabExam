package com.klef.jfsd;


import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
