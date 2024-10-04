package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the average length of strings in a list.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Zad23 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AGRES", "pork", "Anastazja", "Zlom");

        double averageLength = list.stream()
                .mapToInt(str -> str.length())
                .average()
                .orElse(0);

        Function<String, Integer> elementLength = str -> str.length();
        System.out.println("List: " + list);
        System.out.println();
        list.forEach(str -> System.out.println(str + " length: " + elementLength.apply(str)));

        System.out.println("\nAverage length of strings in list: " + averageLength);
    }
}
