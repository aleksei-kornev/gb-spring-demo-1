package com.geekbrains.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Can {
    @Value("10")
    public int value;

    @Override
    public String toString () {
        return "Can value: " + value;
    }
}
