package exercisesRevisionClasses;

import java.util.Scanner;

public class Ex222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Livre l1 = new Livre("l etranger", "Alber Camus");
		Livre l2 = new Livre("Germinal", "Emil Zola");
		Biblioteque biblio1 = new Biblioteque("bilio CNAM");
		biblio1.addLivre(l1);
		biblio1.addLivre(l2);
		biblio1.afficher();

	}

}
