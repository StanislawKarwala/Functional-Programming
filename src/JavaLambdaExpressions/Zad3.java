package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
*/

import java.util.Arrays;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Noob", "nobody", "KRAKOW");

        System.out.println("String list: ");
        list.forEach(System.out::println);

        list.replaceAll(str -> str.toLowerCase());
        System.out.println("\nLowercase list:");
        list.forEach(System.out::println);

        list.replaceAll(str -> str.toUpperCase());
        System.out.println("\nUppercase list:");
        list.forEach(System.out::println);
    }
}
