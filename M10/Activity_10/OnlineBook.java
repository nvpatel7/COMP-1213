/**
* Creates a online book.
* Extends the OnlineTextItem class
* @author Nikhil Patel - COMP-1213- 001
* @version 3-26-21
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
   * Constructs an online book.
   * @param nameIn name of item
   * @param priceIn price of item
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   * A to String method.
   * @return a string output
   */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }      
   
   /**
   * Sets the author.
   * @param authorIn author of book
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}