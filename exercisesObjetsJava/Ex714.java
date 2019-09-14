package exerciceObjetSousProg;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex714 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("donnez-moi la chaine de character pour coder");
		String s = input.nextLine();
		char[] tab = s.toCharArray();
		ArrayList<Character> tabEncoder = encoderCesar(tab);
		System.out.println("la chaine encoder est....");
		for (int i = 0; i < tabEncoder.size(); i++) {
			System.out.print(tabEncoder.get(i));
		}
		System.out.println();
		ArrayList<Character> tabDecoder = decoderCesar(tabEncoder);	
		System.out.println("la chaine decoder est....");
		for (int i = 0; i < tabDecoder.size(); i++) {
			System.out.print(tabDecoder.get(i));
		}
	}
	
	public static ArrayList<Character> encoderCesar(char[] tab) {
		ArrayList<Character> tabEn = new ArrayList<Character>();
		int count = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == '*') {
				
			} else if ((codeH(tab[i]) > 96 && codeH(tab[i]) < 123) || (codeH(tab[i]) > 64 && codeH(tab[i]) < 91)) {
						tabEn.add(coderChar(tab[i]));
					} else {
						removeElt(tab, i);
						tab[(tab.length - 1)  - count] = '*';
						count++;
						i--;
					}
				}  // else if
		return tabEn;
		
	}
	
	public static ArrayList<Character> decoderCesar(ArrayList<Character> tab) {
		ArrayList<Character> tabDec = new ArrayList<Character>();
		for (int i = 0; i < tab.size(); i++) {
			tabDec.add(decoderChar(tab.get(i)));
		}
		return tabDec;
	}
	
	public static char coderChar(char c) {
		int hash = codeH(c);
		switch (hash) {
		case 120 : hash = 97; break;
		case 121 : hash = 98; break;
		case 122 : hash = 99; break;
		case  88 : hash = 65; break;
		case  89 : hash = 66; break;
		case  90 : hash = 67; break;
		default  : hash = hash + 3; break;
		
		}
		char t = (char) hash;
		return t;
	}
	
	public static char decoderChar(char c) {
		int hash = codeH(c);
		switch (hash) {
		case  97 : hash = 120; break;
		case  98 : hash = 121; break;
		case  99 : hash = 122; break;
		case  65 : hash = 88; break;
		case  66 : hash = 89; break;
		case  67 : hash = 90; break;
		default  : hash = hash - 3; break;
		
		}
		char t = (char) hash;
		return t;
	}
	
	public static int codeH(char ch) {
		return Character.hashCode(ch);
	}
	
	public static void removeElt( char[] tab, int remIndex ) {
	   int numElts = tab.length - ( remIndex + 1 ) ;
	   System.arraycopy( tab, remIndex + 1, tab, remIndex, numElts ) ;
	}

}
