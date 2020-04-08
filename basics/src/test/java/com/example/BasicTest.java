package com.example;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class BasicTest {
    @Test
    public void testStringToInteger() {
        Integer num = Integer.valueOf("123");
        System.out.println(num);
    }

    @Test
    public void testUUID() {
        for (int i = 0; i < 3; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }
}
