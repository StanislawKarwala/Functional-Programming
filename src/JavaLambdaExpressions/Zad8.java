package JavaLambdaExpressions;

/*
Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
*/

import java.util.function.Function;

public class Zad8 {
    public static void main(String[] args) {
        int number = 5;
        Function<Integer, Integer> factorial = n ->{
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of " + number + " is " + factorial.apply(number));

    }
}

