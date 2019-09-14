import java.util.Scanner;
public class Exercise422 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] tab = creeTab();
		System.out.println("En euro.....");
		aficheTab(tab);
		double[] tabfr = calcule(tab);
		System.out.println("En Francs.....");
		aficheTab(tabfr);
		

	}
	public static void aficheTab(double[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	public static double[] creeTab() {
		Scanner input = new Scanner(System.in);
		double[] tab = new double[6];
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Donnez-moi le somme de euro ");
			tab[i] = input.nextDouble();
		}
		return tab;
	}
	
	public static double[] calcule(double[] tab) {
		double[] fr = new double[6];
		for (int i = 0; i < tab.length; i++) {
			fr[i] = tab[i] * 0.152;
		}
		return fr;
	}
	
}

