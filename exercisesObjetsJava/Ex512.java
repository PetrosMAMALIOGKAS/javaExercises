package exerciceObjetSousProg;

public class Ex512 {
	public static void main(String[] args) {
		System.out.println("carre de 2.5 est " + carre(2.5));
		System.out.println("cube de 2.5 est " + cube(2.5));
	}
	
	public static double carre(double num) {
		double total = num * num;
		return total;
	}
	
	public static double cube(double num) {
		double total = num * num * num;
		return total;
	}

}
