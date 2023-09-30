package org.example;

import java.util.ArrayList;
import java.util.List;

class DirtyCode {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            numbers.add(i);
        System.out.println(numbers.get(5));
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0)
            return 0;
        else
            return a / b;
    }
}