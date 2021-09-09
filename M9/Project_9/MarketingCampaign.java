import java.text.DecimalFormat;
/**
* Creates a marketing campaign class. 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 3-29-21
*/

public abstract class MarketingCampaign {
   protected String name;
   protected double revenue;
   protected static int count = 0;
   
   /**
   * Constructs a marketing campaign.
   * @param nameIn name of campaign
   * @param revenueIn revenue of campaign
   */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   /**
   * Gets the name of the campgaign.
   * @return name of campaign
   */
   public String getName() {
      return name;
   }
   
   /**
   * Sets the name of the campaign.
   * @param nameIn name of campaign
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * Gets the revenue of the campgaign.
   * @return revenue of campaign
   */
   public double getRevenue() {
      return revenue;
   }
   
   /**
   * Sets the revenue of the campaign.
   * @param revenueIn revenue of campaign
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
   * Static method to get count of objects.
   * @return count of objects
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * Calculates the ROI.
   * @return ROI calculated
   */
   public double calcROI() {
      return (revenue - campaignCost()) / campaignCost();
   }
   
   /**
   * To String method.
   * @return a string output
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      DecimalFormat roi = new DecimalFormat("0.##%");
      return name + " (" + this.getClass() + ")"
         + ("\nRevenue: " + fmt.format(revenue) + "   Campaign Cost: " 
         + fmt.format(campaignCost()) + "   ROI: " + roi.format(calcROI()));
   }
   
   /**
   * Abstract method to for campaign cost.
   * @return cost of marketing campaign
   */
   public abstract double campaignCost();
}