package org.self.oops.Collections.List;

import java.util.*;

public class ArrayListImpl {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
//        System.out.println(list);
        list.add(7);
//        System.out.println(list);
        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next()+" ");
//        }
        System.out.println();
//        for (Object o : list) {
//            System.out.print(o+" ");
//        }

//        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.push(41);
        stack.push(22);
        stack.push(30);
        stack.push(4);
        stack.push(15);
//        Collections.sort(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }



    }
}
