package exerciceObjetSousProg;
import java.util.Scanner;

public class Ex521 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("un entier SVP...:");
		int num = input.nextInt();
		System.out.println("the sum is...: " + calcule(num));
	}
	
	public static int calcule(int n) {
		int sum = 0;
		for (int i = 0; i < n + 1; i++) {
			sum = sum + ( i * i);
		}
		return sum;
	}

}
