/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author elgin
 */
public class ShoppingCart {
    public static void main(String[] args) {
        shirt shirt01 = new shirt("sailor", 'G', 30);
        shirt shirt02 = new shirt("sweatshirt", 'B', 25.5);
        shirt shirt03 = new shirt("Skull tee", 'Y' , 15.9);
        shirt shirt04 = new shirt("tropical", 'R' , 55);
        
        shirt01.setColor("Purple");
        System.out.println();
    }
}
