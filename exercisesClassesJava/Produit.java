package exercisesRevisionClasses;

public class Produit {
	private String nom;
	private int ref;
	private double prixHorsTaxe;
	
	public Produit(String nom , int ref, double prixHorsTaxe) {
		this.nom = nom;
		this.ref = ref;
		this.prixHorsTaxe = prixHorsTaxe;
	}
	
	public int getRef() {
		return this.ref;
	}
	public String getNom() {
		return this.nom;
	}
	
	public double getPrixHorsTaxe() {
		return this.prixHorsTaxe;
	}
}
