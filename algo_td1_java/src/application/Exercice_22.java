package application;

import java.util.Scanner;

/**
 * 
 * 
Exercice 22 : 
		On se propose de saisir N entiers différents entre 1 et 100 (N étant un entier naturel compris entre 10 et 50) puis afficher la plus longue séquence croissante tout en précisant la position du premier nombre de cette séquence.
			Exemple : Pour N=15
 								1  2  3.  1  2  3  4  5  6  7  8 . 2  3  4  5 
		Le programme affiche :
		La plus longue séquence est 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 *   qui débute à la position 4  et elle est de longueur 7

 * @author djine
 *
 */
public class Exercice_22 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int N;
		System.out.println("------------------- Sequence croissante --------------------------\n");
		
		do {
			System.out.print("Donner le nombre de cellule du tableau ::");
			N = sc.nextInt();
					
		}while(N <= 0);
		
		int tab[] = new int[N];
		
		for (int i = 0; i < tab.length; i++) {
			do {
				System.out.print("Cellule "+i+" ::");
				tab[i] = sc.nextInt();
				
			}while(tab[i] <1 && tab[i] >100);
		}
		
		int posD = 0;
	   	int taille = 1;
	   	int maxlong = 1;
	   				
	   	for (int i = 0; i < tab.length-1; i++) {
	   		if(tab[i] < tab[i+1]) {
	   			taille ++;
	   			if(maxlong < taille ) {
	   				maxlong = taille ;
					posD = i - taille + 2 ;
	   			}
	   		}else {
	   			taille = 1;		
	   		}
	   		
		}

	   	System.out.print("La plus longue séquence est :: ");
	   	for (int i = posD; i < posD+maxlong; i++) {
	   		
			System.out.print(tab[i] + " * ");
		}
	   	System.out.print("\n qui débute à la position "+ posD +"  \n et elle est de longueur "+ maxlong);
	}

}
