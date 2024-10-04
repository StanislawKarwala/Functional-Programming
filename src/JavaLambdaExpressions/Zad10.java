package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to concatenate two strings
*/

import java.util.function.BiFunction;

public class Zad10 {
    public static void main(String[] args) {
        String a = "Noob";
        String b = "Nobody";

        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

        System.out.println("Original strings: " + a + ", " + b);
        System.out.println("Concatenated strings: " + concatenate.apply(a, b));
    }
}
