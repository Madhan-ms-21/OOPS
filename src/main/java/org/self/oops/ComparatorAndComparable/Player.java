package org.self.oops.ComparatorAndComparable;


import lombok.Getter;

import java.util.Comparator;

@Getter
public class Player  implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int i, String john, int i1) {
        this.ranking = i;
        this.name = john;
        this.age = i1;
    }

    @Override
    public int compareTo(Player o) {
        return this.ranking - o.ranking;
    }

    // constructor, getters, setters
}
