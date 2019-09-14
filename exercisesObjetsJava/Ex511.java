package exerciceObjetSousProg;

import java.util.Scanner;

public class Ex511 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("un nombre");
		int num1 = input.nextInt();
		if (num1 < 0 ) {
			throw new IsNegative();
		}
		System.out.println("un autre nombre");
		
		int num2 = input.nextInt();
		if (num2 == 0) {
			throw new IsZero();
		}
		if (num2 < 0 ) {
			throw new IsNegative();
		}
		System.out.println(num1 + " divise par " + num2 + " egals " + division(num1,num2));
		
	}
	
	public static int division(int x, int y) {
		int res = 0;
		int num = x;
		while (num >= y) {
			num = num - y;
			res++;
		}
		return res;
 	}
	
	
}
class IsZero extends RuntimeException {
}

class IsNegative extends RuntimeException {
	
}