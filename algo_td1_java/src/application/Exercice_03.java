package application;

import java.util.Scanner;

/*
exercice 3:
	Version 1 :
		Faire un programme qui saisit 3 résistances : R1, R2 et R3.
		Calculer et afficher la résistance en série : R1 + R2 +R3
		Calculer et afficher la résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)

	Version 2 :
		Demander a l’utilisateur d’indiquer son choix.
		S’il entre la valeur  1, calculer et afficher la fréquence en série.
		S’il entre la valeur 2, calculer et afficher la fréquence en parallèle.

*/
public class Exercice_03 {
	
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		double r1, r2, r3  ;
		
		System.out.println("--------------------------Version 1-----------------------------------------");

		do {
			System.out.println("Saisir le resistance R1 :");
			r1 = sc.nextDouble();
		} while (r1 <= 0);
		
		do {
			System.out.println("Saisir le resistance R2 :");
			r2 = sc.nextDouble();
		} while (r2 <= 0);
		
		do {
			System.out.println("Saisir le resistance R3 :");
			r3 = sc.nextDouble();
		} while (r3 <= 0);
		
		double r_serie = r1 + r2 + r3 ;
		
		double r_para = (r1 * r2 * r3) / (r1*r2 + r2*r3 + r1*r3) ;
		
		System.out.println("la resistance en serie  est  :" + r_serie) ;
		System.out.println("le registance en paralelle est  :" + r_para);
		
		
		System.out.println("--------------------------Version 2-----------------------------------------\n");
		int choix;
		do {
			System.out.println("1 - frequence en serie :");
			System.out.println("2 - frequence en paralelle  :") ;
			System.out.println(" Faite votre choix !!! ") ;
			choix = sc.nextInt();
		} while (choix!=1 && choix!=2 );
		
		switch (choix) {
		case 1:
			double f_serie = (r1 + r2 + r3) / r_serie;
			System.out.println("la resistance en serie  est  :" + f_serie);
			break;
		case 2:
			double f_para = (r1 + r2 + r3) / r_para;
			System.out.println("la resistance en serie  est  :" + f_para);
		default:
			break;
		}
	}

	
}
