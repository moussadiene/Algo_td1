package application;

import java.util.Scanner;

/**
 * 
 * 

Exercice 17: 
 Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
 soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux. 

Exercice 18: 
Faire un programme qui calcule et affiche le PPCM de deux entiers saisis au clavier.
 * @author djine
 *
 */
public class Exercice_17_18 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int choix;
		do {
			do {
				System.out.println("1- Calcul de PGCD de 2 entiers ::");
				System.out.println("2- Calcul de PPCM de 2 entiers ::");
				System.out.print("choix !!! ::");
				choix = sc.nextInt();
			}while(choix < 1 || choix >= 3);
			
			int val1,val2;
			do {
				System.out.print("Entier naturel 1 ::");
				val1 = sc.nextInt();
			}while(val1 <= 0);
			
			do {
				System.out.print("Entier naturel 2 ::");
				val2 = sc.nextInt();
			}while(val2 <= 0);
			
			switch (choix) {
			case 1:
				System.out.println("le PGCD ( "+val1+" , "+ val2+") = "+pgcd(val1, val2));
				break;
			case 2:
				ppcm(val1, val2);
				break;
				
			default:
				break;
			}
			System.out.println("Voulez vous continuer !!! \n \t 1-oui \n \t 2-non");
			choix = sc.nextInt();
		}while(choix!=2);
		System.out.println(" Merci !!!");
	}
	
	public static int pgcd(int val1,int val2) {
		
		while(val1 != val2) {
			if(val1 < val2 ) {
				val2 = val2 - val1 ;
			}else {
				val1 = val1 - val2 ;
			}
		}

    	 return val2; 		
	}

	public static void ppcm(int val1,int val2) {
		int pgcd = pgcd(val1, val2);
		
		System.out.println("le PPCM est "+ (val1  * val2) / pgcd );
		
	}
}
