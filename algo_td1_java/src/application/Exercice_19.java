package application;
/**
 * 
 * Exercice 19 : 
	Ecrire l’algorithme qui affiche la somme des prix d'une suite d'articles en CFA (entiers)
	saisies par l'utilisateur et se terminant par zéro.
 */
import java.util.Scanner;

public class Exercice_19 {


	
	private static Scanner sc;

	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
		 int prix, som = 0,cpt = 0;
		 
		 
		do {
			
			System.out.println("Entrer le prix "+ ++cpt +":  (taper 0 pour arreter de somme prix saisit) :: ");
			prix = sc.nextInt();
			
			if(prix <  0) {
				System.out.println("le prix d'un article est toujour sup est 0");
			} else {
				som = som + prix;
			
			}
			
		} while(prix != 0) ;
		
		System.out.println(" la somme des "+cpt+" prix est : "+ som);
	}


}
