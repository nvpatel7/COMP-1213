import java.util.ArrayList;
import java.text.DecimalFormat;
 /** 
 * A class to print information about a cone list.
 * Imports Array List.
 * Imports Decimal Format
 * Imports Files.
 * Imports Files exception.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-20-2021
 */
public class ConeList
{
   // instance variables
   private String listName;
   private ArrayList<Cone> cList;
   
    // constructor
    /** 
    * Create ConeList object.
    * @param listNameIn for name
    * @param cListIn for cList
    */
   public ConeList(String listNameIn, ArrayList<Cone> cListIn)
   {
      listName = listNameIn;
      cList = cListIn;
   }
    
   // methods
   /** 
   * Gets the name for the cone list.
   * @return the name of the cone list.
   */
   public String getName()
   {
      return listName;
   }
   
   /**
   * Returns numebr of cones.
   * @return number of cones.
   * returns zero if there are no objects in the array   
   */
   public int numberOfCones()
   {
      if (cList.size() == 0)
      {
         return 0;
      }
      else
      {
         return cList.size();
      }
      
   }
   
   /**
   * Returns total base perimeter of cones in the array.
   * @return total base perimeter of cones in the array
   * returns zero if there are no objects in the array
   */
   public double totalBasePerimeter()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).basePerimeter();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total base area of cones in the array.
   * @return total base area of cones in the array
   * returns zero if there are no objects in the array
   *
   */
   public double totalBaseArea()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).baseArea();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total slant height of cones in the array.
   * @return total slant height of cones in the array
   * returns zero if there are no objects in the array
   *
   */
   public double totalSlantHeight()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).slantHeight();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total side area of cones in the array.
   * @return total side area of cones in the array
   * returns zero if there are no objects in the array
   *
   */
   public double totalSideArea()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).sideArea();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total surface area of cones in the array.
   * @return total surface area of cones in the array
   * returns zero if there are no objects in the array
   *
   */
   public double totalSurfaceArea()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).surfaceArea();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns total volume of cones in the array.
   * @return total volume of cones in the array
   * returns zero if there are no objects in the array
   *
   */
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      while (index < cList.size()) 
      {
         total += cList.get(index).volume();
         index++;  
      }   
      return total;
   }
   
   /**
   * Returns average surface area of cones in the array.
   * @return average surface area of cones in the array
   * returns zero if there are no objects in the array
   */
   public double averageSurfaceArea()
   {
      double total = 0;
      int index = 0;
      if (cList.size() == 0)
      {
         return 0;
      }
      else
      {
         while (index < cList.size()) 
         {
            total += cList.get(index).surfaceArea();
            index++;  
         }
      }   
      return (total / cList.size());
   }
   
   /**
   * Returns average volume of cones in the array.
   * @return average volume of cones in the array
   * returns zero if there are no objects in the array
   */
   public double averageVolume()
   {
      double total = 0;
      int index = 0;
      if (cList.size() == 0)
      {
         return 0;
      }
      else
      {
         while (index < cList.size()) 
         {
            total += cList.get(index).volume();
            index++;  
         }
      }   
      return (total / cList.size());
   }
   
    /** 
    * Returns String for the list of cones.
    * @return String for list 
    * (includes name of list and the cones)
    */
   public String toString()
   {
      String result = listName + "\n";
      int index = 0;
      while (index < cList.size()) 
      {
         result += "\n" + cList.get(index); 
         index++;  
      }   
      return result;
   }
   
    /** 
    * Returns Summary of the list of cones.
    * @return String for summary of the list 
    * (includes name of list and results for various method calls)
    */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + df.format(totalBasePerimeter()); 
      result += "\nTotal Base Area: "  + df.format(totalBaseArea());
      result += "\nTotal Slant Height: "  + df.format(totalSlantHeight());
      result += "\nTotal Side Area: "  + df.format(totalSideArea());
      result += "\nTotal Surface Area: "  + df.format(totalSurfaceArea());
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      return result;
   }      
}