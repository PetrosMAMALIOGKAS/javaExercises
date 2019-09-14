
import java.util.Scanner;

public class Exercise411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez--moi le numero ...: ");
		int num = input.nextInt();
		System.out.println("Donnez--moi la place 1...: ");
		int plac = input.nextInt();
		printTab(tab);
		if (plac < 0 || plac > tab.length - 1 && num < 0 || num > tab.length - 1) {
			System.out.println("je peux pas");
		} else {
			int temp = tab[num];
			tab[num] = tab[plac];
			tab[plac] = temp;
		}
		printTab(tab);
		

	}
	
	public static String cherche(int[] pin, int num) {
		for (int i = 0; i < pin.length; i++) {
			if (pin[i] == num) {
				return "oui";
			}
		}
		return "non";
	}
	
	public static int placeDeNo(int[] pin, int num) {
		for (int i = 0; i < pin.length; i++) {
			if (pin[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printTab(int[] pin) {
		for (int i = 0; i < pin.length; i++) {
			System.out.print(pin[i] + " ");
		}
		System.out.println();
	}

}
