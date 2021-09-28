/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author elgin
 */
public class Employees {
    public String name;
    public String surname;
    public int age;
    public String ContactNum;
    public int idNum;
    
    public Employees(String name, String surname, int age, String contactNum, int idNum) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ContactNum = contactNum;
        this.idNum = idNum;
    }
    
    public void displayDetails(){
        System.out.println("Name: " + getName() 
                                              + "\nSurname: " + getSurname() 
                                              + "\nAge: " + getAge() 
                                              + "\ncontact Number: " + getContactNum() 
                                              + "\nID Number: " + getIdNum());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNum() {
        return ContactNum;
    }

    public void setContactNum(String ContactNum) {
        this.ContactNum = ContactNum;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    
}
