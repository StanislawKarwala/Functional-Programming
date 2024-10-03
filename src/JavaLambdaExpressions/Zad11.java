package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zad11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int max = list.stream()
                        .max(Comparator.comparingInt(a -> a))
                        .get();

        int min = list.stream()
                        .min(Comparator.comparingInt(a -> a))
                        .get();
        System.out.println("List: " + list);
        System.out.println("Maximum value of list: " + max);
        System.out.println("Minimum value of list: " + min);
    }



}
