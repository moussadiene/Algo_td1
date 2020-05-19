package application;

import java.util.Scanner;

/**
 * 
 * 

Exercice 16 : 
			Faire un programme qui calcule et affiche la division de a par b par soustractions successives

 * 
 * @author djine
 *
 */
public class Exercice_16 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int a,b;
		do {
			System.out.println("Saisir la valeur du dividant :");
			a = sc.nextInt();
		}while(a <= 0);
		do {
			System.out.println("Saisir la valeur du dividant :");
			b = sc.nextInt();
		}while(b <= 0);

    int cpt = 0;
    
    while ( b <= a ) {
    	
            a = a - b;
            cpt ++;
    }      

   
    System.out.println("le resultat de la division entier est : "+cpt);
    System.out.println("le reste de la division entier est : "+ a);

	}

}
