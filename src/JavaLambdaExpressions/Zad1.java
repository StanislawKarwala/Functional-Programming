package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the sum of two integers.
*/

import java.util.function.BiFunction;
import java.util.function.Function;

public class Zad1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;

        int result = sum.apply(5, 10);
        System.out.println("The sum is: " + result);
    }
}
