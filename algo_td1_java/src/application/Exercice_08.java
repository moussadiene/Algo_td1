package application;

import java.util.Scanner;

/**
Exercice 8 : 
	Ecrire un algorithme permettant de résoudre une équation du second degré. 
	Ax2 + bx + c = 0
 * 
 * @author djine
 *
 */
public class Exercice_08 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("-----------------------Resolution d'equztion au second degres------------------");
		double a;
		do {
			System.out.println("saisir a de x2");
			a = sc.nextFloat();
			if(a == 0)
				System.out.println("a doit etre different de 0");
		}while(a == 0);
				
		System.out.println("saisir b de x");
		double b = sc.nextFloat();	
		System.out.println("saisir c ");
		double c = sc.nextFloat();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		double x1 , x2;
		if (delta > 0 ) {

			x1 = (- b - Math.sqrt(delta)) / (2 * a);
	
			x2 = (- b + Math.sqrt(delta)) / (2 * a);
	
			System.out.println(" l ‘ equation admet 2 solutions  : x1 = " +  x1 +" x2 = "+ x2 );
		}else {
			if (delta == 0 ) {
	
				x1 = - b / 2 * a;
	
				System.out.println(" l ‘ equation admet 1 solution  : x0 = " +  x1 );
	
			}else {
				System.out.println(" delta est inferieur a 0, la solution l’ensemble vide ");
			}
		}
	
	}

}
