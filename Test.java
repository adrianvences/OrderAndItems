import java.util.ArrayList;

import javax.xml.transform.Source;
public class Test {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("coffee",2.0);
        Item item2 = new Item("latte",4.0);
        Item item3 = new Item("le coffee",5.0);
        Item item4 = new Item("capp",6.0);

    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("adrian");
        Order order2 = new Order("eric");
        Order order3 = new Order("fernanda");
        Order order4 = new Order("nen");
        Order order5 = new Order("chris");

    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order1.setReady(true);
        order3.addItem(item4);
        order3.addItem(item4);
        order3.setReady(true);


        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order1.getReady());
        System.out.println(order3.getReady());

    }
}