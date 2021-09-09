/**
* Creates a online article.
* Extends the OnlineTextItem class
* @author Nikhil Patel - COMP-1213- 001
* @version 3-26-21
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
   * Constructs an online article.
   * @param nameIn name of item
   * @param priceIn price of item
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   * Sets the word count.
   * @param wordCountIn word count of article
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}