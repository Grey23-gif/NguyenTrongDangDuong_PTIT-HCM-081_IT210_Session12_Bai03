package com.example.demo.bai3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class HospitalInfo {

    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hotline;

    @PostConstruct
    public void displayInfo() {
        System.out.println("===== HOSPITAL INFORMATION =====");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hotline: " + hotline);
    }
}
