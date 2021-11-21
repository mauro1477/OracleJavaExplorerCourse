/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mauro.choice;

/**
 *
 * @author Admin
 */
public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size="M";
    
    public final static double MIN_PRICE = 10.00;
    public final static double MIN_RATE = 0.2;

    public Clothing(String description, double price, String someSize) {
        this.description = description;
        this.price = price;
        this.size = someSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * MIN_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ?  price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //Overriding the Main Super Java Object Class
    @Override
    public String toString(){
      return getDescription() + "," + getPrice() + "," + getSize();
    }
    
    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }
}