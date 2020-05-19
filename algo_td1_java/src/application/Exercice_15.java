package application;

/**
 * Exercice 15 :
 Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre. 
 Par exemple si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3+ 4 = 10 
 Réécrire l'algorithme qui calcule cette fois la moyenne !
    
  
 * 
 */
import java.util.Scanner;

public class Exercice_15 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int nbr;
		do {
			System.out.println("Saisir un entier naturel::");
			nbr = sc.nextInt();
		}while(nbr <= 0);
		
		int som = 0;
		for (int i = 1; i <= nbr; i++) {
			som += i;
		}
		
	    System.out.println("la somme des entiers compris entier naturel [1 .. "+nbr+"] est "+som);
	    
	    float moy = (float)som / nbr;

	    System.out.println("la moyenne est "+moy);

	}
}
