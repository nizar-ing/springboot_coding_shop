package com.nizarIng.ecommerce.service;

import com.nizarIng.ecommerce.dto.Purchase;
import com.nizarIng.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
