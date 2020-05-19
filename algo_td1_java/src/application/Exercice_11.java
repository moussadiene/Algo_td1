package application;


/**
 * 
Exercice 11 : Ecrire un algorithme calculatrice permettant la saisie du premier entier (a) de l'opération 
				( + ou – ou * ou / : sont des caractères) et du deuxième entier (b) et qui affiche le résultat.

Algo : operation 

Var a , b : entier;
	op : caractere;
	result : reel;
	

DEBUT : 
 	
	
	ECRIRE ("saisir le premier nombre") ;
	LIRE (a) ;		
	ECRIRE ("saisir le deuxieme nombre") ;
	LIRE (b) ;	
	
	REPETER
		ECRIRE ("saisir l'operateur ( - ou + ou * ou / ) ") ;
		LIRE (op) ;	
	JUSQU’A( op = '-' OU op = '+' OU op = '*' OU op = '/') ;
	
	SI (operateur = '-' ) ALORS
		result ←  a - b ;
	FINSI
	
	SI (operateur = '+' ) ALORS
		result ←  a + b ;
	FINSI
	SI (operateur = '*' ) ALORS
		result ←  a * b ;
	FINSI
	
	SI (operateur = '/' ET b!=0) ALORS
		result ←  a / b ;
	FINSI
	
	ECRIRE (" le resultat est : ",result);
FIN
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Exercice_11 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		String op;
		
		System.out.println("-----------Calculatrice ( '-' ou '+' ou '*' ou '/' ) ----------\n");
		System.out.print("Saisir nombre 1 ::");
		int a = sc.nextInt();
		sc.nextLine();
		do {
			
			System.out.print("saisir l'operateur:: ");
			 op = sc.nextLine();
		}while( !op.equals("-") && !op.equals("+")  && !op.equals("*")  && !op.equals("/"));
		
		
		System.out.print("Saisir nombre 1 ::");
		int b = sc.nextInt();

		double  resultat = 0;
		
		if(op.equals("-")) {
			resultat = (double) a - b;
		}else {
			if(op.equals("+")) {
				resultat = (double) a + b;
			}else {
				if(op.equals("*")) {
					resultat = (double) a * b;
				}else {
					if(b != 0) {
						resultat = (double) a / b;
					}else {
						System.out.println("la deuxieme valeur doit difference de 0");
						
					}
				}
			}
		}
		System.out.println(a + " "+ op + " "+ b + " = "+ resultat );
	}

}
