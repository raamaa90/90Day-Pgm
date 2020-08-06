package javascenario.day4;

import java.util.Scanner;

public class PyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "*";
		
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = value.nextInt(); 
		value.close();
				
		for (int i = 0; i <= num; i++) {
			for (int j=num-i; j>0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
			
			for (int j = 0; j < i; j++) {
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}

	}

}
