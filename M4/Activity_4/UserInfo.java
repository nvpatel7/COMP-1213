 /** 
 * A class to print information about a user.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-5-2021
 */
public class UserInfo
{
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;         
   // constructor 
   /**
   * Constructs the information about the user. 
   * @param firstNameIn The first name of user.
   * @param lastNameIn The last name of user.     
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /**
   * A method that returns the given output as a string.
   * @return String representation of user information.
   */
   public String toString()
   {
      String output = "Name: " + firstName + " " 
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      
      return output;
   }
   /**
   * Sets the Location.
   * @param locationIn The location of the user.
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   /**
   * Sets age and returns a false statement if age is not greater than 0.
   * @return If an age was set or not
   * @param ageIn The age of the user
   */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;     
   }
   /** 
   * returns age.
   * @return The age of the user.
   */
   public int getAge()
   {
      return age;
   }
   /** 
   * returns location.
   * @return The location of the user.
   */
   public String getLocation()
   {
      return location;
   }
   /**
   * Method to show that user is offline.
   */
   public void logOff()
   {
      status = OFFLINE;
   }
   /**
   * Method to show that user is online.
   */
   public void logOn()
   {
      status = ONLINE;
   }
}