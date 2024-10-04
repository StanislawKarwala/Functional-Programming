package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to check if a given string is a palindrome.
*/

import java.util.function.Predicate;

public class Zad14 {
    public static void main(String[] args) {
        String word = "abccba";
        Predicate<String> isPalindrome = a -> {
            String reverse = new StringBuilder(a).reverse().toString();
            return a.equalsIgnoreCase(reverse);
        };

        if(isPalindrome.test(word)){
            System.out.println(word + " is a palindrome");
        } else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
