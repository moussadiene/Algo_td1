package application;

import java.util.Scanner;

/**
 * 
 * 

Exercice 21 : 
	Ecrire un algorithme mettant en œuvre le jeu suivant entre deux joueurs : Le premier utilisateur 
	saisi un entier que le second doit deviner. Pour cela, il a le droit à autant de tentatives qu'il souhaite. 
	A chaque échec, le programme lui indique si l'entier est plus grand ou plus petit que sa proposition. 
	Un score est affiché lorsque l'entier est trouvé.



FIN
 * @author djine
 *
 */
public class Exercice_21 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("------------	Jeu et Score ----------------- \n");
		System.out.println("Joueur 1: Donner la valeur mistere ::");
		
		int val = sc.nextInt();
		int test,cpt = 0;
		do {
			System.out.print("Joueur 2 :: ");
			test = sc.nextInt();
			cpt ++;
			
			if (test < val ) {
				System.out.println("\tLa valeur mistere est plus grand !!  ");	
			}else {
				if(test > val) {
					System.out.println("\tLa valeur mistere est plus petit !!  ");	
				}else {
					System.out.println("Vous avez trouvez le valeur mistere apres "+cpt+" tentatives !!  ");	
				}
			}

			
		}while(test != val);
		
		
	}

}
