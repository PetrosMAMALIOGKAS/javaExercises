package exercisesRevisionClasses;

public class Compte {
	private double solde = 0;
	private String nom;
	private int numero;
	
	public Compte(String nom,int numero) {
		this.nom = nom;
		this.numero = numero;
	}
	
	public void getNom() {
		System.out.println("C'est le compte de monsieur " + this.nom);
	}
	public void getSolde(){
		System.out.println("l solde est....: " + this.solde);
	}
	public void deposer(double montant) {
		this.solde = this.solde + montant;
	}
	public void afficher() {
		System.out.println("numero.: " + this.numero);
		System.out.println("nom....: " + this.nom);
		System.out.println("Solde..: " + this.solde);
	}
	public void retirer(double montant) {
		if (montant <= this.solde) {
			this.solde = this.solde - montant;
		} else {
			System.out.println("Vous n'etes pas autorise a retirer  " + montant + " euros");
		}
	}
	
	public void virerVers(double montant, Compte destination) {
		if (montant <= this.solde) {
			this.retirer(montant);
			destination.deposer(montant);
		} else {
			System.out.println("Vous n'etes pas autorise a retirer  " + montant + " euros");
		}
	}
	
	

}
