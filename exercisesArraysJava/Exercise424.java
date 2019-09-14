import java.util.Scanner;
public class Exercise424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char[] tab = {'x', 'r', '1', 'b'};
		System.out.println("Vous voulez inserer compien de char dans le tableau...: ");
		int num = input.nextInt();
		System.out.println("a quelle place du tablau...:");
		int place = input.nextInt();
		char[] tabIns = getInput(num); 
		System.out.println("le tablau avant");
		aficheTab(tab);
		System.out.println("Tablau  a inserer");
		aficheTab(tabIns);
		char[] tabFin = modifieTab(tab, tabIns, place);
		System.out.println("Tablau  FINALE");
		aficheTab(tabFin);
		System.out.println("plus insersions?");
		boolean flag = input.nextBoolean();
		while (flag) {
			System.out.println("Vous voulez inserer compien de char dans le tableau...: ");
			num = input.nextInt();
			System.out.println("a quelle place du tablau...:");
			place = input.nextInt();
			tabIns = getInput(num);
			System.out.println("le tablau avant");
			aficheTab(tabFin);
			System.out.println("Tablau  a inserer");
			aficheTab(tabIns);
			tabFin = modifieTab(tabFin, tabIns, place);
			System.out.println("Tablau  FINALE");
			aficheTab(tabFin);
			System.out.println("plus insersions?");
			flag = input.nextBoolean();
		}
			

	}
	
	public static void aficheTab(char[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	public static char[] getInput(int taille) {
		Scanner input = new Scanner(System.in);
		char[] tabIns = new char[taille]; 
		for (int i = 0; i < taille; i++) {
			System.out.println("doonez-moi le char numero " + i + " poul le tableau..:");
			tabIns[i] = input.next().charAt(0);
		}
		return tabIns;
	}
	public static char[] modifieTab(char[] tab, char[] tabIns, int place) {
		char[] tabTemp = new char[tab.length - place];
		for (int i = place; i < tab.length; i++) {
			tabTemp[i - place] = tab[i];
		}
		char[] tabFin = new char[tab.length + tabIns.length];
		for (int i = 0; i < tabFin.length; i++) {
			if ( i < place) {
				tabFin[i] = tab[i];
			} else if (i >= place && i < (tabIns.length + place) ) {
				tabFin[i] = tabIns[i -place];
			} else {
				tabFin[i] = tabTemp[i - place - tabIns.length];
				
			}
			
		}
		return tabFin;
	}

}
