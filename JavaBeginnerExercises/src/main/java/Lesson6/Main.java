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
public class Main {
    public static void main(String[] args) {
        Employees emp1 = new Employees("John", "Wick", 50, "0118861265", 45261662);
        Employees emp2 = new Employees("chris", "broad", 38, "01928374658", 836452182);
        Employees emp3 = new Employees("Joey", "the anime man", 27, "01928374638", 8912747);
        
        Employees[] myEmps = {emp1, emp2, emp3};
                
        
        for(Employees emp: myEmps){
            emp.displayDetails();
            System.out.println("\n");
        }
        
        
        emp1.displayDetails();
        System.out.println(".....................");
        emp2.displayDetails();
    }
}
