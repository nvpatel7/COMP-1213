import java.util.Scanner;
 /** 
 * Solves a certain expression. 
 * Also utilizies the Scanner Class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 1-24-2021
 */
public class ExpressionSolver
{
   /**
    * Solves an expression.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {  
      Scanner userInput = new Scanner(System.in);
      double result = 0;
      double x = 0;
      double y = 0;
      double z = 0;
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75) / xyz");
      //prompts user for variable x
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      //prompts user for variable y
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      //prompts user for variable z
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      if (x * y * z == 0)
      { // prints that result is udefined
         System.out.println("result is " + "\"undefined\"");
      }
      else
      { // prints the result
         result = ((9 * x + 6.25) * (6 * y - 4.5) * (3 * z + 2.75))
            / (x * y * z);
         System.out.println("result = " + result);
      }
   }
}   
