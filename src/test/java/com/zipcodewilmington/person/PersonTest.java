package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getHeight() {
    }

    @Test
    public void setHeight() {
        Person person = new Person();
        Integer expected = 70;

        person.setHeight(expected);
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeight() {
    }

    @Test
    public void setWeight() {
        Person person = new Person();
        Double expected = 150.0;

        person.setWeight(expected);
        Double actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHairColor() {
    }

    @Test
    public void setHairColor() {
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setHairColor(expected);
        String actual = person.getHairColor();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getHasKids() {
    }

    @Test
    public void setHasKids() {
        Person person = new Person();
        Integer expected = 3;

        // When
        person.setHasKids(expected);
        Integer actual = person.getHasKids();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHasPets() {
    }

    @Test
    public void setHasPets() {
    Person person = new Person();
    Integer expected = 2;

    person.setHasPets(expected);
    Integer actual = person.getHasPets();
    Assert.assertEquals(expected, actual);
    }


}