 /** 
 * A class to hold values in an array.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-19-2021
 */
public class Scores {
   private int[] numbers;
   
   /**
   * Constructs a score.
   * @param numbersIn number array.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;  
   }
   
   /**
   * Finds evens of the scores.
   * @return even numbers.
   */
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }  
      return evens;   
   }
   
   /**
   * Finds odds of the scores.
   * @return odd numbers.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }  
      return odds;  
   }
   
   /** 
   * Calculates the average of the scores.
   * @return average of scores.
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / (double) numbers.length;
   }
   
   /**
   * To string method to make everything a String.
   * @return the string for the class
   */
   public String toString() {
      String result = "";
     
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
   /**
   * String method to return a string containing all scores in reverse.
   * @return reverse order of scores.
   */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }   
   
   
   
}