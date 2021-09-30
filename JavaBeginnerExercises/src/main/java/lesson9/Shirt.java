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
public class Shirt {

    private int shirtID = 0;
    //
    private String description = "description Required";
    //
    private char colorCode = 'U';
    //
    private double price = 0.0;
    //

    public Shirt(int shirtID, String description, char colorCode, double price) {
        this.shirtID = shirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public Shirt(String description, char colorCode, double price) {
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public Shirt(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Shirt(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("shirt ID: " + getShirtID());
        System.out.println("Description: " + getDescription());
        System.out.println("ColorCode: " + getColorCode());
        System.out.println("Price: " + getPrice() + "\n");
    }

    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
