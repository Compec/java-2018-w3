package com.company;

public class Person {
    public String firstName;
    public String lastName;
    private int age;

    Person() {
        firstName = "Mehdi";
        lastName = "Saffar";
        age = 34;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if(newAge < 0) {
            System.out.println("Age cannot be negative");
            return;
        }
        age = newAge;
    }

    public void printMyName() {
        System.out.println(firstName + " " + lastName);
    }
}
