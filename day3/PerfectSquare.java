package javascenario.day3;

import java.util.Scanner;

public class PerfectSquare {
	
	public static boolean checkperfectsquare(int a) {
		double sqrt = Math.sqrt(a);
		
		return (sqrt - Math.floor(sqrt) == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = value.nextInt(); 
		value.close();

		if (checkperfectsquare(num)) 
			System.out.print(num+ " is a perfect square number"); 
		else
			System.out.print(num+ " is not a perfect square number"); 
	    } 
	}

