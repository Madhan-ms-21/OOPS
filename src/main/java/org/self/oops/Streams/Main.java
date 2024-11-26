package org.self.oops.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//      1. Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.sort((a,b) -> b.compareTo(a));
        System.out.println(numbers);
        numbers.forEach(num -> System.out.print(num*num + " "));
        System.out.println();
//        2. Find below a list of integers. Iterate over it and print every even number.
        numbers.forEach(num -> {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        });
        Predicate<Integer> isEven = number -> number % 2 == 0;

//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        For a list of integers, return a list of the squares of each number.
        System.out.println();
        List<Integer> sq =  numbers.stream().map(t -> t * t).toList();
        System.out.println(sq);

//        For a list of strings, return a list of the length of each string.
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> c = names.stream().map(String::length).toList();
        System.out.println(c);

//        For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
        List<String> names2 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> c2 = names2.stream().filter(t -> !t.startsWith("T")).toList();

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("T"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(c2 + " -- " +filteredNames);

//        For a list of strings, filter out the strings which do not start with the letter T, then uppercase the remaining strings and then sort them.
        List<String> c3 = names2.stream().filter(t -> !t.startsWith("T")).map(String::toUpperCase).sorted().toList();
        System.out.println(c3);

//        For a list of integers, find the sum of all the numbers.
        int sum = numbers.stream().mapToInt(t -> t).sum();
        System.out.println("sum : " + sum);
//        For a list of integers, find the sum of the squares of all the numbers.
        int sqsum = numbers.stream().map(t->t*t).reduce(0, Integer::sum);
        System.out.println("square sum : " + sqsum);
//        For a list of integers, find the sum of the squares of all the even numbers.
        int evensum = numbers.stream().filter(t->t%2 == 0).mapToInt(t->t*t).sum(); //reduce(0, Integer::sum);
        System.out.println("evensum : " + evensum);
//        Given a list of numbers, find the maximum number in the list.
        Optional<Integer> max = numbers.stream().reduce((num1, num2)->num1>num2?num1:num2);
        System.out.println("max : " + max.get());

//        Given a list of numbers with duplicates, find the distinct numbers in the list.
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> dis = numbers1.stream().distinct().toList();
        System.out.println("distinct ele : " + dis);

//        Given a list of numbers, find the average of all the numbers.
        int avg = numbers.stream()
                        .reduce(0, (a,b)->a+b)/numbers.size();
        System.out.println("average : " + avg);

//        Give a list of strings, find the average length of all the strings.
        Object avgsize = names.stream().map(t->t.length()).mapToInt(Integer::intValue).average();
        System.out.println("average size : " + avgsize);

//        Given a list of strings, find the first string that is longer than 10 characters.
        String s = names.stream().filter(t->t.length()>10).findFirst().get();
        System.out.println("First str > 10chars : " + s);




    }

}
