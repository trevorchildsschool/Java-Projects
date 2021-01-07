package DogHouse;

public class Dog {
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Ruffer";
	
	/*	public String getName() {
			return this.name;
			
	}*/
		public void wakeUp() {
			System.out.println("WAKING UP");
			this.sleeping = this.setSleeping(false);
			this.numTimesFed = this.setNumTimesFed(0);
		
	}
		public int setNumTimesFed(int numTimesFed) {
			return this.numTimesFed = numTimesFed;
		}
		public boolean setSleeping(boolean sleeping) {
			return this.sleeping = sleeping;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void sleep() {
			this.sleeping = this.setSleeping(true);
			System.out.println("SLEEPING");
	}
		public void hear(String sound) {
			if (this.sleeping == true) { //== compares numerical values
				return;
			}
			
			else if (sound.equals(name)) {
				System.out.println("WAG TAIL");
			}
			else if (sound.equals("Doorbell")) {
				System.out.println("BARK");
			}
			else {
				return;
			}
			
	}
		public void feed() {
		if (this.sleeping == false) {
		this.numTimesFed ++;
		if (numTimesFed > 2) {
			System.out.println("YAWN");
			
		}
		else {
			System.out.println("YUMMY");
		}
		}
		else {
			return;
		}
	
	}
		
	
	public Dog() {
		
	}

}
