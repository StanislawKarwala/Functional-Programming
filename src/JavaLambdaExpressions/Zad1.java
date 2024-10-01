package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to find the sum of two integers.
*/

interface Sum{
    int add(int a, int b);
}

public class Zad1 {
    public static void main(String[] args) {
        Sum sum = (x, y) -> x + y;

        int result = sum.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}
