package javascenario.day3;

public class MethodOverriding {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int sum(int a, int b,int c, int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding add =new MethodOverriding();
		
		System.out.println("Sum of Two Numbers : "+add.sum(2, 4));
		System.out.println("Sum of Three Numbers : "+add.sum(5, 7, 4));
		System.out.println("Sum of Four Numbers : "+add.sum(12, 43, 54, 76));
	}

}
