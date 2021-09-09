/**
* Class to make an inventory item.
*
* @author Nikhil Patel - COMP-1213- 001
* @version 3-26-21
*/
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
   * Constructs an item.
   * @param nameIn name of item
   * @param priceIn price of item
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * Gets the name of the item.
   * @return name of item
   */
   public String getName() {
      return name;
   }
   
   /**
   * Calculates cost of the item.
   * @return cost of item
   */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
   * Sets the tax rate.
   * @param taxRateIn tax rate
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
   * To String method.
   * @return a string
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}