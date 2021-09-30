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
public class shirt {
    private String description;
    private char color;
    private double price;
    
    public shirt(String description, char color, double price) {
        this.description = description;
        this.color = color;
        this.price = price;
    }
    
    public String display(){
        return "description" + getDescription() + "\n"
               + "colour: " + getColor() + "\n"
                + "price: " + getPrice() + "\n";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColor() {
        return color;
    }

    public void setColor(String color) {
         if(color.length() > 0){
            this.color = color.charAt(0);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}

    