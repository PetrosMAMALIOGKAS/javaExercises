import java.util.Scanner;



public class Exercise413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tab = creeTab();
		aficheTab(tab);
		for (int i = 0; i < tab.length; i++) {
			estMajMin(tab[i]);
		}
		
	
	}
	public static char[] creeTab() {
		
		char[] tab = {'A', 'b', 'C', '6', 'e', 'f', 'g', 't', '5', 'o'};
		//for (int i = 0; i < tab.length; i++) {
		//	System.out.println("Donnez-moi le numero de la place " + i + "....: ");
		//	tab[i] = input.next().charAt(0);
		//}
		return tab;
	}
	
	public static void aficheTab(char[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	public static void estMajMin(char test){
		
		
		if (Character.isUpperCase(test)) {
			System.out.println(test + " est Majuscule");
		} else if (Character.isLowerCase(test)) {
			System.out.println(test + " est Minscule");
		} else {
			System.out.println(test + " est ni Minscule maJ");
		}
	}
	

}
