import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
/**
* Creates a marketing campaign list. 
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-12-21
*/
public class MarketingCampaignList {
   private MarketingCampaign[] mcList;
   private String[] invalidRecords;
   
   /**
   * Constructs a MarketingCampaign List.
   */
   public MarketingCampaignList() {
      mcList = new MarketingCampaign[0];
      invalidRecords = new String[0];
   }
   
   /**
   * Gets the marketing campaign array.
   * @return the array
   */
   public MarketingCampaign[] getMarketingCampaignArray() {
      return mcList;
   }
   
   /**
   * Gets the marketing campaign array.
   * @return the array
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /**
   * Adds a marketing campaign.
   * @param obj object of the campaign
   */
   public void addMarketingCampaign(MarketingCampaign obj) {
      mcList = Arrays.copyOf(mcList, mcList.length + 1);
      mcList[mcList.length - 1] = obj;
   }
   
   /**
   * Adds an invlaid record.
   * @param record invalid record
   */
   public void addInvalidRecord(String record) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = record;
   }
   
    /**
   * Reads the file and splits up the parts.
   * @param dataFileName name of file
   * @throws FileNotFoundException if the file cannot be opened.
   */
   public void readFile(String dataFileName) throws FileNotFoundException {
      Scanner scan = new Scanner(new File(dataFileName));   
      
      while (scan.hasNext()) {
         String x = scan.nextLine().trim();
         Scanner scanMC = new Scanner(x);
         scanMC.useDelimiter(",");
         char code = scanMC.next().charAt(0); 
         String name;
         double revenue;
         double cpmp;
         int nomp;
         double cpa;
         int noa;
         
         switch(code) {
            case 'D':
               try {
                  name = scanMC.next().trim();
                  revenue = Double.parseDouble(scanMC.next());
                  cpmp = Double.parseDouble(scanMC.next());
                  nomp = Integer.parseInt(scanMC.next()); 
               
                  addMarketingCampaign(
                     new DirectMC(name, revenue, cpmp, nomp)); 
               }
               catch (NoSuchElementException e) {
                  String output = x + "\n" + e + ": For missing input data";
                  addInvalidRecord(output);
               }
               catch (NumberFormatException e) {
                  String output = x + "\n" + e;
                  addInvalidRecord(output);
               }
               break;
            
            case 'I':
               try {
                  name = scanMC.next().trim();
                  revenue = Double.parseDouble(scanMC.next());
                  cpa = Double.parseDouble(scanMC.next());
                  noa = Integer.parseInt(scanMC.next()); 
               
                  addMarketingCampaign(
                     new IndirectMC(name, revenue, cpa, noa)); 
               }
               catch (NoSuchElementException e) {
                  String output = x + "\n" + e + ": For missing input data";
                  addInvalidRecord(output);
               }
               catch (NumberFormatException e) {
                  String output = x + "\n" + e;
                  addInvalidRecord(output);
               }
               break;
               
            case 'M':
               try {
                  name = scanMC.next().trim();
                  revenue = Double.parseDouble(scanMC.next());
                  cpa = Double.parseDouble(scanMC.next());
                  noa = Integer.parseInt(scanMC.next()); 
               
                  addMarketingCampaign(
                     new SocialMediaMC(name, revenue, cpa, noa)); 
               }
               catch (NoSuchElementException e) {
                  String output = x + "\n" + e + ": For missing input data";
                  addInvalidRecord(output);
               }
               catch (NumberFormatException e) {
                  String output = x + "\n" + e;
                  addInvalidRecord(output);
               }
               break;
            
            case 'S':      
               try {
                  name = scanMC.next().trim();
                  revenue = Double.parseDouble(scanMC.next());
                  cpa = Double.parseDouble(scanMC.next());
                  noa = Integer.parseInt(scanMC.next()); 
               
                  addMarketingCampaign(
                     new SearchEngineMC(name, revenue, cpa, noa)); 
               }
               catch (NoSuchElementException e) {
                  String output = x + "\n" + e + ": For missing input data";
                  addInvalidRecord(output);
               }
               catch (NumberFormatException e) {
                  String output = x + "\n" + e;
                  addInvalidRecord(output);
               }
               break;
               
            default:
               InvalidCategoryException e = new 
                  InvalidCategoryException(String.valueOf(code));
               String output = x + "\n" + e;
               addInvalidRecord(output);
               break;
         }
      }
   }
   
   /**
   * Generates a report.
   * @return a report in String
   */
   public String generateReport() {
      String report = "-------------------------------\n"
         + "Marketing Campaign Report\n"
         + "-------------------------------";
      
      for (MarketingCampaign mc : mcList) {
         report += "\n\n" + mc.toString();  
      }
      return report;
   }
   
   /**
   * Generates a report by name.
   * @return a report in String
   */
   public String generateReportByName() {
      Arrays.sort(getMarketingCampaignArray());
      
      String report = "-----------------------------------------\n"
         + "Marketing Campaign Report (by Name)\n"
         + "-----------------------------------------";
      
      for (MarketingCampaign mc : mcList) {
         report += "\n\n" + mc.toString();  
      }
      return report;
   }
   
   /**
   * Generates a report by lowest campaign cost.
   * @return a report in String
   */
   public String generateReportByCampaignCost() {
      Arrays.sort(getMarketingCampaignArray(), new CampaignCostComparator());
      
      String report = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Lowest Campaign Cost)\n"
         + "-------------------------------------------------";
      
      for (MarketingCampaign mc : mcList) {
         report += "\n\n" + mc.toString();  
      }
      return report;
   }
   
   /**
   * Generates a report by sorting the ROI from highest to lowest.
   * @return a report by a String
   */
   public String generateReportByROI() {
      Arrays.sort(getMarketingCampaignArray(), new ROIComparator());
      
      String report = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Highest ROI)\n"
         + "-------------------------------------------------";
      
      for (MarketingCampaign mc : mcList) {
         report += "\n\n" + mc.toString();  
      }
      return report;
   }
   
   /**
   * Generates Invalid Records.
   * @return invalid records
   */
   public String generateInvalidRecordsReport() {
      String output = "";
      output += "----------------------\n";
      output += "Invalid Records Report\n";
      output += "----------------------";
      
      for (String x : invalidRecords) {
         output += "\n\n" + x.toString();
      } 
      return output; 
   }
}