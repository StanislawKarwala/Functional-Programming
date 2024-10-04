package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
*/

import java.util.Arrays;
import java.util.List;

public class Zad17 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Agrest", "Pork", "Anastazja1", "Zlom", "Lo");

        int maxLength = list.stream()
                .mapToInt(s -> s.length())
                .max()
                .orElse(0);

        int minLength = list.stream()
                .mapToInt(s -> s.length())
                .min()
                .orElse(0);

        System.out.println("List of elements: " + list);
        System.out.println("Length of the longest string: " + maxLength);
        System.out.println("Length of the smallest string: " + minLength);
    }
}
