package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the average of a list of doubles.
*/

import java.util.Arrays;
import java.util.List;

public class Zad6 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.24, 1.56, 15.23, 160.1);

        System.out.println("List: ");
        for(Double db : list){
            System.out.print(db + " ");
        }

        double average = list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage of the values: " + average);
    }
}
