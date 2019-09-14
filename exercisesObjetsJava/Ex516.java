package exerciceObjetSousProg;

public class Ex516 {
	static void afficheTable(int[] t){
		System.out.print('+');
		for (int i=0; i<t.length; i++){
			if (t[i] < 0) {
				int len = String.valueOf(t[i]).length();
				for (int j = 0; j < len; j++) {
					System.out.print("-");
				}
				System.out.print("-");
			} else {
				int len = String.valueOf(t[i]).length();
				for (int j = 0; j < len; j++) {
					System.out.print("-");
				}
			}
			System.out.print("--+");
		}
		System.out.println();
		System.out.print('|');
		for (int i=0; i<t.length; i++){
			if (t[i] < 0) {
				System.out.print(" " + t[i] + "  |");
			} else {
				System.out.print(" " + t[i] + " |");
			}
		}
		System.out.println();
		System.out.print('+');
		for (int i=0; i<t.length; i++){
			if (t[i] < 0) {
				int len = String.valueOf(t[i]).length();
				for (int j = 0; j < len; j++) {
					System.out.print("-");
				}
				System.out.print("-");
			} else {			
			int len = String.valueOf(t[i]).length();
			for (int j = 0; j < len; j++) {
				System.out.print("-");
			}
			}
			System.out.print("--+");
			
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] ex = {1,-5,5,9,7};
		int[] ex2 = {12, 5, 8, 123};
		afficheTable(ex);
		afficheTable(ex2);

}
}
