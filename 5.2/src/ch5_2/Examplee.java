package ch5_2;

public class Examplee {

	public Examplee() {
		String storedUsername;
		String storedPassword;
		
		storedUsername = "captainbob";
		storedPassword = "ahoy";
		
		String inputUsername = "CAPTAINBOB";
		String inputPassword = "Ahoy";
		
		boolean username = false;
		boolean password = false;
		
		
		if (storedUsername.equalsIgnoreCase(inputUsername)) {
			username = true;
		}
		if (storedPassword.equals(inputPassword));{
			password = true;
			}
		
		if (username) {
			if(password) {
				System.out.println("you get in");
			}
			else {
				System.out.println("you didnt get in");
			}
		
		
		}

	}

	public static void main(String[] args) {
		new Examplee();
		
		
		// TODO Auto-generated method stub

	}

}
