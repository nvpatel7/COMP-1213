import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /** 
 * A class to test DirectMC class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-29-2021
 */


/**
* Tests DirectMC class.
*/
public class DirectMCTest {



   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests the get name method.
   */
   @Test public void getNameTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals("Ad Mailing", mc0.getName());
   }
   
   /**
   * Tests the set name method.
   */
   @Test public void setNameTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setName("Test");
      
      Assert.assertEquals("Test", mc0.getName());
   }
   
   /**
   * Tests the get revenue method.
   */
   @Test public void getRevenueTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(10000.00, mc0.getRevenue(), 0.00001);
   }
   
   /**
   * Tests the get revenue method.
   */
   @Test public void setRevenueTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setRevenue(5000.00);
      
      Assert.assertEquals(5000.00, mc0.getRevenue(), 0.00001);
   }
   
   /**
   * Tests the get count method.
   */
   @Test public void getCountTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(10, mc0.getCount());
   }
   
   /**
   * Tests the reset count method.
   */
   @Test public void resetCountTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.resetCount();
      
      Assert.assertEquals(0, mc0.getCount());
   }
   
   /**
   * Tests the calcROI method.
   */
   @Test public void calcROITest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(0.4286, mc0.calcROI(), 0.0001);
   }
   
   /**
   * Tests the to String method in marketing campaign class.
   */
   @Test public void toStringTest() { 
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertTrue(mc0.toString().contains("\nRevenue: "));
      Assert.assertTrue(mc0.toString().contains(" mail pieces"));
   }
   
   /**
   * Test get cost per mail piece.
   */
   @Test public void getCostPerMailPieceTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(3, mc0.getCostPerMailPiece(), 0.00001);
   }
   
   /**
   * Tests set cost per mail piece.
   */
   @Test public void setCostPerMailPieceTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setCostPerMailPiece(5);
      
      Assert.assertEquals(5, mc0.getCostPerMailPiece(), 0.00001);
   }
   
   /**
   * Test the get number of mail pieces test.
   */
   @Test public void getNumberOfMailPiecesTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(2000, mc0.getNumberOfMailPieces());
   }
   
   /**
   * Test the set number of mail pieces test.
   */
   @Test public void setNumberOfMailPiecesTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setNumberOfMailPieces(3000);
      
      Assert.assertEquals(3000, mc0.getNumberOfMailPieces());
   }
   
   /**
   * Tests campaign cost method.
   */
   @Test public void campaignCostTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      
      Assert.assertEquals(7000, mc0.campaignCost(), 0.0001);
   }
}
