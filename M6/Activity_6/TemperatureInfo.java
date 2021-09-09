import java.util.Scanner;
import java.util.ArrayList;
 /** 
 * A class to print information about a temperature.
 * Imports Array List.
 * Imports Scanner class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-19-2021
 *
 */
public class TemperatureInfo
{
   /**
   * Prints out temperatures and their high, low, maximum, and minimum.
   *
   * @param args - is not used.
   */
   public static void main(String[] args)
   {
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);
      
      String tempInput = "";
      do 
      {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do 
      {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvalid choice!");   
         }
      } while (choice != 'E');
      
   }
}