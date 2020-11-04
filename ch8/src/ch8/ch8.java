package ch8;
import java.util.*;

public class ch8 {

	public ch8() {
		print("hello");
		String x = input("will it work?");
		print(x);
		
	}
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		System.out.println(question);
		String x = input.nextLine();
		return x;
	}
	
	public static void main(String[] args) {
		new ch8();

	}

	public static void steve() {
		System.out.println("My name is steve");
	}
	public static void print(Object x) {
		System.out.println(x);
	}
	
	
}
