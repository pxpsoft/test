package com.pxp.word.entity;

public class Person {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public Person(String name, Integer age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private String name;
    private Integer age;
    private int id;

    private Person() {
    }
}
