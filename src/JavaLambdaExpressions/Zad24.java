package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
*/

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Zad24 {
    public static void main(String[] args) {
        int number = 12;

        IntPredicate isPrime = num -> {
            if(num <= 1) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                    .noneMatch(i -> num % i == 0);
        };

        int largestPrimeFactor = IntStream.rangeClosed(2, number)
                .filter(i -> number % i == 0)
                .filter(isPrime)
                .max()
                .orElse(-1);

        System.out.println("Largest prime factor of number: " + number + " is: " + largestPrimeFactor);
    }
}
