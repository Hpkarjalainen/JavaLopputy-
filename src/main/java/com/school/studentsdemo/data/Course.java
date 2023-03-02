package com.school.studentsdemo.data;

public class Course {
    private int id;
    private String name;
    private int credit;

    public Course() {
    }

    public Course(int id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
 
}
