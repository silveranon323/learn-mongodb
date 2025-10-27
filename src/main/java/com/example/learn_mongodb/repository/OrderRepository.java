package com.example.learn_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.learn_mongodb.entity.Order;
public interface OrderRepository extends MongoRepository<Order,String> {

}
