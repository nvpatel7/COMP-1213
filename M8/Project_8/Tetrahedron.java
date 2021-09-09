import java.text.DecimalFormat;
 /** 
 * A class to make a tetrahedron.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-7-2021
 */
 
public class Tetrahedron implements Comparable<Tetrahedron> {

   // instance variables
   private String label = "";
   private double edge = 0;

   // static variables
   private static int count = 0;

   // constructor   
   /**
   * Constructs a tetrahedron.
   * @param labelIn label of the tetrahedron.
   * @param edgeIn the edge of the tetrahedron.
   */   
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   //methods
   /** 
   * method to get the label of the tetrahedron.
   * @return the label of the tetrahedron.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * sets the label of the tetrahedron.
   * @param labelIn takes the label for the method.
   * @return true the boolean if the variable was set.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   
   /** 
   * method to get the label of the tetrahedron.
   * @return the label of the tetrahedron.
   */
   public double getEdge() {
      return edge;
   }
   
   /**
   * sets the edge of the tetrahedron.
   * @param edgeIn takes the edge for the method.
   * @return true the boolean if the variable was set.
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   
   /**
   * calcuates height of the tetrahedron.
   * @return height of tetrahedron.
   */
   public double height() {
      return (Math.sqrt((double) 2 / (double) 3) * (edge));
   }
   
   /**
   * Calculates surface area of tetrahedron.
   * @return surface area of tetrahedron.
   */
   public double surfaceArea() {
      return (Math.sqrt(3) * Math.pow(edge, 2));
   }
   
   /**
   * Calculates volume of tetrahedron.
   * @return volume area of tetrahedron.
   */
   public double volume() {
      return ((Math.pow(edge, 3)) / ((double) 6 * Math.sqrt((double) 2)));
   }
   
    /**
    * A method to return everything to string.
    * @return returns the string to be printed for the main method.     
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "Tetrahedron \"" + label + "\" with six "
         + "edges of length " + edge + " has:\n\t"
         + "height = " + fmt.format(height()) + " units\n\t"
         + "surface area = " + fmt.format(surfaceArea()) + " square units\n\t"
         + "volume = " + fmt.format(volume()) + " cubic units\n\t";
   }
   
   /**
   * Gets the count of tetrahedrons created.
   * @return count
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * resets count to 0.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * equals method to see if an object is a tetrahedron.
   * @param obj the input for an object.
   * @return to see if object is a tetrahedron.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      } 
      else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                     && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   
   /**
   * Hash code method.
   * @return 0
   */
   public int hashCode() {
      return 0;
   }   
   
   /**
   * compareTo method to compare customers.
   * @param obj object to compare
   * @return an int depending on the conditions
   */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }

}