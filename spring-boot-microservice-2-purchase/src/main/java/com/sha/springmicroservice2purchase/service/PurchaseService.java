package com.sha.springmicroservice2purchase.service;

import com.sha.springmicroservice2purchase.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchaseOfUser(Long userId);
}
