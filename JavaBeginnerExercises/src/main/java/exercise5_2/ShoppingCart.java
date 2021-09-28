/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5_2;

/**
 *
 * @author elgin
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String name = "flipper";
        String[] items = new String[3];
            items[0] = "whisk";
            items[1] = "potato";
            items[2] = "oranges";
            items[3] = "mouse";
        
        int quantity = items.length;
	String message = name + "wanst to buy" + quantity+ "products";
        
        
    }
}
