package projet1;

import java.util.Scanner;

public class Tableaux {
	public static void main(String args[]) {
		float tab[] = new float[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tab.length; i++) {
			System.out.println("Donnez l'élément n° :" + i);
			tab[i] = sc.nextFloat();
		}

		System.out.println("\nContenu du tableau ");
		for (float e : tab) {
			System.out.println(e);
		}

		
		float somme = 0;
		for (float e : tab) {
		    somme += e;
		}
		

		System.out.println("Somme = " + somme);
		

	}
	
}
