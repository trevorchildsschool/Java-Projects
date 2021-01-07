package DogHouse;

public class Home {

	public Home() {
		
	}

	public static void main(String[] args) {
		Dog myDog = new Dog();
		String name = myDog.getName();
		System.out.println("A day in the life of my dog "+name);
		myDog.wakeUp();
		myDog.feed();
		myDog.hear("Doorbell");
		myDog.hear("Doorbell");
		myDog.hear(name);
		myDog.hear("Doorbell");
		myDog.hear("Doorbell");
		myDog.feed();
		myDog.feed();
		
		System.out.println("\nNight time");
		myDog.sleep();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.wakeUp();
		
		System.out.println("\nGood morning");
		myDog.hear("Doorbell");
		myDog.feed();
		myDog.feed();
		myDog.feed();
		
		myDog.sleep();
		
	}

}
