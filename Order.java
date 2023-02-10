import java.util.ArrayList;

public class Order {

  // member varaibles
  public String name; // def value of null
  public double total; 
  public boolean ready; // def value of false 
  public ArrayList<Item> items; // def to null

  // constructor
  public Order() {
    this.name = "guest";
    this.items = new ArrayList<Item>();
    this.ready = false;
  }
  
  // overload constructor

  public Order(String name) {
    this.name = name;
    this.items = new ArrayList<Item>();
    this.ready = false;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public boolean isReady() { 
    return this.ready;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }


  // order methods

  public void addItem (Item item) {
    this.items.add(item); 
  }

  public double getOrderTotal() {
    double sum = 0; 
    for (Item item : items){ 
      sum += item.getPrice();
    }

    return sum;

  }

}