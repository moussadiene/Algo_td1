package application;

import java.util.Scanner;

/**
 * Exercice 10 : Ecrire un algorithme qui lit trois valeurs entières ( A, B et C) et qui permet de les trier par 
				échanges successifs Et enfin les afficher dans l'ordre . 

 * @author djine
 *
 */
public class Exercice_10 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int svg;
		
		System.out.println("---------------------- Trie par echange successive -------------------------------");
		System.out.println("Saisir les 3 nombres entier");
		System.out.print("nombre 1 :");
		int a = sc.nextInt();
		System.out.print("nombre 2 :");
		int b = sc.nextInt();
		System.out.print("nombre 3 :");
		int c = sc.nextInt();
		
		if(a < b && b < c) {
			svg = 0;
		}

		if(a < c && c < b) {
			svg =  b;
			b =  c;
			c =  svg;
		}
		// les possibilités que b soit plus grand
		if(b < a && a < c) {
			svg = b;
			b = a;
			a = svg;
		}
		if(b < c && c < a) {
			svg = a;
			a = b;
			b = c;
			c = svg;
		}
		
		// possibilités de  que c soit plus grand
		if(c < a && a < b) {
			svg = b;
			b = a;
			a = c;
			c = svg;
}
		if(c < b && b < a){
			svg = a;
			a = c;
			c = svg;	
		}
		System.out.println("affichage dans l'ordre croissant:");
		System.out.println(a+ "\t" + b + "\t"+c);	
		
	}

}
