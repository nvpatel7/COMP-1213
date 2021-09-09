 /** 
 * A class to create a customer.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-12-2021
 */
 
public class Customer implements Comparable<Customer> {
   
   // instance variables
   private String name, location;
   private double balance;
   
   // constructor
   /**
   * Constructs a customer.
   * @param nameIn name of customer
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   // methods
   /**
   * Sets location of customer.
   * @param locationIn location of customer
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * Method to add balance to customer.
   * @param amount amount to add to balance.
   */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
   * Method to get the location.
   * @return location of customer
   */
   public String getLocation() {
      return location;
   }
   
   /**
   * Method to get the balance.
   * @return the balance
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * Method to set the location.
   * @param city city of customer.
   * @param state state of customer.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /** 
   * To string method.
   * @return everything to string
   */
   public String toString() {
      String output = "";
      output = name + "\n" + location + "\n" + "$" + balance;
      return output;
   }
   
   /**
   * compareTo method to compare customers.
   * @param obj object to compare
   * @return an int depending on the conditions
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}