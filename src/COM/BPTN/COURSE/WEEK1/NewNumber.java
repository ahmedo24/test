package COM.BPTN.COURSE.WEEK1;
import java.util.Scanner;

public class NewNumber {

	public static void main(String[] args) {
		
		// Create a scanner object from the scanner class
		Scanner myObj= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number= myObj.nextInt();
		
		if(number < 0) {
			System.out.println("The number is negative");
		}
		else if(number > 0) {
		System.out.print("The number is positive");
		}
		else {
			System.out.println("The number is zero");
		}
		
			myObj.close();
		}
		

	}


