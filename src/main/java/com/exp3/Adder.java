package com.exp3;

public class Adder {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integers.");
        }
    }
}
