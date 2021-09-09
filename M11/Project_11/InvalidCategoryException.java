/**
* Invalid category exception.
*
* @author Nikhil Patel - COMP-1213- 001
* @version 4-12-21
*/
public class InvalidCategoryException extends Exception {
   /**
   * Creates an exception.
   * @param categoryIn category
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}