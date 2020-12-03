package t2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		calculateSqrt();
//		volo();
//		coordinates(1, 2, 3);
	}
	
	// Sqrt
	public static void calculateSqrt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 0 to quit");
		
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter a number ?");
			float sq = scan.nextFloat();
			
			if (sq < 0) {
				System.out.println("Numbers should be positive only");
			}
			else if (sq == 0) {
				isRunning = false;
				System.out.println("exiting...");
			}
			else {
				System.out.println("The square root : " + Math.sqrt(sq));
			}
		}
		
		scan.close();
	}

	// benefit
	public static void volo() {
		System.out.println("Enter the months ?");
		Scanner scan = new Scanner(System.in);
		int numberOfMonths = scan.nextInt();
		
		System.out.println("The benefit is : " + numberOfMonths * 0.01);
		scan.close();
	}
	
	// coordinates
	public static void coordinates(int x, int y, int z) {
		System.out.println("X: " + x + ", Y: " + y + ", Z: " + z);
	}
}
