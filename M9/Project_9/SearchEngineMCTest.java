import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /** 
 * A class to test SearchEngineMC class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-29-2021
 */


public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests the getBaseCount method.
   */
   @Test public void getBaseCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      Assert.assertEquals(2000, mc2.getBaseCost(), 0.00001);  
   }
   
   /**
   * Tests the to String method.
   */
   @Test public void toStringTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      Assert.assertTrue(mc2.toString().contains("Base Cost: "));
   }
   
   /**
   * Tests campaign cost method.
   */
   @Test public void campaignCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      Assert.assertEquals(14500, mc2.campaignCost(), 0.00001);
   }
   
   /** 
   * Tests the get cost per ad method.
   */
   @Test public void getCostPerAdTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      Assert.assertEquals(2.50, mc2.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the set cost per ad method.
   */
   @Test public void setCostPerAdTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      mc2.setCostPerAd(3.5);
      
      Assert.assertEquals(3.50, mc2.getCostPerAd(), 0.00001);
   }
   
   /**
   * Tests the get number of ads method.
   */
   @Test public void getNumberOfAdsTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      Assert.assertEquals(5000, mc2.getNumberOfAds());
   }
   
   /**
   * Tests the set number of ads method.
   */
   @Test public void setNumberOfAdsTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00, 2.5, 5000);
      
      mc2.setNumberOfAds(4500);
      
      Assert.assertEquals(4500, mc2.getNumberOfAds());
   }
}
