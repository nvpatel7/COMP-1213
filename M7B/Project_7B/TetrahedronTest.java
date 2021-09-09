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
      Tetrahedron t1 = new Tetrahedron("label", 2);
      Tetrahedron.resetCount();
      Tetrahedron t = new Tetrahedron("label", 2);
      Assert.assertEquals("getCount test", 1, t.getCount());
   }
   
   /**
   * Tests the equals method.
   */
   @Test public void equalsTest() {
      Tetrahedron t = new Tetrahedron("test", 2);
      Tetrahedron u = new Tetrahedron("test", 2);
      Tetrahedron v = new Tetrahedron("k", 2);
      Tetrahedron w = new Tetrahedron("test", 3);
      
      Object x = new Object();
      
      Assert.assertEquals(false, t.equals(x));
      
      Assert.assertEquals(true, t.equals(u));
      Assert.assertEquals(false, t.equals(v));
      Assert.assertEquals(false, t.equals(w));
   }
   
   /**
   * tests the hash code method.
   */
   @Test public void hashCodeTest() {
      Tetrahedron t = new Tetrahedron("label", 2);
      Assert.assertEquals(0, t.hashCode());
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
   * Tests set Label null method.
   */
   @Test public void setLabelTestNull() {
      Tetrahedron tfalse = new Tetrahedron("false", 2.0);
      Assert.assertEquals(false, tfalse.setLabel(null));
   }
   
   /**
   * Tests the set Edge method.
   */
   @Test public void setEdgeTest() {
      Assert.assertEquals(true, example.setEdge(0.05));
   }
   
   /**
   * Tests set edge method when null.
   */
   @Test public void setEdgeTestNull() {
      Tetrahedron tfalse = new Tetrahedron("false", 2.0);
      Assert.assertEquals(false, tfalse.setEdge(-3));
   }
   
   /**
   * Tests the toString method.
   */
   @Test public void toStringTest() {
      Assert.assertTrue(example.toString().contains("\"Small Example\""));
   }
   
   /**
   * First compare to test.
   */
   @Test public void compareToTest1() {
      Tetrahedron t1 = new Tetrahedron("Label", 3.0);
      t1.volume();
      Tetrahedron t2 = new Tetrahedron("Label2", 3.0);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) == 0);
      Assert.assertFalse(t1.compareTo(t2) > 0);
      Assert.assertFalse(t1.compareTo(t2) < 0);
   }
   
   /**
   * Second compare to test.
   */
   @Test public void compareToTest2() {
      Tetrahedron t1 = new Tetrahedron("Label", 3.0);
      t1.volume();
      Tetrahedron t2 = new Tetrahedron("Label2", 7.0);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) < 0);
      Assert.assertFalse(t1.compareTo(t2) == 0);
      Assert.assertFalse(t1.compareTo(t2) > 0);
   }
   
   /**
   * Third compare to test.
   */
   @Test public void compareToTest3() {
      Tetrahedron t1 = new Tetrahedron("Label", 8.0);
      t1.volume();
      Tetrahedron t2 = new Tetrahedron("Label2", 3.0);
      t2.volume();
      Assert.assertTrue(t1.compareTo(t2) > 0);
      Assert.assertFalse(t1.compareTo(t2) == 0);
      Assert.assertFalse(t1.compareTo(t2) < 0);
   }

}
