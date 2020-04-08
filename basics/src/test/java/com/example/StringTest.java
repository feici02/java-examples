package com.example;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {
    @Test
    public void testStringLength() {
        String name = "harry";
        assertEquals(name.length(), 5);
    }

    @Test
    public void testCompare() {
        assertTrue("abc".equalsIgnoreCase("aBc"));
    }

    @Test
    public void testEmpty() {
        String str = "";
        assertTrue(str.isEmpty());
    }

    @Test
    public void testStringAndCharSequence() {
        String name = "harry";
        name.chars().allMatch(Character::isLetter);
        CharSequence nameCS = name;
        System.out.println(name.length());
        System.out.println(nameCS.length());
    }

    @Test
    public void testNullOrEmpty() {
        assertTrue(Strings.isNullOrEmpty(null));
        assertTrue(Strings.isNullOrEmpty(""));
        assertFalse(Strings.isNullOrEmpty("Java"));
    }

    @Test
    public void testIsAlpha() {
        // Apache Commons Lang
        assertTrue(StringUtils.isAlpha("abcd"));
        assertFalse(StringUtils.isAlpha("abcd1"));

        // Java 8+
        assertTrue("abcd".chars().allMatch(Character::isAlphabetic));
        assertFalse("abcd1".chars().allMatch(Character::isAlphabetic));
    }
}
