/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author elgin
 */
public class GroupA extends Students{
    // num_of_Student
    // course
    // attendance
    //annual
    
    private int numStud = 6;
    private String Course; 
    private boolean attend = false;
    private double annual;

    public GroupA(String Course, double annual, String first_name, String surname, int age, String email, String repository) {
        super(first_name, surname, age, email, repository);
        this.Course = Course;
        this.annual = annual;
        this.email = email;
        this.attend = attend;
    }
    

    public int getNumStud() {
        return numStud;
    }

    public void setNumStud(int numStud) {
        this.numStud = numStud;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public boolean isAttend() {
        return attend;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
    }

    public double getAnnual() {
        return annual;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }
}
