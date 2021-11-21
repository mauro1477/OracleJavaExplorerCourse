/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mauro.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.util.Arrays;


/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total = 0;
        double tax = .2;
        System.out.println("Welcome to Mauro Choice Shop!");
        
        //Create a Customer
        Customer c1 = new Customer("Mauro",14);
        System.out.println("Min Price: " + Clothing.MIN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 5.0, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 20.9, "S"), new Clothing("Blue Scarf", 20.9, "S")};
        try{
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();          
        } catch (UnknownHostException ex){
            ex.printStackTrace();
        }
//        c1.additems(items);
//        total = c1.getTotalCost();
//        System.out.println("Customer: " + c1.getName() + ", Total: " + total + ", Size: " + c1.getSize());
//        
//        for(Clothing item : c1.getItems()){
//            System.out.println(item);
//        }
//        
//        Arrays.sort(c1.getItems());
//        
//        System.out.println("Sorted");
//        for(Clothing item : c1.getItems()){
//            System.out.println(item);
//        }
    }
    
}
