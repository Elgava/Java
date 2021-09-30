/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

/**
 *
 * @author elgin
 */
public class ShirtTest {

    public static void main(String[] args) {

        Shirt shirt01 = new Shirt(33, "Golf shirt", 'G', 55.50);
        Shirt shirt04 = new Shirt("golf shirt", 'G', 55.50);
        Shirt shirt02 = new Shirt("Golf shirt", 55.50);
        Shirt shirt03 = new Shirt(55.50);

        shirt01.setColorCode('Z');

        shirt01.display();
        shirt04.display();
        shirt02.display();
        shirt03.display();
    }

}
