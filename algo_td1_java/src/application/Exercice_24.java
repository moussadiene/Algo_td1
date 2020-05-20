package application;

import java.util.Scanner;

/**
 * 

Exercice 24: 
Nombre secret : écrire un programme qui demande à l’utilisateur 1 d’entrer un nombre et à l’utilisateur 2 de 
le trouver en affichant, à chaque tentative, « trop grand » si le nombre entré est plus grand que le nombre secret,
 « trop petit » sinon. Le programme s’arrête quand l’utilisateur 2 a trouvé le nombre secret.




 * @author djine
 *
 */
public class Exercice_24 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		
		
		System.out.println("------------ Trouver le nombre devinette et score----------------- \n");
		
		System.out.println("Utilisateur 1: Donner la valeur mistere ::");
		
		int val = sc.nextInt();
		int test;
		do {
			System.out.print("Utilisateur 2 :: ");
			test = sc.nextInt();
			
			
			if (test < val ) {
				System.out.println("\tTrop petit !!  ");	
			}else {
				if(test > val) {
					System.out.println("\t Trop grand!!  ");	
				}else {
					System.out.println("SUper !!! Vous avez trouvez ");	
				}
			}

			
		}while(test != val);
		
		
		
	}

}
