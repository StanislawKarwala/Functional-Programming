package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
*/

import java.util.Arrays;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Integer list: ");
        for(int n : list){
            System.out.print(n + " ");
        }

        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("\nEven numbers: ");
        for(int n : evenNumbers){
            System.out.print(n + " ");
        }

        List<Integer> oddNumbers = list.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("\nOdd numbers: ");
        for(int n : oddNumbers){
            System.out.print(n + " ");
        }
    }
}
