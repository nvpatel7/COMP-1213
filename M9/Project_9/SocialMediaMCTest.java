import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /** 
 * A class to test SocialMediaMC class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-29-2021
 */


public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** 
   * Tests the get cost per ad method.
   */
   @Test public void getCostPerAdTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(3.00, mc3.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the set cost per ad method.
   */
   @Test public void setCostPerAdTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      mc3.setCostPerAd(4.0);
      
      Assert.assertEquals(4.00, mc3.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the get number of ads method.
   */
   @Test public void getNumberOfAdsTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(8000, mc3.getNumberOfAds());
   }
   
   /**
   * Tests the set number of ads method.
   */
   @Test public void setNumberOfAdsTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.0, 8000);  
      
      mc3.setNumberOfAds(5000);
      
      Assert.assertEquals(5000, mc3.getNumberOfAds());
   }
   
   /**
   * Tests campaign cost method.
   */
   @Test public void campaignCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(27000, mc3.campaignCost(), 0.00001);
   }
   
   /**
   * Tests the base cost method.
   */
   @Test public void getBaseCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(3000, mc3.getBaseCost(), 0.00001);   
   }
   
   /**
   * Tests the to String method.
   */
   @Test public void toStringTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertTrue(mc3.toString().contains("SocialMediaMC"));
   }
}
