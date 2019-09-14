package exerciceObjetSousProg;

public class Ex613 {
	public static void main(String[] args) {
		String s1 = "paOk6";
		String s2 = "Paok6";
		System.out.println(testerString(s1,s2));
	}
	
	
	
	public static boolean testerString(String s1, String s2) {
		boolean check = false;
		int s1Length = s1.length();   
		int s2Length = s2.length(); 
 		if (s1Length < s2Length) {
			s2Length = s1Length;
		}
 		int test = 0, i = 0, meme = 0;
 		
		while ( i < s2Length && !check) {
			Character c1 = new Character(s1.charAt(i));
			Character c2 = new Character(s2.charAt(i));
			test = c1.compareTo(c2);
			if (test == 0 || test + 32 == 0 || test - 32 == 0) {
				meme++;
			} else {
				check = true;
			}
			i++;
		}
		if (meme == s2Length) {
			return true;
		}
		return false;
		
	}
	
	
	
	
}
