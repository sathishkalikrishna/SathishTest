package org.example;

public class Person {

    public Person(){
        marks = 575;
        firstName = "Sathish";
        lastName = "Kalikrishna";
    }

    public Person(String firstName, String lastName, int marks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public Person(String firstName){
        this.firstName = firstName;
    }


    public static int totalMarks = 600;


    private String firstName;
    private String lastName;
    private int marks;


    /*********** ===== Getters and Setters ===== */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    /*********** ===== Getters and Setters ===== */





    public void functionName(){
        String fullName = "";
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public float getPercentage(){
        float per = (marks/600) * 100;
        return per;
    }
}
