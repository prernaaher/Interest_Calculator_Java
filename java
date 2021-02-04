package interestcalculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Prerna
 */
public class InterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   //welcome the user
	System.out.println("Welcome to the Interest Calculator App");
	System.out.println(); //print a blank line

	//construct a scanner object
	Scanner sc = new Scanner(System.in);

	//perform conversions until choice is value other than "y" or "Y"
	String choice = "y";
	while (choice.equalsIgnoreCase("y"))
	{

	//get input from the user
	System.out.print("Enter Loan Amount:\t");
	double loan = sc.nextDouble();
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String loanString = currency.format(loan);

	System.out.print("Enter Interest Rate:\t");
	double rate = sc.nextDouble();
	NumberFormat percent = NumberFormat.getPercentInstance();
	percent.setMaximumFractionDigits(3);//set max to three digits to the right of the decimal
	String rateString = percent.format(rate); 

	//calculate interest based on user loan and rate input
	double interest = loan * rate;
	BigDecimal intereString = new BigDecimal(Double.toString(interest));
	intereString = intereString.setScale(2, RoundingMode.HALF_UP);

	// display conversion result
	String message = "\nLoan Amount:\t" + loanString + "\nInterst Rate:\t" + rateString + "\nInterest:\t" + currency.format(intereString);
	System.out.println(message);

	//see if user wants to continue
	System.out.print("\nContinue? (y/n):\t");
	choice = sc.next();
	System.out.println();

		}//end while loop
	}//end main()
} //end class InterestCalculator
    
    
