import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
 /** 
 * A class to print information about a cone list.
 * Imports Array List.
 * Imports Scanner class.
 * Imports Files.
 * Imports Files exception.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-13-2021
 */
public class ConeListApp
{
   /**
   * Reads file with cone data, creates ConeList, prints ConeList,
   * prints summary of ConeList.
   *
   * @param args - is not used.
   * @throws FileNotFoundException required by Scanner for File
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Cone> list = new ArrayList<Cone>();
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = userInput.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      String coneListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) 
      {
         String label = scanFile.nextLine();
         double height = Double.parseDouble(scanFile.nextLine());
         double radius = Double.parseDouble(scanFile.nextLine());
         
         Cone c = new Cone(label, height, radius);
         list.add(c);           
      }
      
      ConeList cList = new ConeList(coneListName, list);
   
      System.out.println("\n" + cList);
      
      System.out.println("\n" + cList.summaryInfo());
   
   }
}