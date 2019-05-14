import java.util.Scanner;

public class IncrementingInput {

	public static void main (String [] args) {
	      //create a Scanner to read from System.in
	      Scanner scnr = new Scanner(System.in);
	       //prompt the user for input
	      System.out.println("Please enter a number: ");
	      //get an integer from the user with your Scanner
	      int intPut = scnr.nextInt();
	      //add 1 to the variable holding the input
	      int sum;
	      sum = intPut + 1;
	      System.out.println(sum);
	      //output the variable
	   }
	}

