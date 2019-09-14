package exerciceObjetSousProg;

import java.util.Scanner;

public class Ex614 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] notes = new int[100];
		boolean exit = false;
		for (int i = 0; i < 100; i++) {
			notes[i] = -1;
		}   // for
		int selection = 0;
		while (!exit) {
			System.out.println("#####  MENU #####");
			System.out.println("1. Ajouter une note.");
			System.out.println("2. Afficher le tableau");
			System.out.println("3. Afficher le moyen");
			System.out.println("0. EXIT");
			System.out.println("Faites votre selection....:");
			selection = input.nextInt();
			switch (selection) {
			case 1: System.out.println("Donnez-moi l indice...:");
					selection = input.nextInt();
				   	ajoute(notes, selection);
				   	break;
			case 2: afficher(notes);
					break;
			case 3: System.out.println("Le moyen  est " + calculerMoyen(notes));
					break;
			default: exit = true;
					 break;
					
			}  //switch
		} // while
	}
	public static void ajoute(int[] notes,int indice) {
		notes[indice] = lireNote();
	}
	
	public static int lireNote() {
		Scanner input = new Scanner(System.in);
		boolean correct = false;
		System.out.println("donnez le note que vous voulez ajoutez...:");
		int note = input.nextInt();
		while (!correct) {
			if (note > 20 || note < 0) {
				System.out.println("note pas correct(0..20)...resayser");
				note = input.nextInt();
			} else {
				correct = true;
			}
		}
		return note;
		
	}
	
	public static void afficher(int[] notes) {
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != -1) {
				System.out.println("le note pour le cour " + i +  " est " + notes[i]);
			}
		}
	}
	
	public static double calculerMoyen(int[] notes) {
		int sum = 0, num = 0;
		double moyen = 0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != -1) {
				sum = sum + notes[i];
				num++;
			}
		}
		moyen = (double) sum / num;
		return moyen;
	}
}
