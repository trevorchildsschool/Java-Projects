package guessmyname;

import java.util.Random;
import java.util.Scanner;

public class guessMyNumber1_2 {

	public guessMyNumber1_2() {
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
		
		
		
		int guess_count = 0;
		while((guess_count != totalGuess) && (win==false)) {
			System.out.println(guessText);
		
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
				 guess_count++;
		}
		if (win == true) {
			System.out.println("You won"); 
		}
		
		input.close();
		}
		
		
		
		
		
		
		
	
		
	public static void main(String[] args) {
		new guessMyNumber1_2();

	}

}
