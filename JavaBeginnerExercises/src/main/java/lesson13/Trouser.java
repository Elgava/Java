/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13;

/**
 *
 * @author elgin
 */
public class Trouser extends Clothing {

    private char size;
    private String leg;

    public Trouser(char size, String leg, int itemID, String desc, char colorCode, double price) {
        super(itemID, desc, colorCode, price);
        this.size = size;
        this.leg = leg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("size: " + getSize());
        System.out.println("leg:" + getLeg());

    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }
}