package com.school.studentsdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.school.studentsdemo.data.Student;

//Tämä palvelee student-luokkaa

@Service //liittyy dependency injectioniin
public class StudentService {
    // tähän listaan tallennetaan oppilaat
    private List<Student> students = new ArrayList<>();

    public StudentService(){
        students.add(new Student(0, "Maso", "Ruokopolku"));
        students.add(new Student(1, "Pertti", "Mattilanpelto"));
        students.add(new Student(2, "Keijo", "Liljakuja"));
        students.add(new Student(3, "Ransu", "Orikatu"));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(int id) {
        Student s = findStudent(id);

        if (s != null) {
            return students.remove(s);

        } 
        return false;
        
    }

}
