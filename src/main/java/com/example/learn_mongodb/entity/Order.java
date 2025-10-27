package com.example.learn_mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private Integer quantity;
    private Double totalPrice;
    private String status;

}
