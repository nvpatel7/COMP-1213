import java.text.DecimalFormat;
/**
* Creates a  direct marketing campaign class. 
* extends marketing campaign class
*
* @author Nikhil Patel - COMP-1213- 001
* @version 3-29-21
*/

public class DirectMC extends MarketingCampaign {
   private double costPerMailPiece;
   private int numberOfMailPieces;
   /**
   * public static constants.
   */
   public static final double BASE_COST = 1000;
   
   /** 
   * Constructs a DirectMC.
   * @param nameIn name of campaign
   * @param revenueIn revenue of campaign
   * @param costPerMailPieceIn cost of mail piece
   * @param numberOfMailPiecesIn number of pieces
   */
   public DirectMC(String nameIn, double revenueIn, double costPerMailPieceIn,
                    int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
   * Gets cost per mail piece.
   * @return cost per mail piece
   */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
   /**
   * Sets cost per mail piece.
   * @param costPerMailPieceIn cost of mail piece
   */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   
   /**
   * Gets number of mail pieces.
   * @return number of mail pieces
   */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
   /**
   * Sets the number of mail pieecs.
   * @param numberOfMailPiecesIn number of pieces
   */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
   * Calculates campaign cost.
   * @return campaign cost
   */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   }
   
   /**
   * To String method.
   * @return a string ouput
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Base Cost: " + df.format(BASE_COST)
         + "\n   Mail Cost: " + df.format(costPerMailPiece * numberOfMailPieces)
         + " = " + df.format(costPerMailPiece) + " per mail piece * "
         + numberOfMailPieces + " mail pieces";
   }
}
