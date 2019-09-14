package exerciceObjetSousProg;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Ex731 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		int count = 0;
		String phrase = "'The Complete Guide to the WordPress Settings API' or a Tuts+ Premium. course called 'Using the WordPress Settings API', both created by Tom McFarlin. ";
		ArrayList<String> tab = new ArrayList<String>();
		for (int i = 0; i < phrase.length(); i++) {
			if (Character.isLetter(phrase.charAt(i))) {
				str.append(phrase.charAt(i));
				count++;
			} else {
				if (count != 0){
					tab.add(str.toString());
					str.delete(0, str.length());
					count = 0;
				}
			}
		}
		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
