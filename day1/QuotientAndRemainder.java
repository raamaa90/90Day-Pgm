package javascenario.day1;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter the First Value");
		a = data.nextInt();
		
		System.out.println("Enter the Second Value");
		b= data.nextInt();
		
		c = a/b;
		System.out.println("Quotient of Two Number is : " + c);
		
		d= a%b;
		System.out.println("Remainder of the Two Number is : " + d);
		

	}

}
