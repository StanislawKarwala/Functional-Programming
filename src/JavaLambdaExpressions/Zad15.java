package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
*/

import java.util.Arrays;
import java.util.List;

public class Zad15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list: " + list);

        int sumSquaresOdd = list.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();

        int sumSquaresEven = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Sum of squares of odd numbers: " + sumSquaresOdd);
        System.out.println("Sum of squares of even numbers: " + sumSquaresEven);

    }
}
