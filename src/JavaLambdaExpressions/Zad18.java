package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to check if a given number is a perfect square.
*/

import java.util.function.Predicate;

public class Zad18 {
    public static void main(String[] args) {
        int number = 16;

        Predicate<Integer> perfSquare = x -> {
            int sqrt = (int) Math.sqrt(x);
            return sqrt * sqrt == x;
        };

        boolean result = perfSquare.test(number);
        System.out.println(number + " is a perfect square?: " + result);
    }
}
