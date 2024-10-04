package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
*/

import java.util.Arrays;
import java.util.Comparator;

public class Zad19 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 20, 10};

        Integer secondLargest = Arrays.stream(array)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer secondSmallest = Arrays.stream(array)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);

    }
}
