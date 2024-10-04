package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
*/

import java.util.function.Function;

public class Zad25 {
    public static void main(String[] args) {
        int number = 9;

        Function<Integer, String> toBinary = num -> Integer.toBinaryString(num);

        System.out.println("The binary equivalent of a number " + number + " is: " + toBinary.apply(number));
    }
}
