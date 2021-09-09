import java.util.Scanner;
 /** 
 * A class to print information about a user.
 * Imports Scanner class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-5-2021
 */
public class ConeApp
{
   /**
   * Creates a cone with the cone class.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) 
   {
      String coneLabel;
      double coneHeight;
      double coneRadius;
      Cone cone;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter label, height, and radius for a cone.");
      System.out.print("\tlabel: ");  
      coneLabel = input.nextLine();
      System.out.print("\theight: ");
      coneHeight = Double.parseDouble(input.nextLine());
      if (coneHeight <= 0)
      {
         System.out.println("Error: height must be greater than 0.");
      }
      else
      {
         System.out.print("\tradius: ");
         coneRadius = Double.parseDouble(input.nextLine());
         if (coneRadius <= 0)
         {
            System.out.println("Error: radius must be greater than 0."); 
         }
         else
         {
            cone = new Cone(coneLabel, coneHeight, coneRadius);
            System.out.println(cone);
         }
      }
   }
}