/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson15.Executions;

/**
 *
 * @author elgin
 */
public class cpuCounter {
    public static void main(String[] args) {
       int cpuCount = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuCount); 
    }
    
}
