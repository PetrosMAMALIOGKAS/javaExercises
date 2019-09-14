package exerciceObjetSousProg;

public class Ex612 {
	public static void main(String[] args) {
		char[] tab  = {'p', 'a', 'o', 'k','5'};
		String s = "paok5";
		System.out.println(tester(tab,s));
	}
	
	public static boolean tester(char[] tab , String chaine) {
		boolean check = false;
		int tabLength = tab.length;   
		int chaineLength = chaine.length(); 
 		if (chaineLength < tabLength) {
			tabLength = chaineLength;
		}
 		int test = 0, i = 0, meme = 0;
 		
		while ( i < tabLength && !check) {
			Character c1 = new Character(chaine.charAt(i));
			Character c2 = new Character(tab[i]);
			test = c1.compareTo(c2);
			if (test == 0) {
				meme++;
			} else {
				check = true;
			}
			i++;
		}
		if (meme == tabLength) {
			return true;
		}
		return false;
		
	}

}
