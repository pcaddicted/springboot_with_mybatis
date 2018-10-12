package com.springboot.mybatis.domain;

public class Student{
    private int id;
    private int age;
    private int course_id;
    private String hometown;
    private String name;
    private int number;
    private String telephone;

    public Student() {
    }

    public Student(int id, int age, int course_id, String hometown, String name, int number, String telephone) {
        this.id = id;
        this.age = age;
        this.course_id = course_id;
        this.hometown = hometown;
        this.name = name;
        this.number = number;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
