/**
* Creates an itemslist.
* Extends the InventoryItem class 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-2-21
*/
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
   * Constructs an ItemsList.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
   * Adds an item.
   * @param itemIn item to be added
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
   * Calculated total.
   * @return cost after it has been caluclated
   * @param electronicsSurcharge surcharge
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
   * To string method.
   * @return the to string of the inventory
   */
   public String toString() {
      String output = "All inventory: \n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n\n";
      }
      return output;
   }
}