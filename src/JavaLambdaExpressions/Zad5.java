package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
*/

import java.util.Arrays;
import java.util.List;

public class Zad5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Agrest", "Pork", "Anastazja", "Zlom");

        System.out.println("List: ");
        for(String str : list){
            System.out.print(str + " ");
        }

        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("\nSorted list: ");
        for(String str : list){
            System.out.print(str + " ");
        }
    }
}
