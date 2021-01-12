package org.example;

public class Student {

    public Student(){
        id= 1;
        course = "CS";
        name = "Sathish";
    }

    private int id;
    private String course;
    private String name;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    void study(){
        System.out.println("I'm studying???");
    }

    float calculateGPA(){
        return 3.7F;
    }
}
