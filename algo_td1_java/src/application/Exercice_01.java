package application;

import java.util.Scanner;

/*
	 * exercice 1 : 
			Ecrire un programme qui saisit deux entiers a et b, calcule et affiche le 
			quotient entier, le reste de la division et le ratio (quotient réel).
			Algo : division 
	 */

public class Exercice_01 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		
		int nbr1, nbr2, rest,qentier ;
		float qreel ;
		System.out.println("------------------- Calcul de Quotient---------------------------");
		do {
			System.out.println("Saisir le premier nombre entier :");
			nbr1 = sc.nextInt();
		} while (nbr1<0);
		
		do {
			System.out.println("Saisir le deuxieme nombre entier :");
			nbr2 = sc.nextInt();
		} while (nbr2 < 0);
 	
		qentier = nbr1 / nbr2 ;
	
		qreel = (float) nbr1 / nbr2;
	
		rest = nbr1 % nbr2 ;

		System.out.println("le quotient  entier est  :" + qentier);
		
		System.out.println("le quotient entier est :" + qreel );
		
		System.out.println("le reste de la division entiere est : "+ rest);
		
	}
	
}
