import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
* Tests methods of the tetrahedron list class.
* @author Nikhil Patel - COMP-1213- 001
* @version 3-21-2021
*/
public class TetrahedronListTest {
   private Tetrahedron one = new Tetrahedron("one", 1);
   private Tetrahedron two = new Tetrahedron("two", 2);
   private Tetrahedron three = new Tetrahedron("three", 3);  

   private Tetrahedron[] list = {one, two, three};
   private Tetrahedron[] blank = new Tetrahedron[0];
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests getName method.
   */
   @Test public void getNameTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      
      Assert.assertEquals("name", test.getName());
   }  
   
   /**
   * Tests numebr of tetrahedrons method.
   */
   @Test public void numberOfTetrahedronsTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("name", list, -1);
      
      Assert.assertEquals(3, test.numberOfTetrahedrons());
      Assert.assertEquals(0, test1.numberOfTetrahedrons());
   }
   
   /**
   * Tests total surface area method.
   */
   @Test public void totalSurfaceAreaTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      double total = 0; 
      
      total += (Math.sqrt(3) * Math.pow(1, 2));
      total += (Math.sqrt(3) * Math.pow(2, 2));
      total += (Math.sqrt(3) * Math.pow(3, 2));
      
      Assert.assertEquals(total, test.totalSurfaceArea(), 0.0001);
      Assert.assertEquals(0, test1.totalSurfaceArea(), 0.0001);
   }
   
   /**
   * Tests total volume method.
   */
   @Test public void totalVolumeTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      double total = 0; 
      
      total += ((Math.pow(1, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      total += ((Math.pow(2, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      total += ((Math.pow(3, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      
      Assert.assertEquals(total, test.totalVolume(), 0.0001);
      Assert.assertEquals(0, test1.totalVolume(), 0.0001);
   }
   
   /**
   * Tests average surface area method.
   */
   @Test public void averageSurfaceAreaTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      double total = 0; 
      
      total += (Math.sqrt(3) * Math.pow(1, 2));
      total += (Math.sqrt(3) * Math.pow(2, 2));
      total += (Math.sqrt(3) * Math.pow(3, 2));
      total /= 3;
      
      Assert.assertEquals(total, test.averageSurfaceArea(), 0.0001);
      Assert.assertEquals(0, test1.averageSurfaceArea(), 0.0001);  
   }
   
   /**
   * Tests average volume method.
   */
   @Test public void averageVolumeTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      double total = 0; 
      
      total += ((Math.pow(1, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      total += ((Math.pow(2, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      total += ((Math.pow(3, 3)) / ((double) 6 * Math.sqrt((double) 2)));
      total /= 3;
      
      Assert.assertEquals(total, test.averageVolume(), 0.0001);
      Assert.assertEquals(0, test1.averageVolume(), 0.0001);  
   }
   
   /**
   * Tests to string method.
   */
   @Test public void toStringTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      Assert.assertEquals(true, test.toString().contains("Total Volume: "));
      Assert.assertEquals(false, test1.toString().contains("Average Height:"));
   }
   
   /**
   * Tests getList method.
   */
   @Test public void getListTest() {
      TetrahedronList t = new TetrahedronList("name", list, 3);
      
      Assert.assertArrayEquals(list, t.getList());
   }
   
   /**
   * tests find tetrahedron method.
   */
   @Test public void findTetrahedronTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      Assert.assertEquals(list[0], test.findTetrahedron("one"));
      Assert.assertEquals(null, test1.findTetrahedron("one"));
   }
   
   /**
   * Tests add tetrahedron method.
   */
   @Test public void addTetrahedronTest() {
      Tetrahedron[] tArray = new Tetrahedron[20];
      tArray[0] = new Tetrahedron("one", 1);
      tArray[1] = new Tetrahedron("two", 2);
      tArray[2] = new Tetrahedron("three", 3);
      
      TetrahedronList test = new TetrahedronList("list", tArray, 3);
      Tetrahedron t = new Tetrahedron("five", 5);
      test.addTetrahedron("five", 5);
      Tetrahedron[] t2 = test.getList();
      
      Assert.assertEquals(t, t2[3]);
   }
   
   /**
   * Tests delete tetrahedron method.
   */
   @Test public void deleteTetrahedronTest() {
      Tetrahedron[] tArray = new Tetrahedron[20];
      Tetrahedron[] tArray1 = new Tetrahedron[0];
      
      tArray[0] = new Tetrahedron("one", 1);
      tArray[1] = new Tetrahedron("two", 2);
      tArray[2] = new Tetrahedron("three", 3);
      
      TetrahedronList test = new TetrahedronList("list", tArray, 3);
      TetrahedronList test1 = new TetrahedronList("list", tArray1, -1);
      Tetrahedron t = new Tetrahedron("five", 5);
      Tetrahedron[] t2 = test.getList();
      
      Assert.assertEquals(tArray[1], test.deleteTetrahedron("two"));
      Assert.assertEquals(null, test1.deleteTetrahedron("one"));
   }
   
   /** 
   * Tests the edit Tetrahedron method.
   */
   @Test public void editTetrahedronTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      
      Assert.assertEquals(true, test.editTetrahedron("one", 10));
      Assert.assertEquals(false, test.editTetrahedron("none", 0));
   }
   
   /**
   * Tests largest volume method.
   */
   @Test public void findTetrahedronWithLargestVolumeTest() {
      TetrahedronList test = new TetrahedronList("name", list, 3);
      TetrahedronList test1 = new TetrahedronList("blank", blank, 0);
      
      Assert.assertEquals(list[2], test.findTetrahedronWithLargestVolume());
      Assert.assertEquals(null, test1.findTetrahedronWithLargestVolume());
   }
}
