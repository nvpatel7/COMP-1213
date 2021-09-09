 /** 
 * A class to do methods on a integer.
 * 
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-12-2021
 */
public class NumberOperations
{
   // instance variables
   private int number;
   // constructor
   /**
   * Constructs the class to do number operations.
   * @param numberIn the number we are working on.
   */
   public NumberOperations(int numberIn)
   {
      number = numberIn; 
   }   
   // methods
   /**
   * Gets the value of the number.
   * @return number
   */
   public int getValue()
   {
      return number;
   }
   /**
   * Performs an loop to find the odds of the number.
   * @return the output of the String.
   */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
   * Finds the powers of the give integer.
   * @return output of the String.
   */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
   * Method to see if a number is greater than a given number.
   * @return if variable is greater than other variables.
   * @param compareNumber compares the number.
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else 
      {
         return 0;
      }
   }
   /**
   * A toString method to return the number.
   * @return number
   */
   public String toString()
   {
      return number + "";
   }
}