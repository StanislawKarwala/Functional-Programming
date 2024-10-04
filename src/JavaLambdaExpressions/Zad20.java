package JavaLambdaExpressions;

/*
Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", age: " + age;
    }
}

public class Zad20 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", 40));
        list.add(new Person("Andrea", 20));
        list.add(new Person("Stanley", 24));
        list.add(new Person("Diana", 60));

        System.out.println("List: ");
        list.forEach(p -> System.out.println(p));

        list.sort(Comparator.comparing(p -> p.getAge()));
        System.out.println("\nList sorted by age: ");
        list.forEach(p -> System.out.println(p));

        list.sort(Comparator.comparing(p -> p.getName()));
        System.out.println("\nList sorted by name: ");
        list.forEach(p -> System.out.println(p));
    }
}
