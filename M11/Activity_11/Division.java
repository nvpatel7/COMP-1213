/**
* Divide class to divide 2 numbers.
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-9-21
*/
public class Division {
   /**
   * Static method to return an int when dividing 2 numbers.
   * @param num numerator
   * @param denom denominator
   * @return quotient as an int
   */
   public static int intDivide(int num, int denom) {
      try
      {
         return num / denom; 
      }
      catch (ArithmeticException e)
      {
         return 0;
      }     
   }
   
   /**
   * Static method to return a double when dividing 2 numbers.
   * @param num numerator
   * @param denom denominator
   * @return quotient as a double
   * @throws IllegalArgumentException if denom = 0
   */
   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
              + "cannot be zero.");
      }
      return (double) num / (double) denom;
   }
}