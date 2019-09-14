import java.util.Scanner;

public class Exercise431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] tab = new int[5][4];
		for (int row = 0; row < tab.length; row++) {
			for (int colomn = 0; colomn < tab[row].length; colomn++) {
					System.out.println("donnez moi nombre des " + getModel(colomn) + " monsier " + getVendeur(row) + " a vendu...:");
					tab[row][colomn] = input.nextInt();
			}
		}
	
		for (int row = 0; row < tab.length; row++) {
			for (int colomn = 0; colomn < tab[row].length; colomn++) {
				System.out.print(tab[row][colomn] + " ");
			}
			System.out.println();
		}
		
		afficheModel();
		System.out.println("de quel model vous voulez savoir ses vends(0/3)...:");
		int sel = input.nextInt();
		System.out.println(getModel(sel) + " a vendu" + modelVendu(tab, sel) + " examblaires");
		
		
		afficheVendeur();
		System.out.print("De quel vendeur vous voulez savoir ses chifres d affaires....(0/4)...:");
		sel = input.nextInt();
		System.out.println("the chifres d affaire de monsieur " + getVendeur(sel) + " etait " + chifreAf(tab,sel));
		

	}
	
	public static String getModel(int place) {
		String[] tab = {"twingo", "clio", "megane", "vel satis"};
		return tab[place];
	}
	public static void afficheModel() {
		String[] tab = {"twingo", "clio", "megane", "vel satis"};
		for (int  i = 0; i < tab.length; i++) {
			System.out.println(i + ". " + tab[i]);
		}
	}
	
	public static int modelVendu(int[][] tab, int sel) {
		int total = 0;
		for (int colomn = 0; colomn < tab.length; colomn++) {
			total = total + tab[colomn][sel];
		}
		return total;
	}
	
	public static String getVendeur(int place) {
		String[] tab = {"andre", "ingemar", "jean-jerome", "Cindy", "Joey"};
		return tab[place];
	}
	
	public static void afficheVendeur() {
		String[] tab = {"andre", "ingemar", "jean-jerome", "Cindy", "Joey"};
		for (int i = 0; i < tab.length; i++) {
			System.out.println(i + ". " + tab[i]);
		}
	}
	
	public static int chifreAf(int[][] tab, int sel) {
		int total = 0;
		for (int row = 0; row < tab[sel].length; row++) {
			total = total + (tab[sel][row] * getPrix(row));
		}
		return total;
	}
	
	public static int getPrix(int place) {
		int[] tab = {6000, 7150, 8564, 3564};
		return tab[place];
	}

}



