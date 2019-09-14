package exercisesRevisionClasses;

public class Livre {
	String titre;
	String auteur;
	private String editeur;
	
	public Livre(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
	}
	
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	public void afficher() {
		System.out.println("titre....: " + this.titre);
		System.out.println("auteur...: " + this.auteur);
		System.out.println("editeur..: " + this.editeur);
	}
	

}
