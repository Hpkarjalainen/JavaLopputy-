package com.school.studentsdemo.data;

//Tällä luodaan oppilaita

public class Student {
    private int id;
    private String name;
    private String streetName;
    

    public Student() {
    }

    public Student(int id, String name, String streetName) {
        this.id = id;
        this.name = name;
        this.streetName = streetName;
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

    public String getStreetname() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

   
   

}
