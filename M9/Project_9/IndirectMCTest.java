import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /** 
 * A class to test IndirectMC class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-29-2021
 */


/**
* Tests IndirectMC class.
*/
public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** 
   * Tests the get cost per ad method.
   */
   @Test public void getCostPerAdTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(2.0, mc1.getCostPerAd(), 0.00001);
      Assert.assertEquals(2.50, mc2.getCostPerAd(), 0.00001);
      Assert.assertEquals(3.00, mc3.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the set cost per ad method.
   */
   @Test public void setCostPerAdTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      mc1.setCostPerAd(3.0);
      mc2.setCostPerAd(3.5);
      mc3.setCostPerAd(4.0);
      
      Assert.assertEquals(3.0, mc1.getCostPerAd(), 0.00001);
      Assert.assertEquals(3.50, mc2.getCostPerAd(), 0.00001);
      Assert.assertEquals(4.00, mc3.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the get number of ads method.
   */
   @Test public void getNumberOfAdsTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      Assert.assertEquals(3500, mc1.getNumberOfAds());
      Assert.assertEquals(5000, mc2.getNumberOfAds());
      Assert.assertEquals(8000, mc3.getNumberOfAds());
   }
   
   /**
   * Tests the set number of ads method.
   */
   @Test public void setNumberOfAdsTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      
      mc1.setNumberOfAds(4000);
      mc2.setNumberOfAds(4500);
      mc3.setNumberOfAds(5000);
      
      Assert.assertEquals(4000, mc1.getNumberOfAds());
      Assert.assertEquals(4500, mc2.getNumberOfAds());
      Assert.assertEquals(5000, mc3.getNumberOfAds());
   }
   
   /**
   * Tests campaign cost method.
   */
   @Test public void campaignCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(8500, mc1.campaignCost(), 0.00001);
   }
   
   /**
   * Tests the base cost method.
   */
   @Test public void getBaseCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertEquals(1500, mc1.getBaseCost(), 0.00001);   
   }
   
   /**
   * Tests the to String method.
   */
   @Test public void toStringTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      
      Assert.assertTrue(mc1.toString().contains("Web Ads 1 "));
   }
}
