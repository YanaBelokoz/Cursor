package com.example.helloworld.calculate;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static float getNumber() {
        System.out.println("Enter first number");
        float firstNumber = scanner.nextInt();
        return scanner.nextFloat();
    }
    
    public static float char getOperator () {
        System.out.println("Enter the math operand (+, -, *, /)");
    }

    public static float getNumber() {
        System.out.println("Enter second number");
        int firstNumber = scanner.nextInt();
        return scanner.nextFloat();
    }
    scanner.close();

}
