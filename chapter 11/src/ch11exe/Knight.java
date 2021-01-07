package ch11exe;

import java.util.Scanner;

public class Knight {
	private String name;
	
	public Knight() {
		Scanner input = new Scanner(System.in);
		System.out.println("what is your name");
		String inputname = input.nextLine();
		setName(inputname);
		
	}
	public Knight(String name) {
		this.setName(name);
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
