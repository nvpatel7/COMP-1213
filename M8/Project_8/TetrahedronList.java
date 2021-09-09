import java.text.DecimalFormat;
 /**
 * A class to make a tetrahedron list.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-21-2021
 */
 
public class TetrahedronList {
   private String listName;
   private Tetrahedron[] tList;
   private int arraySize;
   
   /**
   * Constructs a tetrahedron list.
   * @param listNameIn name of list.
   * @param tListIn array list.
   * @param arraySizeIn in size of the array.
   */
   public TetrahedronList(String listNameIn, Tetrahedron[] tListIn, 
                                                int arraySizeIn) {
      listName = listNameIn;
      tList = tListIn;
      arraySize = arraySizeIn;                                             
   }
   
   /**
   * Gets name of the list.
   * @return name of list.
   */
   public String getName() {
      return listName;
   }
   
   /**
   * Gets number of Tetrahedrons in the array.
   * @return number of objects in array
   */
   public int numberOfTetrahedrons() {
      if (arraySize > 0) {
         return arraySize;
      }
      return 0;
   }
   
   /**
   * Returns sum of total surface area.
   * @return total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      int i = 0;
      while (i < arraySize) 
      {
         total += tList[i].surfaceArea();
         i++;  
      }   
      return total;
   }
   
   /**
   * Returns total volume of the list.
   * @return total volume
   */
   public double totalVolume() {
      double total = 0;
      int i = 0;
      while (i < arraySize) 
      {
         total += tList[i].volume();
         i++;  
      }   
      return total;
   }
   
   /**
   * Calculates average surface area.
   * @return average surface area.
   */
   public double averageSurfaceArea() {
      double average = 0;
      if (arraySize > 0) {
         average = totalSurfaceArea() / arraySize;
         return average;
      }
      return average;
   }
   
   /**
   * Calculates average volume.
   * @return average volume
   */
   public double averageVolume() {
      double average = 0;
      if (arraySize > 0) {
         average = totalVolume() / arraySize;
         return average;
      }
      return average;      
   }
   
   /**
   * To string method.
   * @return a string output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Tetrahedrons: " + numberOfTetrahedrons();
      result += "\nTotal Surface Area: "  + df.format(totalSurfaceArea());
      result += " square units";
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += " cubic units";
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += " square units";
      result += "\nAverage Volume: "  + df.format(averageVolume());
      result += " cubic units";
      return result;
   }
   
   /**
   * Gets the array of Tetrahedrons.
   * @return list
   */
   public Tetrahedron[] getList() {
      return tList;
   }
   
   /**
   * Adds a tetrahedron to the array.
   * @param labelIn label of Tetrahedron
   * @param edgeIn edge of tetrahderon
   */
   public void addTetrahedron(String labelIn, double edgeIn) {
      Tetrahedron t = new Tetrahedron(labelIn, edgeIn);
      tList[arraySize] = t;
      arraySize++;
   }
   
   /**
   * Finds a tetrahedron from the array.
   * @param labelIn label of tetrahedron
   * @return the object found
   */
   public Tetrahedron findTetrahedron(String labelIn) {
      for (int i = 0; i < arraySize; i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return tList[i];
         }
      }
      return null;
   }
   
   /**
   * Deletes a tetrahedron in the array.
   * @param labelIn label of tetrahedron
   * @return the object deleted
   */
   public Tetrahedron deleteTetrahedron(String labelIn) {
      Tetrahedron result = findTetrahedron(labelIn);
      for (int i = 0; i < arraySize; i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int j = i; j < arraySize; j++) {
               tList[j] = tList[j + 1];
            }
            tList[arraySize--] = null;
         }
      }
      return result;         
   }
   
   /**
   * Edits a tetrahedron.
   * @param labelIn label of tetrahedron
   * @param edgeIn edge of tetrahedron
   * @return object edited.
   */
   public boolean editTetrahedron(String labelIn, double edgeIn) {
      for (int i = 0; i < arraySize; i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
            tList[i].setEdge(edgeIn);
            return true;
         }
      }
      return false;
   }
   
   /**
   * Finds the tetrahedron with largest volume.
   * @return tetrahedron with largest volume
   */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      Tetrahedron result;
      
      if (arraySize <= 0) {
         result = null;
      }
      else {
         double max = tList[0].volume();
         result = tList[0];
         for (int i = 0; i < arraySize; i++) {
            if (tList[i].volume() > max) {
               max = tList[i].volume();
               result = tList[i];
            }
         }
      }
      return result;  
   }
}