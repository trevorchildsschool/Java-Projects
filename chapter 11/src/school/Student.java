package school;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Student {
	private String name;
	private int ssid;
	private String bday;
	private double gpa;
	private String health;
	
	public Student(String name, int ssid, String bday, double gpa, 
			String health, String address, int year,
			int lunch_number, String email, int phone) {	
		super();
		this.name = name;
		this.ssid = ssid;
		this.bday = bday;
		this.gpa = gpa;
		this.health = health;
		this.address = address;
		this.year = year;
		this.lunch_number = lunch_number;
		this.email = email;
		this.phone = phone;
		totalStudents ++;
	}

	public Student(double gpa, int year) {
		super();
		this.gpa = gpa;
		this.year = year;
	}
	private String genId( ) {
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2 = rand.nextInt(10);
		String pos2 = Integer.toString(num1);
		int num3 = rand.nextInt(10);
		String pos3 = Integer.toString(num1);int num4 = rand.nextInt(10);
		int num4 = rand.nextInt(10);
		String pos4 = Integer.toString(num1);
		int num5 = rand.nextInt(10);
		String pos5 = Integer.toString(num1);
		int num6 = rand.nextInt(10);
		String pos6 = Integer.toString(num1);
		int num7 = rand.nextInt(10);
		String pos7 = Integer.toString(num1);
		int num8 = rand.nextInt(10);
		String pos8 = Integer.toString(num1);
		String id = pos1=pos2+pos3+pos4+pos5+pos6+pos7+pos8;
		
		return id;
	}
	private int genLunchnum(String id, int grade) {
		int lunchnum;
		String x = id + Integer.toString(grade);
		return lunchnum = Integer.parseInt(x);
	}
	
	
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		setName (input.nextLine());
		System.out.println("Enter your birthday");
		setBday(input.nextLine());
		System.out.println("Enter your gpa");
		setGpa(input.nextDouble());
		System.out.println("Enter your health");
		setHealth(input.nextLine());
		System.out.println("Enter your address");
		setAddress(input.nextLine());
		System.out.println("Enter your year");
		setYear(input.nextInt());
		System.out.println("Enter your email");
		setEmail(input.nextLine());
		System.out.println("Enter your phone");
		setPhone(input.nextInt());
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsid() {
		return ssid;
	}

	public void setSsid(int ssid) {
		this.ssid = ssid;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLunch_number() {
		return lunch_number;
	}

	public void setLunch_number(int lunch_number) {
		this.lunch_number = lunch_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	private String address; 
	private int year;
	private int lunch_number;
	private String email;
	private Classes[] classes;
	private int phone;
	
	private void pickClasses() {
		String[] classList = {
				"ELA",
				"Math",
				"History",
				"Science",
				"Promgramming_Java",
				"Promgramming_Python",
				"Promgramming_C_Sharp",
				"PE",
				"Pro_Start",
				"Cosmo",
				"Health",
				"Internship",
				"Accounting",
				"Business",
				"Auto",
				"Woods",
				"Metals",
				"A_plus"};
				
		classList[0] = "Math";
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("what class would you like for period 1");
		String inputclass = input.nextLine();
		if (inputclass.equals("math")) {
			classes[0] = Classes.Math;
		}
		else if (inputclass.equals("english")) {
			classes[0] = Classes.ELA;
		}
		else {
			classes[0] = Classes.Promgramming_Java;
		}
	}
	
	public Student(String name) {
		this.name = name;
	}

}
