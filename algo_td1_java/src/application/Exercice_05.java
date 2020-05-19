package application;

import java.util.Scanner;

/**
 * 

exercice 5 :
Ecrire un programme qui saisit 5 variables de type entier au 
clavier et qui affiche leur somme. 
Utiliser une boucle (for ou while ou do..while).

 * @author djine
 *
 */
public class Exercice_05 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int som = 0 ;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Saisir nombre entier "+ 0+(i+1));
			int nbr = sc.nextInt();
			som = som + nbr;
		}

		System.out.println("la somme des 5 nombres saisie est  :" + som);
	}

}
