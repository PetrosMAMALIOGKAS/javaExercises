
public class Ex411 {
	static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
	
	static int division(int indice, int diviseur){
		return tableau[indice]/diviseur;
	}
	public static void main(String[] args){
		int x = -1, y = -1;
		boolean flag = false; 
		while(!flag) {
			try {
				Terminal.ecrireString("Entrez l indice de l entier a diviser:");
				x = Terminal.lireInt();
				flag = true;
			} catch (TerminalException u) {
				System.out.println("Entrez un entrier");
			}
		}
		flag = false; 
		while (!flag) {
			try	{
				Terminal.ecrireString("Entrez le diviseur:");
				y = Terminal.lireInt();
				flag = true;
			}  catch (TerminalException u) {
				System.out.println("Entrez un entrier");
			}
		}
	
		flag = false; 
		while (!flag) {
		try {
			Terminal.ecrireString("Le resultat de la division est:");
			Terminal.ecrireIntln(division(x,y));
			
			flag = true;
		} catch (ArithmeticException arithmeticException) {
			System.out.println("ERROR  Le diviseur ne doit pas etre 0");
			System.out.println("Entrez un autre diviseur...:");
			
			y = Terminal.lireInt();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ERROR  la taile du tableau est " + tableau.length);
			System.out.println("Entrez un autre indice(0.." + tableau.length + ")...:");
			x = Terminal.lireInt();
		} 
		
		}
	}
}

