package com.revature.model;

import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private List<Cat> kittens;

    public Cat() {
    }

    public Cat(String name, String breed, int age, List<Cat> kittens) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.kittens = kittens;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getBreed() {
        return breed;
    }

    public Cat setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public List<Cat> getKittens() {
        return kittens;
    }

    public Cat setKittens(List<Cat> kittens) {
        this.kittens = kittens;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", kittens=" + kittens +
                '}';
    }
}
