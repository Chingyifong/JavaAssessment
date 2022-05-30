package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();

    //Constructor
    public StudentService() {   //Required??
    }

    //Methods
    public void subscribeStudent(Student student) {
        //(1) New instance of Student Object was already created at PrinterHelper
        //(2) Add the new instance into students HashMap through retrieval of Id
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {
        //(1) Check if the studentId exist in HashMap
        //(2) Get the Student Object from the students HashMap using the Id
        //(3) Return the course object to the caller
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public String studentSummary() {
        //(1) Loop through Student HashMap value
        String printAllStudents = "";
        for (Student s : students.values()) {
            printAllStudents += s + "\n";
        }
        return printAllStudents;
    }

    public boolean showSummary() {
        //(1) Check if there are students enrolled?
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //(1) Get that particular Student Object Id
        //(2) Use Student Object to access the enrollToCourse method
        if (students.containsKey(studentId)) {
        students.get(studentId).enrollToCourse(course);
    }

    }

}
