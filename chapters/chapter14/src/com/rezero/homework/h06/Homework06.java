package com.rezero.homework.h06;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);//删除失败
        System.out.println(set);//BB-1002, CC-1001
        set.add(new Person(1001, "CC"));
        System.out.println(set);//BB-1002, CC-1001, CC-1001
        set.add(new Person(1001,"AA"));
        System.out.println(set);//BB-1002, CC-1001, CC-1001, AA-1001
    }
}
class Person{
    public String name;
    public int id;

    @Override
    public String toString() {
        return name + "-" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
