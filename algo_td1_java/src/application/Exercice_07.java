package application;

import java.util.Scanner;

/**
 * 
 * 
	Exercice 7 : Décomposition d’un montant en euros Écrire un algorithme permettant de décomposer un montant 
				entré au clavier en billets de 20, 10, 5 euros et pièces de 2, 1 euros, de façon à 
			  minimiser le nombre de billets et de pièces.

 * @author djine
 *
 */
public class Exercice_07 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		int montant ; 
		do {
			System.out.println("Saisir un montant en euro :");
			montant = scanner.nextInt();
		}while(montant<0);
		int nb20 = montant / 20;
		montant =  montant % 20;

		int nb10 = montant / 10;
		montant =  montant % 10;

		int nb5 = montant / 5;
		montant =  montant % 5;
		
		int nb2 = montant / 2;
		montant =  montant % 2;

		int nb1 = montant / 1;
		montant =  montant % 1;
		
		System.out.println("Apres décomposition de :  " + montant + "euro on a ");
		System.out.println(nb20 + "  de billets de 20 ");
		System.out.println(nb10 + " de billets de 10 ");
		System.out.println(nb5 + " de billets de 5 ");
		System.out.println(nb2 + " de piece de 2 ");
		System.out.println(nb1 + " de piece de 1 ");

	}

}
