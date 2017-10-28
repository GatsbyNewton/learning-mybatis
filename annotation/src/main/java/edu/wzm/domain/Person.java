package edu.wzm.domain;

import org.apache.ibatis.type.Alias;

/**
 * Created by gatsbynewton on 2017/7/15.
 */
@Alias("Person")
public class Person {

    private int id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "Person: [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
