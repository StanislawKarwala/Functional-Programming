package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to count words in a sentence.
*/

import java.util.function.Function;

public class Zad13 {
    public static void main(String[] args) {
        String sentence = "XDD AD dsada ssss s";
        System.out.println("Original sentence: " + sentence);

        Function<String, Integer> wordCount = s -> s.split("\\s+").length;
        int counter = wordCount.apply(sentence);
        System.out.println("Words count: " + counter);
    }
}