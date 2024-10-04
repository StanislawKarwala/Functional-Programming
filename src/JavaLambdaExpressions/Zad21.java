package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
*/

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Zad21 {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;

        IntPredicate isPrime = num -> {
            if(num <= 1) return false;
            return IntStream.range(2, (int) Math.sqrt(num) + 1)
                    .noneMatch(i -> num % i == 0);
        };

        int sumOfPrimes = IntStream.rangeClosed(start, end)
                .filter(isPrime)
                .sum();

        System.out.println("Sum prime numbers from " + start + " to " + end + " is: " + sumOfPrimes);
    }
}
