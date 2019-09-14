package exerciceObjetSousProg;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex714Question2 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("donnez-moi la chaine de character pour coder");
			String s = input.nextLine();
			char[] tab = s.toCharArray();
			System.out.println("donnez-moi la cle pour le codage");
			String cle = input.nextLine();
			ArrayList<Character> tabEncoder = encoderCle(tab, cle);
			System.out.println("la chaine encoder est....");
			for (int i = 0; i < tabEncoder.size(); i++) {
				System.out.print(tabEncoder.get(i));
			}
			System.out.println();
			ArrayList<Character> tabDecoder = decoderCle(tabEncoder, cle);	
			System.out.println("la chaine decoder est....");
			for (int i = 0; i < tabDecoder.size(); i++) {
				System.out.print(tabDecoder.get(i));
			}
		}
		
		public static ArrayList<Character> encoderCle(char[] tab, String cle) {
			ArrayList<Character> tabEn = new ArrayList<Character>();
			int count = 0, j = 0;
			char cleChar;
			for (int i = 0; i < tab.length; i++) {
				cleChar = cle.charAt(j);
				if (j == cle.length() - 1) {
					j = 0;
				} else {
					j++;
				}
				if (tab[i] == '*') {
					// faire rien
				} else if ((codeH(tab[i]) > 96 && codeH(tab[i]) < 123) || (codeH(tab[i]) > 64 && codeH(tab[i]) < 91)) {
							tabEn.add(coderChar(tab[i], cleChar));
						} else {
							removeElt(tab, i);
							tab[(tab.length - 1)  - count] = '*';
							count++;
							i--;
							if (j == 0) {
								j = cle.length() - 1;
							} else {
								j--;
							}
						}
					}  // else if
			return tabEn;
			
		}
		
		public static ArrayList<Character> decoderCle(ArrayList<Character> tab, String cle) {
			ArrayList<Character> tabDec = new ArrayList<Character>();
			char cleChar;
			int j = 0;
			for (int i = 0; i < tab.size(); i++) {
				cleChar = cle.charAt(j);
				if (j == cle.length() - 1) {
					j = 0;
				} else {
					j++;
				}
				tabDec.add(decoderChar( tab.get(i), cleChar));
			}
			return tabDec;
		}
		
		public static char coderChar(char c, char cle) {
			int hash = codeH(c);
			int cleHash = Character.getNumericValue(cle);
			if (hash > 96 && hash < 123) {   // traitement des minuscules
				if ((122 - hash) < cleHash) {
					hash =  (hash + cleHash) - 26;
				} else {
					hash = hash + cleHash;
				} // else
			} else if (hash > 65 && hash < 89) { // traitement des majuscules
				if ((89 - hash) < cleHash) {
					hash = (hash + cleHash) - 26;
				} else {
					hash = hash + cleHash;
				}
			}
			char t = (char) hash;
			return t;
		}
		
		public static char decoderChar(char c, char cle) {
			int hash = codeH(c);
			int cleHash = Character.getNumericValue(cle);
			if (hash - cleHash < 65 ) {
				hash = hash - cleHash + 26;
			} else if (hash < 91) {
				hash = hash - cleHash;
			} else if  (hash - cleHash < 97 ) {
				hash = hash - cleHash + 26;
			} else {
				hash = hash - cleHash;
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


