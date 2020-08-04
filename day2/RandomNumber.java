package javascenario.day2;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter Boundary value");
		int boundary = data.nextInt();

		Random random = new Random();
		
		int a = random.nextInt(boundary);
		System.out.println("Random Number is : "+a);
	}

}
