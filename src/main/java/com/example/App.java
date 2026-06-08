package com.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(getGreeting());
        System.out.println("Arguments: " + Arrays.toString(args));
    }

    public static String getGreeting() {
        return "Hello from Sample Java App!";
    }
}
