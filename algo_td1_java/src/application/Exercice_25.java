package application;

import java.util.Scanner;

/**
 * 
 * 
Exercice 25 : Ecrire le code C du 
programme qui affiche le texte suivant pour les chiffres de 1 à 10 :
1 
2 2 
3 3 3
Ecrire un programme qui saisit un nombre et qui 
dit si ce nombre est premier ou pas.
 * @author djine
 *
 */
public class Exercice_25 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choix;
		do {
		do {
			System.out.println("1- Affichage code C ::");
			System.out.println("2- Tester de nombre premier ::");
			System.out.print("choix !!! ::");
			choix = sc.nextInt();
		}while(choix < 1 || choix >= 3);
		
		switch (choix) {
		case 1:
				for (int i = 1; i <= 10; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(i+ " ");
					}
					System.out.println("");
				}
			break;
		case 2:
				int val;
				do {
					System.out.println("Saisir un entier naturel ::");
					val = sc.nextInt();
				}while(val<=0);
				int cpt = 0;
				for (int i = 1; i < val/2; i++) {
					if(val % i == 0) {
						cpt++;
					}
				}
				if(cpt ==1) {
					System.out.println(val+" est un nombre premier");
				}else {
					System.out.println(val+" n'est pas un nombre premier");
				}
			break;

		default:
			break;
		}
		System.out.println("Voulez vous continuer !!! \n \t 1-oui \n \t 2-non");
		choix = sc.nextInt();
		}while(choix!=2);
	}

}
