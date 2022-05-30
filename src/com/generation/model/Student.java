package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    //Added ArrayList so that each student will have an ArrayList
    private ArrayList<Course> enrolledCourses;



    //Constructor
    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

        //Create an empty enrolledCourses ArrayList - every Student will have an empty ArrayList
        enrolledCourses = new ArrayList<>();
    }


    //Methods
    public void enrollToCourse( Course course )
    {
        //Add the course to the ArrayList
        enrolledCourses.add(course);
    }


    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        if (enrolledCourses.contains(courseId)) {
            return enrolledCourses.get(Integer.parseInt(courseId));
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses() {
        // Return the whole ArrayList
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}" + "\n" + "Enrolled Courses: " + this.enrolledCourses;
    }

}
