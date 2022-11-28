package ru.bolodurin.springmvc.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 25, message = "Name should be between 2 and 25 characters")
    private String name;
    @Min(value = 18, message = "иди гуляй, школьник")
    @Max(value = 110, message = "ты чё бессмертный?")
    private int age;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "email is incorrect")
    private String email;

    public Person() {
    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
