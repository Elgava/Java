/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

/**
 *
 * @author elgin
 */
public class CLothing {
    public class clothing{
        private int itemID;
        private String desc;
        private char color;
        private double price;
        
        
        public void display(){
        System.out.println("itemID: " + getItemID());
            System.out.println("description: " + getDesc());
            System.out.println("color: " + getColor());
            System.out.println("Price: " + getPrice());
    }

        public int getItemID() {
            return itemID;
        }

        public void setItemID(int itemID) {
            this.itemID = itemID;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public char getColor() {
            return color;
        }

        public void setColor(char color) {
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        
    
    }

    
}
