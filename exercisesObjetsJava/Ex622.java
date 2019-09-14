package exerciceObjetSousProg;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex622 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<ArrayList> arTab = new ArrayList<ArrayList>();
		int selection = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("#####  MENU #####");
			System.out.println("1. Cree un ensemble.");
			System.out.println("2. Ajouter un element dans un ensemble");
			System.out.println("3. Afficher un ensemble");
			System.out.println("4. Calculer l'union de deux ensembles");
			System.out.println("5. Calculer l'intersection de deux ensembles");
			System.out.println("0. EXIT");
			System.out.println("Faites votre selection....:");
			selection = input.nextInt();
			switch (selection) {
			case 1:	ArrayList<Integer> crAr = creeEns(getVal());
					arTab.add(crAr);				
				   	break;
			case 2: System.out.println("A quelle enseble vous voulez ajouter un element...:(0.." + (arTab.size() - 1) + ") ..:");
					selection = input.nextInt();
					arTab.get(selection).add(getVal());
					break;
			case 3: System.out.println("Quelle enseble vous voulez afficher...:(0.." + (arTab.size() - 1) + ") ..:");
					selection = input.nextInt();
					System.out.println(arTab.get(selection).size() + "hfhhhhhhhhhhh");
					for (int i = 0; i < arTab.get(selection).size(); i++) {
						System.out.print( arTab.get(selection).get(i) + " ");
					}
					System.out.println();
					break;
			case 4: System.out.println("Premier ensemble pour le union...:(0.." + (arTab.size() - 1) + ") ..:");
					int a = 0,b = 0;
					a = input.nextInt();
					System.out.println("Deuxieme ensemble pour le union...:(0.." + (arTab.size() - 1) + ") .Pas le " + a + ".:");
					b = input.nextInt();
					ArrayList<Integer> union = new ArrayList<Integer>(arTab.get(a));
					int check = 0;
					for (int i = 0; i < arTab.get(b).size(); i++) {
						check = 0;
						for (int j = 0; j < union.size(); j++) {
							if (arTab.get(b).get(i) == union.get(j)) {
								check++;
							} 
						}
						if (check == 0) {
							union.add( (Integer) arTab.get(b).get(i) );
						}
					}
					System.out.println("Le resultat de l' union.....");
					for (int i = 0; i < union.size(); i++) {
						System.out.println(union.get(i) + " ");
					}
					
					break;
			case 5: System.out.println("Premier ensemble pour le union...:(0.." + (arTab.size() - 1) + ") ..:");
					int c = 0,d = 0, count =0;
					c = input.nextInt();
					System.out.println("Deuxieme ensemble pour le union...:(0.." + (arTab.size() - 1) + ") .Pas le " + c + ".:");
					d = input.nextInt();
					ArrayList<Integer> intersection = new ArrayList<Integer>();
					for (int i = 0; i < arTab.get(c).size(); i++) {
						for (int j = 0; j < arTab.get(d).size(); j++) {
							if (arTab.get(c).get(i) == arTab.get(d).get(j)) {
								count =0;
								for (int r = 0; r < intersection.size(); r++) {
									if (intersection.get(r) ==  arTab.get(c).get(i)) {
										count++;
									} // if
								} //for r
								if (count == 0 ) {
									intersection.add((Integer) arTab.get(c).get(i));
								}  // if
							} //if
						} //for j
					} // for i
					System.out.println("Le resultat de intersection est... ");
					
					for (int i = 0; i < intersection.size(); i++) {
						System.out.println(intersection.get(i) + " ");
						
					}
			default: exit = true;
					 break;
					
			}  //switch
		} // while
	}
	
	public static int getVal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez-moi une valeur...:");
		int val = input.nextInt();
		return val;
	}
	
	
	public static ArrayList<Integer> creeEns(int valeur) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(valeur);
		return ar;
	}
	
	

}
