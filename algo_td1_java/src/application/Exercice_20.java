package application;

import java.util.Scanner;

/**
 * Exercice 20 : 

	Ecrire un algorithme qui demande successivement 10 nombres à l'utilisateur, 
	et qui affiche à la fin le plus grand de ces 10 nombres Et affiche aussi son rang dans la liste saisie
 * @author djine
 *
 */
public class Exercice_20 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		final int LIMIT = 10;
		
		sc = new Scanner(System.in);
		int rang = 0 , max = 0;
		
		System.out.println("-----Remplissage liste de 10 entiers : -----\n");
		for (int i = 1; i <= LIMIT; i++) {
			
			System.out.print("Valeur "+ i + " ::");
			int val = sc.nextInt();
			
			if(i == 1) {
				max = val;
				rang = 1;
			}else {
				if(max <= val) {
					max = val;
					rang = i ;
				}
			}
			
		}
		 System.out.println("le nombre le plus grand est  : " + max );
		 System.out.println("son rang dans la liste saisie est : " + rang);

	}

}
