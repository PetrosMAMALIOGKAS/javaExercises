package exercisesRevisionClasses;

import java.util.Scanner;

public class Ex223 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Produit p1 = new Produit("tasse", 1, 10);
		Produit p2 = new Produit("verre", 5, 12);
		Produit p3 = new Produit("fourchette", 10, 3);
		Produit p4 = new Produit("cuillere", 3, 1.5);
		Produit p5 = new Produit("couteau", 7, 2.5);
		Stock mag = new Stock(p1);
		mag.addProduit(p2);
		mag.addProduit(p3);
		mag.addProduit(p4);
		mag.addProduit(p5);
		mag.afficheContenu();
	}
}
