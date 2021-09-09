import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * A class to test tetrahedron class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-8-2021
 */


/**
* Class to test Tetrahedron class.
*/
public class TetrahedronTest {

   private Tetrahedron example = new Tetrahedron("Small Example", 1.0);
   private Tetrahedron exampleTrue = new Tetrahedron("Small Example", 1.0);
   private Tetrahedron exampleFalse = new Tetrahedron("Wide Example", 5);
   private double edge = example.getEdge();
   
   private static int count = Tetrahedron.getCount();  


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests the get count method.
   */
   @Test public void getCountTest() {
      Assert.assertEquals(0, count);
   }
   
   /**
   * Tests the height method.
   */
   @Test public void heightTest() {
      Assert.assertEquals(0.816, example.height(), 0.001);
   }
   
   /**
   * Tests the surface area method.
   */
   @Test public void surfaceAreaTest() {
      Assert.assertEquals(1.732, example.surfaceArea(), 0.001);
   }
   
   /**
   * Tests the volume method along with the toString method.
   */
   @Test public void volumeTest() {
      Assert.assertEquals(0.117, example.volume(), 0.001);
      Assert.assertTrue(example.toString().contains("\"Small Example\""));
   }
     
   /**
   * Tests the reset count method.
   */
   @Test public void resetCountTest() {
      Tetrahedron.resetCount();
      Assert.assertEquals(true, count == 0);
   }
   
   /**
   * Tests the equals method.
   */
   @Test public void equalsTest() {
      Assert.assertFalse(example.equals(exampleFalse));
      Assert.assertTrue(example.equals(exampleTrue));
   }
   
   /**
   * tests the hash code method.
   */
   @Test public void hashCodeTest() {
      Assert.assertTrue(0 == example.hashCode());
   }
   
   /**
   * Tests the get Label method.
   */
   @Test public void getLabelTest() {
      Assert.assertEquals("Small Example", example.getLabel());
   }
   
   /**
   * Tests the get edge method.
   */
   @Test public void getEdgeTest() {
      Assert.assertEquals(1.0, example.getEdge(), 0.001);
   }
   
   /**
   * Tests the set Label method.
   */
   @Test public void setLabelTest() {
      Assert.assertEquals(true, example.setLabel("test2"));
   }
   
   /**
   * Tests the set Edge method.
   */
   @Test public void setEdgeTest() {
      Assert.assertEquals(true, example.setEdge(0.05));
   }
   
   /**
   * Tests the toString method.
   */
   @Test public void toStringTest() {
      Assert.assertTrue(example.toString().contains("\"Small Example\""));
   }

   /** A test that always fails. **/
   /**@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
}
