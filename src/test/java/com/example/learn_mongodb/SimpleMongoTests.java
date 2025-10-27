package com.example.learn_mongodb;

import com.example.learn_mongodb.entity.Order;
import com.example.learn_mongodb.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleMongoTests {
    @Autowired
    private OrderRepository orderRepository;
    @Test
    public void testCreateOrder(){
        Order order= Order.builder()
                .status("READY")
                .quantity(10)
                .totalPrice(100.00)
                .build();
        order=orderRepository.insert(order);
        System.out.println(order);

    }

}
