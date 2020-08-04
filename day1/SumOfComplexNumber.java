package javascenario.day1;

import java.util.Scanner;

public class SumOfComplexNumber {
		// TODO Auto-generated method stub
		int real,imag;
		
	SumOfComplexNumber(int r, int i)
		{
			this.real = r;
			this.imag = i;
		}
	
	public static SumOfComplexNumber sum(SumOfComplexNumber a, SumOfComplexNumber b) {
		SumOfComplexNumber cnum = new SumOfComplexNumber(0, 0);
		cnum.real=a.real+b.real;
		cnum.imag=a.imag+b.imag;
		
		return cnum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j,k,l,m;
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter the First Value");
		j = data.nextInt();
		System.out.println("Enter the Second Value");
		k= data.nextInt();
		System.out.println("Enter the Third Value");
		l= data.nextInt();
		System.out.println("Enter the Fourth Value");
		m= data.nextInt();
		
		SumOfComplexNumber a = new SumOfComplexNumber(j, k);
		SumOfComplexNumber b = new SumOfComplexNumber(l, m);
		
		SumOfComplexNumber cnum = sum(a,b);
		
		System.out.println("Sum of Two Complex Number is : "+cnum.real+"+"+cnum.imag+"i");
		
//		d= a%b;
//		System.out.println("Remainder of the Two Number is : " + d);

	}

}
