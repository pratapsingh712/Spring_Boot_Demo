package com.raghav.SpringBootDemo.service;

import com.raghav.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap){
        System.out.println("method called:");
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
