package b1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// Ask user to enter fullname
//		showFullName();
		
		// get hours
		getHours();

	}
	
	// Show fullname
	public static void showFullName() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your firstname ?");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your lastname ?");
		String lastName = scan.nextLine();
		
		System.out.println("Hi, " + firstName + " " + lastName);
	}
	
	// get hours from user
	public static void getHours() {
		int price = 20;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter hours ?");
		float hours = scan.nextFloat();
		
		if (hours < 40) {
			System.out.println("1 - You will get " + price * hours + " MAD");
		}
		else if(hours >= 40 && hours <= 60) {
			double extra = price + 0.5 * price;
			System.out.println("2 - Your compensation is " + extra);
			System.out.println("3 - The final price is " + (price*hours + extra));
		}else {
			System.out.println("4 - Incorrect info");
		}
		
		
		scan.close();
	}

}
