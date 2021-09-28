/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

/**
 *
 * @author elgin
 */
public class Array_example {
    public static void main(String[] args) {
        String[] names = new String[3];
            names[0] = "elgin";
            names[1] = "connor";
            names[2] = "jason";
        
        for (String name : names){
            if(name == "elgin"){
                System.out.println("my name is" + " " +name);
                break;
            }
            else{
            System.out.println("my name is" +" "+name);
            }
        }
   }
}
