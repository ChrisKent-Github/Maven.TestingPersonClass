package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "blue";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetYearOfBirth() {
        // Given
        Person person = new Person();
        Integer expected = 1950;

        // When
        person.setYearOfBirth(expected);

        // Then
        Integer actual = person.getYearOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetStateOfBirth() {
        // Given
        Person person = new Person();
        String expected = "DE";

        // When
        person.setStateOfBirth(expected);
        String actual = person.getStateOfBirth();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetUsShoeSize() {
        // Given
        Person person = new Person();
        Integer expected = 11;

        // When
        person.setUsShoeSize(expected);

        // Then
        Integer actual = person.getUsShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGlasses() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setGlasses(expected);

        // Then
        boolean actual = person.getGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithEyeColor() {
        // Given
        String expected = "brown";

        // When
        Person person = new Person(expected);
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithShoeSize() {
        // Given
        int expected = 9;

        // When
        Person person = new Person(expected);
        person.setUsShoeSize(expected);

        // Then
        int actual = person.getUsShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithYearOfBirth() {
        // Given
        int expected = 1989;

        // When
        Person person = new Person(expected);
        person.setYearOfBirth(expected);
        // Then
        int actual = person.getYearOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithStateOfBirth() {
        // Given
        String expected = "CA";

        // When
        Person person = new Person(expected);
        person.setStateOfBirth(expected);
        // Then
        String actual = person.getStateOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithGlasses() {
        // Given
        boolean expected = true;

        // When
        Person person = new Person(String.valueOf(expected));
        person.setGlasses(expected);

        // Then
        boolean actual = person.getGlasses();
        Assert.assertTrue(true);
    }
}
