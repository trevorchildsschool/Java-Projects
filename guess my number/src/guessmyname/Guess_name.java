package guessmyname;

import java.util.*;
public class Guess_name {

	public Guess_name() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean win = false;
		int diff;
		int maxRange;
		int totalGuess;
		
		System.out.println("Easy, Medium or Hard");
		String result = input.nextLine();
		switch(result) {
		case "Easy":
			diff = 1;
			maxRange = 10;
			totalGuess = 3;
			break;
		case "Medium":
			diff = 2;
			maxRange = 50;
			totalGuess = 5;
			break;
		case "Hard":
			diff = 3;
			maxRange = 100;
			totalGuess = 5;
			break; //always put break or it will run through all cases
		case "easy":
			diff = 1;
			maxRange = 10;
			totalGuess = 3;
			break;
		case "medium":
			diff = 2;
			maxRange = 50;
			totalGuess = 5;
			break;
		case "hard":
			diff = 3;
			maxRange = 100;
			totalGuess = 5;
			break;
		default:
			diff = 4;
			maxRange = 1000;
			totalGuess = 1;
			win=true;
			break;
			
			
		}
	
		//getting a random number 1-10
		int Rnumber = random.nextInt(maxRange+1);
		
		int guess;
		
		System.out.println("welcome to the guess the number game good luck");
		System.out.println(String.format("you have %s guesses to get the number Good Luck",totalGuess)); //%s
		System.out.println("the number is 1-"+maxRange);
		
		String guessText = String.format("Pick a number between 1 and %s when ready and hit enter",maxRange);
		
		
		System.out.println(guessText);
		
	//guess 1
		if (!win) {
		if (input.hasNextInt());{
			guess = input.nextInt();
		}
		
			if (guess == Rnumber) {
				System.out.println("you got it good job");
				win =true;
			}
			else if (guess < Rnumber) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("Guess lower");
			}
			
			 {
			System.out.println("Not a valid guess you lost a guess");
		}
		}
		//guess 2
			if (!win) {
				System.out.println(guessText);
			 if (input.hasNextInt());{
					guess = input.nextInt();
				}
				
					if (guess == Rnumber) {
						System.out.println("You got it good job");
						win =true;
					}
					else if (guess < Rnumber) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess lower");
					}
					
					 {
					 
					System.out.println("Not a valid guess you lost a guess");
				}
			}
				if (!win) { //guess
					if (diff > 1) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
			
				if (!win) { //4
					if (diff > 1) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
				if (!win) { //5
					if (diff > 1) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
				if (!win) { //6
					if (diff > 2) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
				if (!win) { //7
					if (diff > 2) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
				
				if (!win) { //9
					if (diff > 2) {
						System.out.println(guessText);
						 if (input.hasNextInt());{
								guess = input.nextInt();
							}
							
								if (guess == Rnumber) {
									System.out.println("You got it good job");
									win =true;
								}
								else if (guess < Rnumber) {
									System.out.println("Guess higher");
								}
								else {
									System.out.println("Guess lower");
								}
								
								 {
								System.out.println("Not a valid guess you lost a guess");
							}	
					}
				}
			//technically 3rd guess
				if (!win || diff ==4) {
					 if (input.hasNextInt());{
							guess = input.nextInt();
						}
						
							if (guess == Rnumber) {
								System.out.println("you got it good job");
							}
							else if (guess < Rnumber) {
								System.out.println("Guess higher");
							}
							else {
								System.out.println("Guess lower");
							}
							
							 {
							System.out.println("Game over");
							
						}
							 
				}
			 
		input.close();
	}

	public static void main(String[] args) {
		new Guess_name();

	}

}
