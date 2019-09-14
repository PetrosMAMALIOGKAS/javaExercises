package exercisesRevisionClasses;

import java.util.ArrayList;

public class Stock {
	private ArrayList<Produit> stock;

	public Stock(Produit prod) {
		this.stock = new ArrayList<Produit>();
		this.stock.add(prod);
	}
	
	public void addProduit(Produit prod) {
		for (int i = 0; i < stock.size(); i++) {
			if (stock.get(i).getRef() < prod.getRef() && stock.size() == 1) {
				stock.add(i + 1, prod);
				break;
			} else if (stock.get(i).getRef() > prod.getRef() && stock.size() == 1) {
				stock.add(i, prod);
				break;
			} else if (stock.get(i).getRef() < prod.getRef() && stock.get(i + 1).getRef() > prod.getRef()) {
				stock.add(i + 1, prod);
				break;
			}
		}
	}
	
	public void afficheContenu() {
		System.out.println("**************  LISTE DES PRODUITS DANS LE STOCK   ***************" );
		for (int i = 0; i < stock.size(); i++) {
			System.out.println("ref..: " + stock.get(i).getRef() + " nom...: " + stock.get(i).getNom() + " prix hors taxe...: " + stock.get(i).getPrixHorsTaxe());
		}
	}
	
	public double chercherPrix(int ref) {
		double prix = -1;
		for (int i = 0; i < this.stock.size(); i++) {
			if (this.stock.get(i).getRef() == ref) {
				prix = this.stock.get(i).getPrixHorsTaxe();
				
			}
		}
		return prix;
	}
}
