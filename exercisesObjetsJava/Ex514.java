package exerciceObjetSousProg;

public class Ex514 {
	static public void main(String[] args) {
		char[] tab1 = {'a', 'b', 'c','e'};
		char[] tab2 = {'a', 'b', 'c', 'b', 'd', 'b', 'a', 'd'};
		System.out.println(" Le 'x' " + chercheEl(tab1 , 'x') + " est " + chercheCompien(tab1, 'x'));
		System.out.println(compareTab(tab1,tab2));
	}
	
	static public boolean chercheEl(char[] tab, char element) {
		boolean ch = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == element) {
				ch = true;
			}
		}
		return ch;
	}
	
	static public int chercheCompien(char[] tab, char element) {
		int compien = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == element) {
				compien++;
			}
		}
		return compien;
	}
	
	static public boolean compareTab(char[] tab1, char[] tab2) {
		int count = 0;
		for (int i = 0; i < tab1.length; i++)
			if (chercheEl(tab2, tab1[i])) {
				count++;
			}
		if (count == tab1.length) {
			return true;
		} else {
			return false;
		}
		}
	
}
