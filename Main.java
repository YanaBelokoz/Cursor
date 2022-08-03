package com.example.helloworld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int result = 0;
        String action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the math operand (+, -, *, /)");
        action = scanner.next();
        System.out.println("Enter second integer number:");
        secondNumber = scanner.nextInt();
        scanner.close();

        switch (action) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            default -> System.out.println("Invalid operator");
        }
        System.out.println("Result is: " + result);
    }
}
