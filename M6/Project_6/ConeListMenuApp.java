import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
/** 
 * A class to give options about a cone list.
 * Imports Array List.
 * Imports Files.
 * Imports Files exception.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-20-2021
 */
public class ConeListMenuApp
{
   /**
   * Class to give options for a cone list.
   * @param args - is not used.
   * @throws IOException if the file cannot be opened.
   */
   public static void main(String[] args) throws IOException
   {
      String cListName = "*** no list name assigned ***";
      ArrayList<Cone> myList = new ArrayList<Cone>();
      ConeList myCList = new ConeList(cListName, myList);
      String fileName = "no file name";
      String label = "";
      double height = 0, radius = 0;
      
      String code = "";
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Cone List System Menu\n"
                       + "R - Read File and Create Cone List\n"
                       + "P - Print Cone List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Cone\n"   
                       + "D - Delete Cone\n"   
                       + "F - Find Cone\n"
                       + "E - Edit Cone\n"
                       + "Q - Quit");
      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               
               myCList = myCList.readFile(fileName);
               
               System.out.println("\tFile read in and " 
                     + "Cone List created\n");
               break;
                  
            case 'P': 
               System.out.println("\n" + myCList);
               break;
               
            case 'S':
               System.out.println("\n" + myCList.summaryInfo() + "\n");
               break;
               
            case 'A': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
            
               myCList.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myCList.findCone(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  Cone d = myCList.deleteCone(label);
                  System.out.println("\t\"" + d.getLabel() + "\" deleted\n");
               }   
               break; 
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myCList.findCone(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  System.out.println(myCList.findCone(label));
               }   
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               
               if (myCList.findCone(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  myCList.editCone(label, height, radius);
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }   
               break;
               
            case 'Q':
               break;
                  
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      } while (!code.equalsIgnoreCase("Q")); 
   
   }
}
