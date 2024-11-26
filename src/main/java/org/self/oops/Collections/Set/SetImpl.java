package org.self.oops.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
//        set.iterator().forEachRemaining(System.out::print);
        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (String s : set) {
//            System.out.println(s);
//        }

        Book b1 = new Book("Vampire Dairies" , 134 , 899);
        Book b2 = new Book("Harry  Porter" , 567 , 599);
        Book b3 = new Book("The Lost Island" , 256 , 699);
        Book b4 = new Book("Harry  Porter" , 89 , 599);

        Set<Book> bookset = new HashSet<>();
        bookset.add(b1);
        bookset.add(b2);
        bookset.add(b3);
        bookset.add(b4);
        bookset.stream().forEach(System.out::println);
        bookset.iterator().forEachRemaining(System.out::println);


    }
}
