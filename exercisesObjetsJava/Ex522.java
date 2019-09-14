package exerciceObjetSousProg;
import java.util.Scanner;

import java.util.Random;
public class Ex522 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Combien des Hommes participent au sondage...?");
		int hommes = input.nextInt();
		System.out.println("Combien des Femmes participent au sondage...?");
		int femmes = input.nextInt();
		int[] votesHommes = new int[3];
		int[] votesFemmes = new int[3];
		for (int i = 0; i < hommes; i++) {
			switch (voteRandom()) {
			case 0  : votesHommes[0]++; break;
			case 1  : votesHommes[1]++; break;
			case 2  : votesHommes[2]++; break;
			default : throw new Error();
			} // switch
		}    // for
		for (int i = 0; i < femmes; i++) {
			switch (voteRandom()) {
			case 0  : votesFemmes[0]++; break;
			case 1  : votesFemmes[1]++; break;
			case 2  : votesFemmes[2]++; break;
			default : throw new Error();
			} // switch
		}    // for
		
		afficheTab(votesHommes);
		afficheTab(votesFemmes);
		int total = donneIntention(votesHommes, 0) + donneIntention(votesFemmes ,0);
		System.out.println("les oui total...:" + total);
		
	}
	
	public static int voteRandom() {
		Random rand = new Random();
		int num = rand.nextInt(3);
		return num;
		
	}
	
	public static void afficheTab(int[] tab) {
		System.out.println("=========================");
		System.out.println("|  oui  |  non  |  abs  |");
		System.out.println("=========================");
		System.out.print("| ");
		for (int i = 0; i <3; i++) {
			
			System.out.print("  " + tab[i] + "   |");
		}
		System.out.println();
		System.out.println("=========================");
	}
	
	public static int donneIntention(int[] tab, int ind) {
		return tab[ind];
		
	}

}
