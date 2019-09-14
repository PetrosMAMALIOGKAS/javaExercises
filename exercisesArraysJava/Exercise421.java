import java.util.Scanner;
public class Exercise421 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("doonez-moi la taille du tableau...:");
		int taile = input.nextInt(); 
		int[] tab = new int[taile];
		int total = 0;
		for (int i = 0; i < taile; i++) {
			total = total + i;
			tab[i] = total;
		}
		aficheTab(tab);
	}
	
	public static void aficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	

}
