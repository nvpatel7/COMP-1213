   /**
* Creates an search engine marketing campaign class. 
* extends indirectMC class
*
* @author Nikhil Patel - COMP-1213- 001
* @version 3-29-21
*/

public class SearchEngineMC extends IndirectMC {
   /**
   * public static constants.
   */
   public static final double BASE_COST = 2000.0;
   
   /**
   * Constructs a search engine MC.
   * @param nameIn name of campaign
   * @param revenueIn revenue of campaign
   * @param costPerAdIn cost per ad
   * @param numberOfAdsIn number of ads
   */
   public SearchEngineMC(String nameIn, double revenueIn, double costPerAdIn,
                    int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
   /**
   * Gets the base cost.
   * @return base cost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
}