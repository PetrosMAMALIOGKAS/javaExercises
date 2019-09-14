package exerciceObjetSousProg;
import java.util.ArrayList;
public class Ex713 {
	public static void main(String[] args) {
		System.out.println(convers("XVI"));
		System.out.println(convers("XIV"));
		System.out.println(convers("DIX"));
		System.out.println(convers("MMMCMXCIX"));
		
	}
	
	public static int convers(String num) {
		
		int precedant = 0, sum =0;
		ArrayList<ArrayList> tab = new ArrayList<ArrayList>();
		ArrayList<Character> romain = new ArrayList<Character>();
		ArrayList<Integer> value = new ArrayList<Integer>();
		romain.add('I');
		romain.add('V');
		romain.add('X');
		romain.add('L');
		romain.add('C');
		romain.add('D');
		romain.add('M');
		value.add(1);
		value.add(5);
		value.add(10);
		value.add(50);
		value.add(100);
		value.add(500);
		value.add(1000);
		tab.add(romain);
		tab.add(value);
		for (int i = num.length()-1; i >= 0; i-- ) {
			Character o = new Character(num.charAt(i));
			for(int j = 0; j < tab.get(0).size(); j++) {
				if ( o.compareTo((Character) tab.get(0).get(j)) == 0) {
					if (((Integer) tab.get(1).get(j)) >= precedant) {
						sum =  sum + ((Integer) tab.get(1).get(j));
						precedant = (Integer) tab.get(1).get(j);
					} else {
						sum =  sum - ((Integer) tab.get(1).get(j));
						precedant = (Integer) tab.get(1).get(j);
					}
				}
			}
		}
		return sum;
	}

}
