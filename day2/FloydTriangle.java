package javascenario.day2;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fnumber,size,interval,num;
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter the Starting Number");
		fnumber = data.nextInt();
		
		System.out.println("Enter the Tower Size");
		size = data.nextInt();
		
		System.out.println("Enter the Interval Size");
		interval = data.nextInt();
		
		System.out.println("Floyd's Triangle is : ");
		
		for (int i = 0; i < size; i++)
		{
			num=fnumber;
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(num + " ");
				num=num+interval;
			}
		
			System.out.println();
		}
	}

}
