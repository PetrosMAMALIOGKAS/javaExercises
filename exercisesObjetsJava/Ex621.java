package exerciceObjetSousProg;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex621 {
	public static void main(String[] args) {
		ArrayList<Integer> notes = new ArrayList<Integer>();
		ArrayList<Integer> coeff = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		notes.add(20);
		notes.add(20);
		notes.add(10);
		notes.add(10);
		coeff.add(10);
		coeff.add(10);
		coeff.add(20);
		coeff.add(20);
		
		int selection = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("#####  MENU #####");
			System.out.println("1. Ajouter une note.");
			System.out.println("2. Afficher le tableau");
			System.out.println("3. Afficher le moyen");
			System.out.println("4. Corrige une note");
			System.out.println("0. EXIT");
			System.out.println("Faites votre selection....:");
			selection = input.nextInt();
			switch (selection) {
			case 1:	ajoute(notes , coeff);
				   	break;
			case 2: afficher(notes);
					break;
			case 3: System.out.println("Le moyen  est " + calculerMoyen(notes,coeff));
					break;
			case 4: corrige(notes,coeff);
					break;
			default: exit = true;
					 break;
					
			}  //switch
		} // while
	}
	public static void ajoute(ArrayList<Integer> notes, ArrayList<Integer> coeff) {
		int note = lireNote(); 
		int coef = lireCoeff(); 
		notes.add(note);
		coeff.add(coef);
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
	
	public static int lireCoeff() {
		Scanner input = new Scanner(System.in);
		boolean correct = false;
		System.out.println("donnez le coefficient pour cette note(0..10).:");
		int coeff = input.nextInt();
		while (!correct) {
			if (coeff > 10 || coeff < 0) {
				System.out.println("note pas correct(0..10)...resayser");
				coeff = input.nextInt();
			} else {
				correct = true;
			}
		}
		return coeff;
	}
	
	public static void afficher(ArrayList<Integer> notes) {
		System.out.print("Les notes...: ");
		for (int i = 0; i < notes.size(); i++) {
			System.out.print(notes.get(i) + " ");
		}
		System.out.println();
	}
	
	public static double calculerMoyen(ArrayList<Integer> notes, ArrayList<Integer> coeff) {
		double moyen = 0, co = 0,sum = 0;
		int  sumCoef = 0;
		for (int i = 0; i < coeff.size(); i++) {
			sumCoef = sumCoef + coeff.get(i);
		}
		for (int i = 0; i < notes.size(); i++) {
			co =(double) (coeff.get(i) * 20) / sumCoef;
			
			sum =  sum + ((notes.get(i)* co)/ 20 );
		}
		
		return sum;
	}
	
	public static void corrige(ArrayList<Integer> notes, ArrayList<Integer> coeff) {
		Scanner input = new Scanner(System.in);
		afficher(notes);
		System.out.println("la note de quelle indice vous voulez remplacer..? ");
		int indice = input.nextInt();
		notes.set(indice, lireNote());
		coeff.set(indice, lireCoeff());
	}
}
