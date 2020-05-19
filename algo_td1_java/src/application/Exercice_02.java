package application;

import java.util.Scanner;

/*
 * exercice 2 : 
	Ecrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle et lui retourne sa surface et son périmètre. 
	PI =  4 * arc tangeante de 1. la fonction arc tangeante est atan ex : atan(2).
*/
public class Exercice_02 {
	private static Scanner sc;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		
		double r , surf , peri , pi ;
		
		do {
			System.out.println("Saisir le rayon du cercle svp  :");
				r = sc.nextDouble();
		} while (r<0);
		
		pi =  4 * Math.atan(1);
		
		surf = Math.pow(r, 2) * pi;
		
		peri = 2 * pi * r;
		
		System.out.println("le perimetre est : " + peri);
		System.out.println("la surface  est : " + surf);
		
		
		
		
	}

}
