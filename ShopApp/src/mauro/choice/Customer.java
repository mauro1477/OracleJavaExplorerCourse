/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mauro.choice;

/**
 *
 * @author Admin
 */
public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurment) {
        this.name = name;
        setSize(measurment);
    }
    
    public void additems(Clothing[] someItem){
        items = someItem;
    }
    
    public Clothing[] getItems(){
        return this.items;
    }
    
    public double getTotalCost(){
        double total = 0.0;
        double tax = 0.2;
        for(Clothing item : getItems()){
                total= total + item.getPrice();
                total = total + (total * tax);
        }
        return total;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurment){
        switch(measurment){
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
