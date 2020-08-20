package com.donric.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Prople {
    @Autowired
    private Cat Cat;
    @Autowired
    private Dog Dog;
    private String name;

    public Cat getCat() {
        return Cat;
    }

    public void setCat(Cat cat) {
        this.Cat = cat;
    }

    public Dog getDog() {
        return Dog;
    }

    public void setDog(Dog dog) {
        this.Dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prople{" +
                "cat=" + Cat +
                ", dog=" + Dog +
                ", name='" + name + '\'' +
                '}';
    }
}
