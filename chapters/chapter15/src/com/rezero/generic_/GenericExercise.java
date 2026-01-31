package com.rezero.generic_;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型方式给HashSet 放入3个学生对象
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack", 10));
        students.add(new Student("tom", 15));
        students.add(new Student("smith", 13));

        //遍历
        System.out.println("====增强For====");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        System.out.println("====iterator迭代器====");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.getName() + " " + next.getAge());
        }

        //使用泛型方式给HashMap 放入3个学生对象
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        /*
            public class HashMap<K,V> {}
         */
        hashMap.put("jack", new Student("jack", 10));
        hashMap.put("tom", new Student("tom", 15));
        hashMap.put("smith", new Student("smith", 13));

        //遍历
        System.out.println("====增强For====");
        /*
            public Set<Map.Entry<K,V>> entrySet() {
                Set<Map.Entry<K,V>> es;
                return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
            }
         */
        for (Map.Entry<String, Student> sEntry : hashMap.entrySet()) {
            System.out.println(sEntry.getKey() + " " + sEntry.getValue());
        }

        System.out.println("====iterator迭代器====");
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        /*
            public final Iterator<Map.Entry<K,V>> iterator() {
                return new EntryIterator();
            }
         */
        Iterator<Map.Entry<String, Student>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Student> next = iterator2.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " : " + age;
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}