import java.util.Scanner;
import java.text.DecimalFormat;
 /** 
 * Solves a specific equation.
 * Also utilizies the Scanner Class.
 * Decimal Format is also used.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 1-30-2021
 */
public class SolveIt
{
   /**
    * Solves an specific equation. 
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {  
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double result = 0;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      result = ((6 * Math.pow(x, 3)) + Math.sqrt((3 * Math.pow(x, 2))
         + (2 * x) + 1)) / ((Math.abs(2 * x)) + 4);
      // prints result
      System.out.println("Result: " + result);
      // makes a string variable that converts the variable result to string
      String result1 = Double.toString(result);
      // prints number of charcters left of decimal
      System.out.println("# of characters to left of decimal point: "
         + result1.indexOf(".", 0));
      // prints number of charcters right of decimal
      System.out.println("# of characters to right of decimal point: "
         +  (result1.length() - result1.indexOf(".", 0) - 1));
      // formats decimal place
      
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      System.out.println("Formatted Result: " + fmt.format(result));
   }
}