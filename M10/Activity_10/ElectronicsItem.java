/**
* Class to make an electronic item.
* Extends the InventoryItem class
* @author Nikhil Patel - COMP-1213- 001
* @version 3-26-21
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   
   /**
   * a static constant for shipping costs.
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * Constructs an elctronic item.
   * @param nameIn name of item
   * @param priceIn price of item
   * @param weightIn weight of item
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * Calculates cost but with shipping costs added.
   * @return cost of item plus shipping
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}