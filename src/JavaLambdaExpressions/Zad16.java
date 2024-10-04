package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
*/

import java.util.Arrays;
import java.util.List;

public class Zad16 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Agrest", "Pork", "Anastazja", "Zlom");
        String word = "Pork123";

        if(list.contains(word)){
            System.out.println("The list contains word: " + word);
        } else{
            System.out.println("The list does not contain word: " + word);
        }
    }
}
