package chapter_6;

import java.util.*;

public class Ch6_2 {
	
	public Ch6_2() {
		Scanner input = new Scanner(System.in); //Scanner is for getting user input with characters
		//(the input can be named anything)
		/*System.out.println("Type your username and press enter. \n"); // \n will make a new line
		String userName = input.nextLine(); //getting the actual input
		
		System.out.println("Type your age as a number and press enter.");
		int userAge = input.nextInt();
		
		userAge+=5;  //can fully use as int value 
		input.nextLine();
		
		System.out.println("Type your job title and hit enter.");
		String jobTitle = input.nextLine();
		
		System.out.println("Type a boolean and press enter.");
		boolean inputbool = input.nextBoolean(); //true or false
	
		System.out.println("Type a Double and press enter.");
		double inputdouble = input.nextDouble(); //decimal
		
		System.out.println("Age is defined as " +userAge);
		
		String num = Integer.toString(3);
		
		
		System.out.println("Hello " +userName);
		System.out.println("Age is defined as " +userAge);
		System.out.println("Job title is defined as " +jobTitle);
		System.out.println("Test boolean is defined as " +inputbool);
		System.out.println("Test double defined as " +inputdouble);
		*/
		System.out.println("Enter a number");
		int test2 = input.nextInt();
		String test5 = input.next();
		int test3 = input.nextInt();
		int test4 = input.nextInt();
		
		System.out.println(test2);
		System.out.println(test5);
		System.out.println(test3);
		System.out.println(test4);
	}

	public static void main(String[] args) {
		new Ch6_2();

	}

}
