package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to check if a given string is empty.
*/


import java.util.function.Predicate;

public class Zad2 {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        String word = "xD";
        String word1 = "";

        System.out.println("String 1: " + word);
        System.out.println("String is empty: " + isEmpty.test(word));
        System.out.println("\nString 2: " + word1);
        System.out.println("String is empty: " + isEmpty.test(word1));
    }
}
