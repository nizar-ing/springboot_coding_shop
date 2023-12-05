package com.nizarIng.ecommerce.dto;

import com.nizarIng.ecommerce.entity.Order;
import com.nizarIng.ecommerce.entity.Address;
import com.nizarIng.ecommerce.entity.Customer;
import com.nizarIng.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
