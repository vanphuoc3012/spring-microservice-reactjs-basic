package com.sha.springmicroservice2purchase.controller;

import com.sha.springmicroservice2purchase.model.Purchase;
import com.sha.springmicroservice2purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getAllPurchaseOfUser(@PathVariable(name = "userId") Long userId) {
        return new ResponseEntity<>(purchaseService.findAllPurchaseOfUser(userId), OK);
    }
}
