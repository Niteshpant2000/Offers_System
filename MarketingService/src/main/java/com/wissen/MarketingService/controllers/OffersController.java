package com.wissen.MarketingService.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OffersController{
    @GetMapping("/drivers/{driver-id}/offers")
    public ResponseEntity<String> getOffers(@PathVariable(value="driver-id") String driverId){
        return ResponseEntity.ok("Working on Offers");
    }
}