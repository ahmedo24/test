package COM.BPTN.COURSE.WEEK1;

import  java.util.Scanner;

public class Userinfo {

	public static void main(String[] args) {
		//Create an object from scanner class
		Scanner scanner= new Scanner(System.in);
		
		//Print a statement on the console
		System.out.println("Enter your name, favorite city, age and salary");
		
		//String Input
		String name= scanner.nextLine();
		
		//String Input
		String favCity= scanner.nextLine();
		
		//Numerical Input - integer
		int age= scanner.nextInt();
		
		//Numerical input to get the users salary
		double salary= scanner.nextDouble();
		
		//Output of all the inputs provided by the user
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Fav City :"+ favCity);
		System.out.println("Salary :"+ salary);
		
		scanner.close();
		
		
		
		
	}

}
