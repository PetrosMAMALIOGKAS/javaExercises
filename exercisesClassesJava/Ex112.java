package exercisesRevisionClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex112 {
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez-moi la taille du tableau...: ");
		int taille = input.nextInt();
		ArrayList<Boolean> tab = new ArrayList<Boolean>(taille);
		tab.addAll(crible(taille));
		for (int i = 1; i < tab.size(); i++ ){
			if (tab.get(i)){
				System.out.println((i +1) + "nombre est premier... ");
			} else {
				System.out.println((i + 1) +"nombre n'est pas premier... ");
			}
		}
		System.out.println("Donnez-moi un nombre pour faire la test...: ");
		int num = input.nextInt();
		testPremier(num, crible(num + 10));
		System.out.println("Les nombres premiers inferieurs de " + taille);
		System.out.println("+-----+");
		for (int i = 1; i < tab.size(); i++ ){
			if (tab.get(i)){
				if (i > 9) {
					System.out.println("| " +(i +1)+ "  |");
				} else {
					System.out.println("|  " +(i +1) + "  |");
				}
				System.out.println("+-----+");
			} 
			
		}
	}
	
	public static ArrayList<Boolean> crible(int n) {
		ArrayList<Boolean> tab = new ArrayList<Boolean>(n);
		for (int i = 0; i < n; i++) {
			tab.add(true); 
		}
		double sq = Math.sqrt(n);
		int num = 0;
		int sqq = (int) sq;
		for (int i = 2; i <= sqq;  i++) {
			for (int j = 2; j < tab.size(); j ++) {
				num = i * j;
				if (num <= n) {
					tab.set(num-1, false);
				}
			}
		}
		return tab;
		
	}
	
	public static void testPremier(int num ,ArrayList<Boolean> tab) {
		if (tab.get(num-1)){
			System.out.println("nombre est premier... ");
		} else {
			System.out.println("nombre n'est pas premier... ");
		}
		
	}

}
