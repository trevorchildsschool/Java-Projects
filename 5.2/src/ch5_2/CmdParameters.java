package ch5_2;

public class CmdParameters {

	public static void main(String[] args) {
		int numArgs = args.length;
		
		if (numArgs > 0) {
		System.out.println(args[0]);
		}		
		if (numArgs > 1) {
		System.out.println(args[1]);
		}
		if (numArgs > 2) {
		System.out.println(args[2]);
		}
		if (args[0].equals("Hello")) {
			System.out.println("hello would be your help menu");
		}
}
}