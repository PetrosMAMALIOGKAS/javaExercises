package exercicesArray;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Exercice433 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random create = new Random();
		boolean notCorrectInput = false;
		int height = 0, width = 0;
		System.out.print("give me the height of the image...:");
		while (!notCorrectInput) {
			try {
				height = input.nextInt();
				notCorrectInput = true;
			} catch (InputMismatchException e) {
				System.out.println(input.nextLine() + "is not  an integer Enter an Int");
				
			}
		} 
		System.out.print("give me the width of the image..:");
		notCorrectInput = false;
		while (!notCorrectInput) {
			try {
				width = input.nextInt();
				notCorrectInput = true;
			} catch (InputMismatchException e) {
				System.out.println(input.nextLine() + "Is not an Int Give an Int pls...:");
			}
		}
		int[][] image = new int[height][width];
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				image[i][j] = create.nextInt(256);
			}
		}
		int leBlanc = calculeBlanc(image);
		System.out.println("the white pixel of your img are  " + calculeBlanc(image));
		System.out.println("And the poucentage is " + pourcentBlanc(image, leBlanc ) + " %");
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				if ((image[i][j] + 30) > 255) {
					image[i][j] = 255;
				} else {
					image[i][j] = image[i][j] + 30;
				}
				
			}
		}
		
	}
	
	public static int calculeBlanc(int[][] img) {
		int pointBlanc = 0;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				if (img[i][j] == 255) {
					pointBlanc++;
				}
			}
		}
		return pointBlanc;
	}
	
	public static double pourcentBlanc(int[][] img, int blanc) {
		double pourcent = 0;
		int total = 0;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				total++;
				
			}
		}
		pourcent = (double) (blanc * 100) / total;
		return pourcent;
	}

}
