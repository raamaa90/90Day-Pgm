package javascenario.day4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a Year:");
		int year = value.nextInt(); 
		value.close();
		
		if (year%4 == 0) {
			System.out.println("Year "+year+" is a Leap year");
		}
		else {
			System.out.println("Year "+year+" is not a Leap year");
		}
	}

}
