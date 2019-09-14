package exerciceObjetSousProg;

public class Ex611 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for (int i = 0; i < args.length; i++) {
			num = Integer.parseInt(args[i]);
			sum = sum + num;
		}
		double moyen = (double) sum / args.length;
		System.out.println("Le moyen est...: " + moyen);
	}  
}
