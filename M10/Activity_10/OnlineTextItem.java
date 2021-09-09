/**
* Abstract class to make an online text item.
* Extends the InventoryItem class
* @author Nikhil Patel - COMP-1213- 001
* @version 3-26-21
*/
public abstract class OnlineTextItem extends InventoryItem {
   /**
   * Constructs an online text item.
   * @param nameIn name of item
   * @param priceIn price of item
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   * Calculates cost.
   * @return cost of online text item.
   */
   public double calculateCost() {
      return price;
   }
}