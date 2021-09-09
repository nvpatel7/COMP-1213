import java.util.Scanner;
import java.text.DecimalFormat;
 /** 
 * Gives information about a ticket to Mars.
 * Also utilizies the Scanner Class.
 * Decimal Format is also used.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 1-30-2021
 */
public class MarsTicket
{
   /**
    * Gives information about a ticket to Mars.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {  
      Scanner userInput = new Scanner(System.in);
      String code = "";
      double price = 0;
      double discount = 0;
      double cost = 0;
      int prizeNumber = (int) (Math.random() * 999999) + 1;
      System.out.print("Enter ticket code: ");
      code = userInput.nextLine();
      code = code.trim();
      if (code.length() < 27)
      { // prints error message
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
      else
      { // prints out ticket information
         System.out.println("\nTicket: " + code.substring(26)
            + "   Date: " + code.substring(15, 17) + "/" 
            + code.substring(17, 19) + "/" + code.substring(19, 23)
            + "   Time: " + code.substring(11, 13) + ":" 
            + code.substring(13, 15)); 
         // turns price discount and cost into doubles
         price = Double.parseDouble(code.substring(0, 7));
         discount = Double.parseDouble(code.substring(9, 11)) / 100;
         cost = price - (price * discount);
         // formatting for decimals 
         DecimalFormat fmt = new DecimalFormat("$#,##0.00");
         DecimalFormat disc = new DecimalFormat("0%");
         DecimalFormat prize = new DecimalFormat("000000");
         // output for information
         System.out.println("Seat: " + code.substring(23, 26)
            + "   Price: " + fmt.format(price)
            + "   Discount: " + disc.format(discount)
            + "   Cost: " + fmt.format(cost));
         System.out.println("Prize Number: " + prize.format(prizeNumber)); 
      }
   }
}