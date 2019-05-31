package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    private String hairColor;
    private int hasKids;
    private int hasPets;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        height = Integer.MAX_VALUE;
        weight = Double.MAX_VALUE;
        hairColor= "";
        hasKids = Integer.MAX_VALUE;
        hasPets = Integer.MAX_VALUE;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHasKids() {
        return hasKids;
    }

    public void setHasKids(int hasKids) {
        this.hasKids = hasKids;
    }

    public int getHasPets() {
        return hasPets;
    }

    public void setHasPets(int hasPets) {
        this.hasPets = hasPets;
    }




    public Person(int age) {
        this.age=age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int height, double weight, String hairColor,int hasKids, int hasPets) {
        this.name = "Leon";
        this.age = 5;
        this.height = 65
    }

    public void setName(String name) {
        this.name="Leon";

    }

    public void setAge(int age) {
        this.age = 5;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
