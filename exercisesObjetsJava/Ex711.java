package exerciceObjetSousProg;

import java.util.ArrayList;

public class Ex711 {
	public static void main(String[] args) {
		System.out.println(stringToInt("-1566fgh53"));
		
	}
	
	public static int stringToInt(String chaine){
		int prod = 0, count = 0, multi = 1;
		int ch = chaine.length();
		ArrayList<Character> tab = new ArrayList<Character>();
		for (int i = 0; i < ch; i++) {
			char s = chaine.charAt(i);
			tab.add(s);
		}
		if (chaine.charAt(0)== '-') {
			count++;
			for (int i = 1; i < chaine.length(); i++ ) {
				char s = chaine.charAt(i);
				if (Character.isDigit(s)) {
				count++;
				}
			}  // for
		} else {
			for (int i = 0; i < chaine.length(); i++ ) {
				char s = chaine.charAt(i);
				if (Character.isDigit(s)) {
					count++;
				} //if
			}// for
		}
		if  (count == chaine.length()) {
			if (chaine.charAt(0) == '-') {
				for (int i = chaine.length(); i > 1; i-- ) {
					prod = prod + (Character.getNumericValue(chaine.charAt(i - 1)) * multi);
					multi = multi * 10;
				}
				prod = prod - ( 2 * prod);
			} else {
				for (int i = chaine.length(); i > 0; i-- ) {
					prod = prod + (Character.getNumericValue(chaine.charAt(i - 1)) * multi);
					multi = multi * 10;
				}
			}
			
		} else {
			throw new ErrorIsNotNumeric();
		}
		
		return prod;
	}
	
	
}
class ErrorIsNotNumeric extends RuntimeException {
}
