package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    private String eyeColor = "brown";
    private int yearOfBirth = 1989;
    private String stateOfBirth ="PA";
    private int usShoeSize = 13;
    private boolean glasses = true;

    public Person() {
//        this.name = "bob";
//        this.age = 100;
//        this.eyeColor = "blue";
//        this.yearOfBirth = 1990;
//        this.stateOfBirth = "PA";
//        this.usShoeSize = 9;
//        this.glasses = false;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setStateOfBirth(String stateOfBirth) {
        this.stateOfBirth = stateOfBirth;
    }

    public void setUsShoeSize(int usShoeSize) {
        this.usShoeSize = usShoeSize;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String getStateOfBirth() {
        return stateOfBirth;
    }

    public Integer getUsShoeSize() {
        return usShoeSize;
    }

    public boolean getGlasses() {
        return glasses;
    }

}
