import java.text.DecimalFormat;
/**
* Creates an indirect marketing campaign class. 
* extends marketing campaign class
*
* @author Nikhil Patel - COMP-1213- 001
* @version 3-29-21
*/

public class IndirectMC extends MarketingCampaign {
   protected double costPerAd;
   protected int numberOfAds;
   
   /**
   * public static constants.
   */
   public static final double BASE_COST = 1500.0;
   
   /**
   * Constructs an Indirect MC.
   * @param nameIn name of campaign
   * @param revenueIn revenue of campaign
   * @param costPerAdIn cost per ad
   * @param numberOfAdsIn number of ads
   */
   public IndirectMC(String nameIn, double revenueIn, double costPerAdIn,
                    int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
   
   /**
   * Gets cost per ad.
   * @return cost per ad
   */
   public double getCostPerAd() {
      return costPerAd;
   }
   
   /**
   * Sets cost per ad.
   * @param costPerAdIn cost of mail ad
   */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
   /**
   * Gets number of ads.
   * @return number of ads
   */ 
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
   /**
   * Sets number of ads.
   * @param numberOfAdsIn number of ads
   */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   
   /**
   * Gets the base cost.
   * @return base cost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /**
   * Calculates campaign cost.
   * @return campaign cost
   */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }
   
   /**
   * To String method.
   * @return a string ouput
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Base Cost: " + df.format(getBaseCost())
         + "\n   Ad Cost: " + df.format(costPerAd * numberOfAds)
         + " = " + df.format(costPerAd) + " per ad * "
         + numberOfAds + " ads";
   }

}
