package application;

import java.util.Scanner;

/**
 * Exercice 12 : Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même). 
				Ainsi par exemple, l’entier 6 est parfait car 6 = 1 + 2 + 3. Écrire un algorithme permettant
			 	de déterminer si un entier naturel est un nombre parfait.

FIN
 * @author djine
 *
 */
public class Exercice_12 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		int val;
		do {
			System.out.println("Saisir un entier naturel ::");
			val = sc.nextInt();
		}while(val< 0);
		
		int som = 0;
		for (int i = 1; i <= val/2; i++) {
			if(val % i == 0) {
				som += i;
			}
		}
		if(som==val) {
			System.out.println(val + " est un nombre parfait.");
		}else {
			System.out.println(val + " n'est pas un nombre parfait. ");
		}
	}

}
