package exerciceObjetSousProg;
import java.util.Scanner;
public class Ex523 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int	taille, nbEt, nbEsp;
		System.out.print("Entrez la taille	du triangle:");
		taille = input.nextInt();
		nbEsp = taille -1;
		nbEt = 1;
		for	(int i=1; i<=taille; i++){
			// les espaces
			for (int j=1; j<= nbEsp; j++){
				System.out.print(' ');
			}
			// les etoiles
			for (int j=1; j<= nbEt; j++){
				System.out.print('*');
			}
			System.out.println();
			nbEsp = nbEsp -1;
			nbEt = nbEt+2;
		}
		char[][] tabEtNorm = creeTabNorm(taille);
		afficheTab(tabEtNorm);
		char[][] tabEtDroite = creeTabDroite(taille);
		afficheTab(tabEtDroite);
		char[][] tabEtBas = creeTabBas(taille);
		afficheTab(tabEtBas);
		
	}
	
	// cree le tableau normal 
	public static char[][] creeTabNorm(int lign) {
		int col = (lign * 2) - 1;
		char[][] tab = new char[lign][col]; 
		for (int i = 0; i < lign; i++) {
			for (int j = 0; j < col; j++) {
				tab[i][j] = ' ';
			}
		}
		int esp = lign - 1;
		
		int nbet = 1;
		for (int i = 0; i < lign; i++) {
			for (int j = nbet; j > 0; j--) {
				tab[i][j + (esp -1)] = '*';
				
			}
			
			nbet = nbet + 2;
			esp--;
			
			
		}
		
		return tab;
	}
	
	// cree tableau pointe a droite
	public static char[][] creeTabDroite(int taille) {
		int ligne = taille *2 - 1;
		char[][] tab = new  char[ligne][taille];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = ' ';
			}
		}
		boolean flag = false;
		int nbEt = 1;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < nbEt; j++) {
				tab[i][j] = '*';
			}
			if (flag) {
				nbEt--;
			} else {
				nbEt++;
				if (nbEt == taille) {
					flag = true;
				}
			}
		}
		return tab;
	}
	
	//cree tableau point en bas
	public static char[][] creeTabBas(int taille) {
		int col = taille * 2 - 1;
		char[][] tab = new char[taille][col];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = ' ';
			}
		}
		int nbEt = taille * 2 - 1;
		
		for (int i = 0; i < tab.length; i++) {
			int nbEsp = i;
			for (int j = nbEt; j > 0; j--){
				tab[i][nbEsp] = '*';
				nbEsp++;
			}
			nbEt = nbEt - 2; 
		}
		
		return tab;
	}
	
	public static void afficheTab(char[][] tab) {
		System.out.println("=====================================");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	
}
