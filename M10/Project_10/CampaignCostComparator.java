import java.util.Comparator;

/**
* Compares campaign costs . 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-5-21
*/
public class CampaignCostComparator implements Comparator <MarketingCampaign> {

   /**
   * Compares two marketing campaigns.
   * @param mc1 first marketing campaign
   * @param mc2 second marketing campaign
   * @return an integer
   */
   public int compare(MarketingCampaign mc1, MarketingCampaign mc2) {
      if (mc1.campaignCost() < mc2.campaignCost()) {
         return -1;
      } 
      else if (mc1.campaignCost() > mc2.campaignCost()) {
         return 1;
      } 
      else {
         return 0;
      }
   }
}