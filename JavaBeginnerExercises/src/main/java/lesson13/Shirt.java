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
public class Shirt extends Clothing implements returnable {

    private char fit = 'U';
    private String sleeve;

    public Shirt(int itemID, String desc, char colorCode, double price, char fit, String sleeve) {
        super(itemID, desc, colorCode, price);
        this.sleeve = sleeve;
        this.fit = fit;
    }

    @Override
    public String doReturn() {
        return "Returns must be within 3 days";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("fit: " + getFit());
        System.out.println("Sleeve:" + getSleeve());
    }

    public char getFit() {
        return fit;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }
}
