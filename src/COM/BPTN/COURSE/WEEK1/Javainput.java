package COM.BPTN.COURSE.WEEK1;

import java.util.Scanner;

public class Javainput {

	public static void main(String[] args) {
		//Created myObj which is the object of Scanner Class
		Scanner myObj= new Scanner(System.in);
		
		//Create a variable "userName" which is used to store the String data type
		String userNAME;
		
		//Ask the user to enter the username by oruntung "Enter Username" and read the input given by the user
		// Fill in the code for the above part below
		
		System.out.println("Enter the username : ");
		String userName = myObj.nextLine();
		
		//print the username on the console
		System.out.println("the username is " + userName);
		
	
		myObj.close();
		
	}

}
