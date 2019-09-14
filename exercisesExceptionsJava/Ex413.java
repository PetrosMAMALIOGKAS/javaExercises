import java.util.Scanner;


public class Ex413 {
	public static void main(String[] args) throws ValeurPasNumeric, ValeurInferieurDeUn, ValeurPlusGrandeQueN {
		Scanner input = new Scanner(System.in);
		String[] tab = {"1. premier choix",
				"2. dexieme choix",
				"3. troixieme choix",
				"4. quatrieme choix",
				"5. EXIT"};
		afficheMenu(tab);
		System.out.println("Donnez moi un nombre");
		String num = input.nextLine();
		System.out.println(saisirChoix(num));
		
		
	}
	
	public static int saisirChoix(String choix) throws ValeurPasNumeric, ValeurInferieurDeUn, ValeurPlusGrandeQueN {
		for (int i = 1; i < choix.length(); i++) {
			if (!Character.isDigit(choix.charAt(i))) {
				throw new ValeurPasNumeric();
			}
			
		}
		
		if (Integer.parseInt(choix) < 0) {
			throw new ValeurInferieurDeUn();
		}
		
		if (Integer.parseInt(choix) > 10) {
			throw new ValeurPlusGrandeQueN();
		}
		return Integer.parseInt(choix);
	}
	
	public static void afficheMenu(String[] tab) {
		System.out.println("#####  LE MENU  #####");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		
	}
	
	

	

}

class ValeurPasNumeric extends Exception {}
class ValeurInferieurDeUn extends Exception {}
class ValeurPlusGrandeQueN extends Exception {}
