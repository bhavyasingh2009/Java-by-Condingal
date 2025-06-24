package Lesson17;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }

    public double getCGPA(){
        if(courses.isEmpty()){
            return 0.0;
        }
        double total = 0;
        for(Course course: courses){
            total = course.getGrade() + total;
        }
        return total/ courses.size();
    }
    
}
