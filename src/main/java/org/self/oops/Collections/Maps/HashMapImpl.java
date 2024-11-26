package org.self.oops.Collections.Maps;

import java.util.*;

public class HashMapImpl {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new TreeMap<>();
        map.put(2,9);
        map.put(3,8);
        map.put(5,6);
        map.put(6,5);
        map.put(4,7);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Person, String> personMap = new HashMap<>();

        // Add entries
        Person person1 = new Person(1, "Alice", 25);
        Person person2 = new Person(2, "Bob", 30);
        Person person3 = new Person(1, "Alice", 25);
        personMap.put(person1, "Employee");
        personMap.put(person2, "Manager");
        personMap.put(person3, "Employee");

        // Retrieve values using Person objects as keys
        Person keyToLookup = new Person(1, "Alice", 25);
        String position = personMap.get(keyToLookup);

        System.out.println("Position for " + keyToLookup + ": " + position);
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
