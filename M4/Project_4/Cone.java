import java.text.DecimalFormat;
 /** 
 * A class to print information about a cone.
 * Imports decimal format.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 2-5-2021
 */
public class Cone
{
   // instance variables
   private String label;
   private double height;
   private double radius;   
   // constructor
   /**
   * Constructs the cone class to have a label, height, and radius.
   * @param labelIn is the label of the cone.
   * @param heightIn is the height of the cone.
   * @param radiusIn is the radius of the cone
   */
   public Cone(String labelIn, double heightIn, double radiusIn)
   {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }   
   // methods
   /** 
   * Gets the label for the cone.
   * @return the label of the cone
   */
   public String getLabel()
   {
      return label;
   }
   /** 
   * Sets the label for the cone.
   * @param labelIn the label of the cone.
   * @return if a label was set or not.
   */
   public boolean setLabel(String labelIn)
   {
      if (labelIn == null)
      {
         return false;
      }
      else 
      {
         label = labelIn.trim();
         return true;
      }
   }
   /** 
   * Gets the height for the cone.
   * @return the height of the cone.
   */
   public double getHeight()
   {
      return height;
   }
   /** 
   * Sets the height for the cone.
   * @param heightIn the height of the cone.
   * @return if a height was set or not and is greater than zero.
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn <= 0)
      {
         return false;
      }
      else 
      {
         height = heightIn;
         return true;
      }
   }
   /** 
   * Gets the radius for the cone.
   * @return radius of cone.
   */
   public double getRadius()
   {
      return radius;
   }
   /** 
   * Sets the radius for the cone.
   * @param radiusIn the height of the cone.
   * @return if a radius was set or not and is greater than zero.
   */
   public boolean setRadius(double radiusIn)
   {
      if (radiusIn <= 0)
      {
         return false;
      }
      else 
      {
         radius = radiusIn;
         return true;
      }
   }
   /** 
   * Calculates the perimeter of the cone.
   * @return base perimeter of the cone.
   */
   public double basePerimeter()
   {
      return (2 * (Math.PI) * radius);
   }
   /** 
   * Calculates base area of the cone.
   * @return base area of the cone
   */
   public double baseArea()
   {
      return (Math.PI * (Math.pow(radius, 2)));
   }
   /**
   * Calculates slant height of the cone.
   * @return slant height of the cone.
   */
   public double slantHeight()
   {
      return (Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
   }
   /**
   * Calculates side area of the cone.
   * @return side area of the cone.
   */
   public double sideArea()
   {
      return (Math.PI * radius * slantHeight());
   }
   /**
   * Calculates total surface area of the cone.
   * @return total surface area of the cone.
   */
   public double surfaceArea()
   {
      return (Math.PI * radius * (radius + slantHeight()));
   }
   /**
   * Calculates volume of the cone.
   * @return volume of the cone.
   */
   public double volume()
   {
      return ((Math.PI * (Math.pow(radius, 2)) * height) / 3);
   }
   /**
   * A toString method to convert all cone information into a string.
   * @return String representation of the cone information.
   */
   public String toString()
   {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output =  "\"" + getLabel() + "\"" + " is a cone with height = " 
         + getHeight() + " units and radius = " + getRadius()
         + " units, \nwhich has base " + "perimeter = " 
         + df1.format(basePerimeter()) + " units, base area = "
         + df1.format(baseArea()) + " square units, \nslant height = "
         + df1.format(slantHeight()) + " units, side area = " 
         + df1.format(sideArea()) + " square units, \nsurface area = "
         + df1.format(surfaceArea()) + " square units, and volume = "
         + df1.format(volume()) + " cubic units." + "\n";       
      return output;   
   }
}