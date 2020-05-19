package application;

import java.util.Scanner;

import java.lang.Math;
/**
 * 


Exercice 6 :
Faire un programme qui saisit  les coordonnées de 2 points A (x1, y1) et b(x2, y2) et qui affiche la distance entre les 2 points.
Formule : distante = racine carrée de ((x1 – x2)2  + (y1 – y2)2)
 Racine carrée : sqrt. Ex : sqrt(7) ; <math.h>



FIN
 * @author djine
 *
 */
public class Exercice_06 {

	private static Scanner clavier;

	public static void main(String[] args) {
			System.out.println("---------------------Calcul de distance entre 2 point -----------------\n");
		clavier = new Scanner(System.in);
		
		System.out.println("Saisir les coordonnées du Point A (Xa,Ya)");
		System.out.print("Xa : ");
		double x1 = clavier.nextDouble();
		System.out.print("Ya : ");
		double y1 = clavier.nextDouble();
		
		System.out.println("Saisir les coordonnées du Point B (Bx,By)");
		System.out.print("Xb : ");
		double x2 = clavier.nextDouble();
		System.out.print("Yb : ");
		double y2 = clavier.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x1 -x2 , 2) + Math.pow(y1 -y2 , 2));
		
		System.out.println("la distance est de A et B est ::"+ distance);

	}

}
