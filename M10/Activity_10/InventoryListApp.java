/**
* ItemsList driver class.
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-2-21
*/

public class InventoryListApp {
   /**
   * main method of class.
   * @param args not used
   */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
     
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}