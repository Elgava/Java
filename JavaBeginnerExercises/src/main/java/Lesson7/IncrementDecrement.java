/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import javax.sound.midi.Soundbank;

/**
 *
 * @author elgin
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int numUp = 20;
        int w, x, y, z;
        w = numUp++;
        x = numUp;
        y = ++numUp;
        z = --numUp;
        System.out.println(w + ", " + x + ", " + y + ", " + z);
        
        for(int i = 0; i<=100; i+= 2) {
            System.out.println(i +"\n");
        }    
        for(int O = 100; O>=0; O--){
            System.out.println("");   
        }
        
    }
}
