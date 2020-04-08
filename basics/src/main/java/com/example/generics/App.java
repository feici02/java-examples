package com.example.generics;

public class App {
    public static <K, V> void myPrint(K val1, V val2) {
        System.out.println(val1);
        System.out.println(val2);
    }

    public static void main(String[] args) {
        MyPair<Integer, String> myPair = new MyPair<>(1, "one");
        myPrint(myPair.getKey(), myPair.getValue());

        MyPair<String, Integer> myPair2 = new MyPair<>("two", 2);
        myPrint(myPair2.getKey(), myPair2.getValue());

        myPrint("hello", "world");
    }
}
