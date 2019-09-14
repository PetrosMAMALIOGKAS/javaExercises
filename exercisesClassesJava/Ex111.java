package exercisesRevisionClasses;


import java.util.Scanner;
import java.util.ArrayList;

public class Ex111 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] lignes = new String[4][5];
		double[][] prix = new double[2][5];
		lignes[0][0] = "Vierzon";
		lignes[0][1] = "Salbris";
		lignes[0][2] = "Nouans";
		lignes[0][3] = "Lamotte-Beuvron";
		lignes[0][4] = "La Ferté Saint-Aubin";
		lignes[1][0] = "Salbris";
		lignes[1][1] = "Nouans";
		lignes[1][2] = "Lamotte-Beuvron";
		lignes[1][3] = "La Ferté Saint-Aubin";
		lignes[1][4] = "Orleans";
		prix[0][0] = 3.20;
		prix[0][1] = 1.80;
		prix[0][2] = 2.30;
		prix[0][3] = 4.20;
		prix[0][4] = 5.00;
		lignes[2][0] = "Poitiers";
		lignes[2][1] = "Pamproux";
		lignes[2][2] = "Romagne";
		lignes[2][3] = "Civray";
		lignes[2][4] = "Ruffec";
		lignes[3][0] = "Pamproux";
		lignes[3][1] = "Romagne";
		lignes[3][2] = "Civray ";
		lignes[3][3] = "Ruffec";
		lignes[3][4] = "Tours";
		prix[1][0] = 3.70;
		prix[1][1] = 4.20;
		prix[1][2] = 1.20;
		prix[1][3] = 3.60;
		prix[1][4] = 2.10;
		System.out.println("Vous etes ou...:");
		String ville = input.nextLine();
		affichDestinations(trouveVille(lignes, ville), lignes, prix);
		System.out.println("Vous voulez aller ou...?");
		String destVille = input.nextLine();
		calculePrix(ville, destVille, prix, trouveVille(lignes, ville), trouveVille(lignes, destVille) );
		
		
 	}
	
	public static ArrayList<Integer> trouveVille(String[][] lig, String ville) {
		ArrayList<Integer> posi = new ArrayList<Integer>();
		for (int i = 0; i < lig.length; i++ ) {
			for ( int j = 0; j < lig[i].length; j++ ) {
				if (lig[i][j].equals(ville)) {
					posi.add(i);
					posi.add(j);
				}
			}
 		}
		return posi;
	}
	public static void affichDestinations(ArrayList<Integer> pos, String[][] lig, double[][] prix) {
		System.out.println("Les destinations de " + lig[pos.get(0)][pos.get(1)] + " sont....");
		int i = pos.get(0);
		do {
			if ( i % 2 == 0) {
				for (int j = pos.get(1); j <lig[i+1].length; j++) {
					System.out.println(lig[i+1][j]);
				}
				break;	
			}
			i = i + 2;
		} while (i < pos.size());
	}
	
	public static void calculePrix(String ville, String destVille, double[][] prix, ArrayList<Integer> p,  ArrayList<Integer> a) {
		double sum = 0;
		int troncons = -1;
		ArrayList<Integer> posPart = p;
		ArrayList<Integer> posDest = a;
		int i = posPart.get(1);
		int condition = posDest.get(1);
		if (posDest.size() == 2) {
			condition++;
		}
		
		do  {
			sum = sum + prix[posPart.get(0)/2][i];
			i++;
			troncons++;
		} while (i < condition);
		 
		
		System.out.println("Le prix pour aller de " + ville + " a " + destVille + " est " + sum);
		double fin = sum - (sum * (troncons * 10) /100 );
		System.out.println("Le prix avec une reduction de  " + troncons * 10 + "% est " +  fin);
	}
	

}
