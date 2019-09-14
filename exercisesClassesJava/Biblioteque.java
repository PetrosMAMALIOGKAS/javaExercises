package exercisesRevisionClasses;

import java.util.ArrayList;

public class Biblioteque {
	private String nom;
	ArrayList<Livre> list = new ArrayList<Livre>();
	
	public Biblioteque(String nom) {
		this.nom = nom;
	}
	
	public void addLivre(Livre l) {
		this.list.add(l);
	}
	
	public void afficher() {
		System.out.println("****la liste des livres****");
		for (int i = 0; i < this.list.size(); i++) {
			System.out.println("titre..: " + this.list.get(i).titre + "   auteur...: " + this.list.get(i).auteur);
		}
	}
}
