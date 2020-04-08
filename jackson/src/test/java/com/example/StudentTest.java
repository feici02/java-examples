package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void test1() throws JsonProcessingException {
        Student student = new Student(1, "harry", "potter");
        String json = objectMapper.writeValueAsString(student);
        System.out.println(json);
    }

}