import java.io.IOException;
/**
* Driver class for marketing campaign list. 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-5-21
*/
public class MarketingCampaignPart2 {
   /**
   * Main method of class.
   * Allows for pass in of file name in command line arguments.
   * @param args command line arguments
   * @throws IOException if file cannot be opened
   */
   public static void main(String[] args) throws IOException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         MarketingCampaignList mc = new MarketingCampaignList();
         mc.readFile(args[0]);
         
         System.out.println(mc.generateReport());
         System.out.println();
         
         System.out.println(mc.generateReportByName());
         System.out.println();
         
         System.out.println(mc.generateReportByCampaignCost());
         System.out.println();
         
         System.out.println(mc.generateReportByROI());
         System.out.println();
      }   
   }
}