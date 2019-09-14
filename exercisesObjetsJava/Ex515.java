package exerciceObjetSousProg;



public class Ex515 {
	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 7, 9};
		int[] array2 = {1, 8, 12};
		conTab(array1, array2);
		
	}
	
	public static void conTab(int[] tab1, int[] tab2) {
		int[] array3 = new int[tab1.length + tab2.length];
		System.arraycopy(tab1, 0, array3, 0, tab1.length);
		System.arraycopy(tab2, 0, array3, tab1.length, tab2.length);
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}

}
