import java.util.Scanner;

public class Exercise412 {

	public static void main(String[] args) {
		int[] tab = creeTab();
		aficheTab(tab);
		afficheGrand(tab);
		System.out.println("le moyen de ce tableau est ...: " + moyen(tab));
		
		
			
		

	}
	
	public static int[] creeTab() {
		Scanner input = new Scanner(System.in);
		int[] tab = new int[6];
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Donnez-moi le numero de la place " + i + "....: ");
			tab[i] = input.nextInt();
		}
		return tab;
	}
	
	public static void aficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	public static void afficheGrand(int[] tab) {
		int grand = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > grand) {
				grand = tab[i];
			}
		}
		System.out.println("Le meilleur numero saisi est...: " + grand);
		
	}
	
	public static double moyen(int[] tab) {
		int total = 0;
		double moyen = 0; 
		for (int i = 0; i < tab.length; i++) {
			total = total + tab[i];
		}
		moyen  = (double) total/ tab.length;
		return moyen;
		
	}

}
