package application;

import java.util.Scanner;

/**
 * 
Exercice 26 : 	Faire un programme qui saisit une suite de nombre et qui dit les si les nombres saisis sont 
				dans l’ordre croissant ou décroissant ou quelconque.
 * @author djine
 *
 */
public class Exercice_26 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int nbr;
		System.out.println("---------------Ordre de saisie ------------------(");
		do {
			System.out.println("Donner le nombre d'entier a saisir ::");
			nbr = sc.nextInt();
		}while(nbr <= 0);
		
		int val, val_pre = 0 ,ordre = 0;;
		
		for (int i = 1; i <= nbr; i++) {
			System.out.print("valeur " + i + " ::");
			val = sc.nextInt();
			if(i > 1) {
				if(val_pre < val && ordre != 2 && ordre != 3) {
					ordre = 1;
				}else {
        			if( val_pre > val && ordre !=1  && ordre != 3) {
		        		ordre = 2;	
        			}
        			else {
        				ordre = 3;
        			}
        		}
			}
			val_pre = val;
		}
		if(ordre == 1) {
			System.out.println("la saisie des valeurs est dans l'ordre croissant ");
		}else {
			if(ordre == 2) {
				System.out.println("la saisie des valeurs est dans l'ordre décroissant ");
			}else {
				System.out.println("la saisie des valeurs est quelconque");
			}
				
		}
	}

}
