package javascenario.day3;

public class CharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'H';
		int b = a;
		System.out.println(b);
		
		char c = 'h';
		int d = Character.getNumericValue(c);
		System.out.println(d);
		
		char e = '1';
		int f = Integer.parseInt(String.valueOf(e));
		System.out.println(f);
	}

}
