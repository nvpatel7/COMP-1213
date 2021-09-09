import java.util.Scanner;
 /** 
 * Displays the amount of units for a certain number of ounces 
 * Also utilizies the Scanner Class.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 1-24-2021
 */
public class PetroleumUnits
{
   /**
    * Displays the amount of units for a certain number of ounces.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {  
      Scanner userInput = new Scanner(System.in);
      int ounces = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int oz = 0;
      // prompts for a value of certain ounces
      System.out.print("Enter amount of petroleum in ounces: ");
      ounces = userInput.nextInt();
      if (ounces > 1000000000)
      { // prints an error message if value is above 1,000,000,000
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else
      { // prints each amount in barrels, gallons, quarts,and ounces
         System.out.println("Petroleum amount in units: ");
         // prints barrel amount
         barrels = ounces / 5376;
         System.out.println("\tBarrels: " + barrels);
         // prints gallon amount
         gallons = (ounces - (barrels * 5376)) / 128;
         System.out.println("\tGallons: " + gallons);
         // prints quart amount
         quarts = (((ounces - (barrels * 5376)) - (gallons * 128)) / 32);
         System.out.println("\tQuarts: " + quarts);
         // prints ounces amount
         oz = (((ounces - (barrels * 5376)) - (gallons * 128))
            - (quarts * 32));
         System.out.println("\tOunces: " + oz);
         // prints how we got each number to add up to
         System.out.println(ounces + " oz = (" + barrels + " bl * 5376 oz) "
                + "+ (" + gallons + " gal * 128 oz) + (" + quarts + " qt "
                + "* 32 oz) + (" + oz + " oz)");
      }
      
      
   }
}