package JavaLambdaExpressions;

/*
Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
*/

import java.util.Arrays;
import java.util.List;

public class Zad12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        int multiply = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("List: " + list);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Multiply of all elements: " + multiply);
    }
}
