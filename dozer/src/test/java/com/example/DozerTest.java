package com.example;

import org.dozer.DozerBeanMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DozerTest {
    private DozerBeanMapper mapper;

    @Before
    public void before() {
        mapper = new DozerBeanMapper();
    }

    @Test
    public void test1() {
        Source source = new Source("Harry", 10);
        Dest dest = mapper.map(source, Dest.class);

        assertEquals(dest.getName(), "Harry");
        assertEquals(dest.getAge(), 10);
    }
}