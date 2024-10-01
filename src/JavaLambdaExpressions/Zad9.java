package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
*/

import java.util.function.Predicate;

public class Zad9 {
    public static void main(String[] args) {
        int number = 11;

        Predicate<Integer> isPrime = n ->{
            if(n <= 1){
                return false;
            }
            for(int i = 2; i < Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println("Is number " + number + " is prime?: " + isPrime.test(number));
    }
}
