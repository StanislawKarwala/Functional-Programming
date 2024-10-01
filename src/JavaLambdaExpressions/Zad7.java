package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
*/

import java.util.Arrays;
import java.util.List;

public class Zad7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 10, 25, 10);

        System.out.println("List: ");
        for(int n : list){
            System.out.print(n + " ");
        }

        List<Integer> removedDuplicates = list.stream()
                .distinct()
                .toList();

        System.out.println("\nRemoved duplicates from list: ");
        for(int n : removedDuplicates){
            System.out.print(n + " ");
        }
    }
}
