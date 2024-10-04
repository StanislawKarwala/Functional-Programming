package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Zad22 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AGRES", "pork", "Anastazja", "Zlom");

        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> isMixedCase = str -> !str.equals(str.toUpperCase()) && !str.equals(str.toLowerCase());

        System.out.println("List: " + list);

        System.out.println("\nIs element uppercase?: ");
        list.forEach(str -> System.out.println(str + ": " + isUpperCase.test(str)));

        System.out.println("\nIs element lowercase?: ");
        list.forEach(str -> System.out.println(str + ": " + isLowerCase.test(str)));

        System.out.println("\nIs element mixedcase?: ");
        list.forEach(str -> System.out.println(str + ": " + isMixedCase.test(str)));
    }
}
