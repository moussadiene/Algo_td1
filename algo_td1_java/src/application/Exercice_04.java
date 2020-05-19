package application;

import java.util.Scanner;

/**
 * 
 *

exercice 4 : 
Ecrire un programme qui saisit un réel x et un entier n et affiche x à la puissance n.
Version 1 : utiliser la fonction pow  du fichier d’en-tête <math.h>  ex : pow(x,n)
Version 2 : en utilisant un boucle

 *
 */
public class Exercice_04 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		double x;
		     int  n;
		do {
			System.out.println("Saisir un nombre reel svp");
			x = sc.nextDouble();
		}while( x <= 0);
		 	
		do {
			System.out.println("Saisir l’exposant de ce nombre en entier svp  :");
			n = sc.nextInt();
		}while( n <= 0);
		
		System.out.println("\n---------------------version 1 : avec class Math -----------------------------\n");
		
		double p =  Math.pow(x,n);
		System.out.println("la puissance avec la Class Math est  :" + p);
	
		System.out.println("\n---------------------version 2 : avec une boucle -----------------------------\n");

		p = 1;
		for (int i = 1; i <= n; i++) {
			p = p * x;
		}
		
		System.out.println("le puissance avec boucle est  :"+ p);


	}

}
