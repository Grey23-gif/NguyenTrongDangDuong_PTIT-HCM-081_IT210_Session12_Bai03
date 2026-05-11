package com.re.bt03.component;

import org.springframework.beans.factory.annotation.Value;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HospitalInfo {

    @Value("${hospital.name}")
    private String hospitalName;

    @PostConstruct
    public void init() {
        System.out.println("Chào mừng đến với: " + hospitalName);
    }
}