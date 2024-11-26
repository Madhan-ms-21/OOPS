package org.self.oops.Collections.Maps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);

    }

    public int hashCode(){
        return Objects.hash(id, name, age);
    }

}
