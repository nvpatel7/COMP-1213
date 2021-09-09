/** 
 * A class to give options of a bank loan.
 *
 * @author Nikhil Patel - COMP-1213- 001
 * @version 3-4-2021
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   // static variables
   private static int loansCreated = 0;
   
    /**
    * Constructs a bank loan.
    * @param customerNameIn takes the input for the users name.
    * @param interestRateIn takes the input for the intrest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
    /**
    * Determines if a loan was made.
    * @param amount input for the amount
    * @return returns if a loan was made
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
    /**
    * Method to return amount paid to bank.
    * @param amountPaid input for the amount paid
    * @return returns the amount that you need to pay the bank
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
    /**
    * Gets the balance.
    * @return returns the balance
    */   
   public double getBalance() {
      return balance;
   }
   
    /**
    * Mutator Method to set the interest rate.
    * @param interestRateIn takes in the intrest rate for the person
    * @return returns if the intrest rate was set
    */   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
    /**
    * Returns the interest rate.
    * @return returns the intrest rate
    */   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * Method to charge interest.
   */   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
    /**
    * toString method to make everything into String.
    * @return retuns the output fo the to string method
    */   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   //************************************************************
   //******************** Begin new methods *********************
   //************************************************************
   
    /**
    * Sees if amount is greater than or equal to 0.
    * @param amount input for the amout
    * @return retuns if it is greater than 0
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
    /**
    * Sees if person is in debt or not.
    * @param loan input for an object
    * @return retuns if you are in debt
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
    /**
    * Gets amount of loans created.
    * @return returns the amount of loans created
    */   
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * Resets loans created to 0.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}
