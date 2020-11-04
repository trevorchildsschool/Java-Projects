package trevor.chapter4.lesson2;

public class Lesson2exe {

	public Lesson2exe() {
		//variable declaration
		float mygpa; // 4 bytes
		byte myage; //1 byte
		int bankAccountTotal; //4 bytes
		short numberOfHotDogsICanEat; //2 bytes
		long dreamtotal; //8 bytes
		final double pie = 3.14159; // 8 bytes
		boolean answer; // boolean data types true or false
		char letter;
		String name;
		
		bankAccountTotal = 0;
		numberOfHotDogsICanEat = 500;
		myage = 125;
		dreamtotal = 2500000000000l; //long needs an l
		mygpa = 10.5f; //float value needs letter f
		letter = 'a'; //single quote because its one letter
		answer = true; //only true or false statements
		
		//math operators
		/*
		 * -
		 * +
		 * *
		 *forward slash division 
		 * %
		 */
		bankAccountTotal = bankAccountTotal+34;
				System.out.println(bankAccountTotal);
		bankAccountTotal = bankAccountTotal-20;
				System.out.println(bankAccountTotal);
		bankAccountTotal = bankAccountTotal*500;
				System.out.println(bankAccountTotal);
		bankAccountTotal = bankAccountTotal/2;
				System.out.println(bankAccountTotal);
		myage = (byte) (myage % 5);
				System.out.println(myage);
		
				bankAccountTotal+=23; //short cut
				System.out.println(myage);
				
				myage++; //adds one each time it is executed
				myage--; //subtracts one each time its executed
		System.out.println(myage);
		
		double value1 = 7.7;
		int value2 = (int) (value1+0.5); //+0.5) adding .5 will round it up when needed
		
		int value3 = 7;
		double value4 = (int) ((int)value3 + 3.5);
		
		
		System.out.println(value4);
		
		System.out.println("value 4 is "+value4); //text added to it needs quotes and a +
		
		System.out.println("asd"); //println adds a new line
		System.out.print("asd");	//print makes it the same line
		System.out.print("asd");
		System.out.println("asd");
		
		System.out.println("I said, \"hi\""); //single quote or slashes (escape sequence)
		System.out.println("I Said, 'hi'"); //single quotes
		
		System.out.println("new line");
		
		System.out.println("carriage return:\r#\n");
		
		System.out.println("Tab:\t#\n");
		
		System.out.println("Backslash:\\\n");
		
	}

	public static void main(String[] args) {
		new Lesson2exe();

	}

}
