/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10_2;

/**
 *
 * @author elgin
 */
public class ShoppingCart {
     public static void main(String args[]){
        Order order = new Order("Rick Wilson", 400.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
