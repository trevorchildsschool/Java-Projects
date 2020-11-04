package chapter_6;

import java.util.*;

public class ch6_3 {

	public ch6_3() {
		Scanner input = new Scanner(System.in);
		double gpa = input.nextDouble(); //careful where you declare values
		
		
		System.out.println("Type your gpa as a number and decimal then press enter.");
		 //always good to go to next line
		
		if(input.hasNextDouble()) {
			
			input.nextLine(); 
		}
		else {
			System.out.println("that was not a gpa");
			gpa = 0.1;
		}
		System.out.println("Gpa is defined as " +gpa);
		
	
		 //careful where you declare values
		
		
		System.out.println("Type your gpa2 as a number and decimal then press enter.");
		 //always good to go to next line
		gpa = 0.0;
		while(!input.hasNextDouble()) {
			input.nextLine();
			
			
			
			System.out.println("test");
		}
		else {
			System.out.println("that was not a gpa");
			gpa2 = 0.1;
		}
		System.out.println("Gpa is defined as " +gpa);
		/*
		 * relation operators
		 * <
		 * (a>b && c<d) both true for it to execute
		 * >=
		 * =Assignment
		 * !=
		 * ==comparison
		 * && and
		 * || or
		 * ! n o t
		 * 
		 */
		
		
		
		input.close();
	}

	public static void main(String[] args) {
		new ch6_3();

	}

}
