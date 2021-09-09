import java.io.FileNotFoundException;
/**
* Driver class for marketing campaign list. 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-12-21
*/
public class MarketingCampaignPart3 {
   /**
   * Main method of class.
   * Allows for pass in of file name in command line arguments.
   * @param args command line arguments
   */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         String fileName = args[0];
         try {
            MarketingCampaignList mc = new MarketingCampaignList();
            mc.readFile(fileName);
         
            System.out.println(mc.generateReport());
            System.out.println();
         
            System.out.println(mc.generateReportByName());
            System.out.println();
         
            System.out.println(mc.generateReportByCampaignCost());
            System.out.println();
         
            System.out.println(mc.generateReportByROI());
            System.out.println();
            
            System.out.println(mc.generateInvalidRecordsReport());
            System.out.println();
         }
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: " 
               + fileName + " (No such file or directory)");
         }
      }   
   }
}