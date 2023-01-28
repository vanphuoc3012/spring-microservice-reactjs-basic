package com.sha.springmicroservice2purchase.service;

import com.sha.springmicroservice2purchase.model.Purchase;
import com.sha.springmicroservice2purchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private PurchaseRepository purchaseRepo;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepo.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchaseOfUser(Long userId) {
        return purchaseRepo.findAllByUserId(userId);
    }
}
