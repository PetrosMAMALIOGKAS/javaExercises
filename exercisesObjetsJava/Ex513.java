package exerciceObjetSousProg;

public class Ex513 {
	public static void main(String[] args) { 
		int[] t1 = {4, 5, 6};
		int[] t2 = {4, 5, 6};
		int[] t3 = {4, 5};
		int[] t4 = {6, 5, 4};
		System.out.println(estEgal(t1, t2));
		System.out.println(estEgal(t1, t3));
		System.out.println(estEgal(t1, t4));
	}
	
	public static boolean estEgal(int[] tab1, int[] tab2) {
		int meme = 0;
		if (tab1.length != tab2.length) {
			return false;
		} else {
			for (int i = 0; i < tab1.length; i++) {
				if (tab1[i] == tab2[i]) {
					meme++;
				}
			}
		}
		if (meme == tab1.length) {
			return true;
		} else {
			return false;
		}
	}
}
