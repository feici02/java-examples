package com.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
    @Test
    public void testMap() {
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
