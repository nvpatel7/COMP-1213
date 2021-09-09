import java.util.ArrayList;
 /** 
 * A class to print information about a temperature.
 * Imports Array List.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-19-2021
 *
 */
public class Temperatures
{
   // instance variables
   private ArrayList<Integer> temperatures;
   
   // Constructor
   /** 
    * Create temperature object.
    * @param temperaturesIn for temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   // methods   
   /** 
   * Gets the low temperature.
   * @return the low temperature.
   */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /** 
   * Gets the high temperature.
   * @return the high temperature.
   */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp; 
         }
      }
      return high;
   }
   
   /**
   * Gets the lower minimum temperature.
   * @param lowIn to get lower minimum.
   * @return the lower minimum.
   */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * Gets the higher maximum temperature.
   * @param highIn to get higher maximum.
   * @return the higher maximum.
   */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   * A toString method to return everything as a String.
   * @return String of temperatures.
   */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
}