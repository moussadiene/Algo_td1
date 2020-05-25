package application;

import java.util.Scanner;

/**
 * 
 * 
 * 
Exercice 13 : 
	Faire un programme qui saisit une date (jour, mois et année) at qui indique si la date est valide
Exercice 14 : 
	Faire un programme qui saisit une date (jour, mois et année) at qui indique si l’année est bissextile /** 
        
        diviser les mois en deux parties:
            1. du 1 au 7ieme mois, les mois impaire compte 31 jours au max
                et les mois paires comptent 30 jours chauffe fevrier qui 29 jours max
            
			2. et d 8 au 12ieme mois, les mois impaire compte 30 jours max
                et les mois paires comptent 31 jours au max	
   
 * @author djine
 *
 */
public class Exercice_13_14 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int choix;
		do {
		do {
			System.out.println("1- Teste date valide ::");
			System.out.println("2- Teste Bissextille  ::");
			choix = sc.nextInt();
		}while(choix < 1 || choix >= 3);
		
		System.out.println("----------Tester si une date est valide ou pas----------") ;
		System.out.print("Jour :");	
		int jj = sc.nextInt();
		System.out.print("Mois :");	
		int mm = sc.nextInt();
		System.out.print("Annee :");	
		int an = sc.nextInt();
		switch (choix) {
			case 1:
				date_valid(jj,mm,an);
				break;
			case 2:
				if(date_valid(jj,mm,an)) {
					bissextille(an);
				}
				break;

		default:
			break;
		}
		System.out.println("Voulez vous continuer !!! \n \t 1-oui \n \t 2-non");
		choix = sc.nextInt();
		}while(choix!=2);
	
	}
	

	public static boolean date_valid(int jj,int mm,int an) {
		
		boolean trouve = false; 
		if (jj > 31 || jj < 1 || mm > 12 || mm <1 || an < 1000 || an > 2020) {
			System.out.println(jj + "/" + mm + "/" + an + " est invalid");
		}else {
			
			if(mm <= 7) {
				
				if(mm % 2 == 0 && jj == 31){
					System.out.println("invalide, ce mois ne compte pas 31 jours");
				}else {
					
					if(mm == 2 && jj == 29 && an % 4 != 0 || an % 100 == 0 || an % 400==0){
						System.out.println("invalide, le mois de fevrier de cette annee compte 28 jours");
					}else {
						System.out.println(jj + "/" + mm + "/" + an + " est valide");
						trouve = true;
					}
				}
			}else {
				
				if(mm % 2 == 1 && jj == 31) {
	               System.out.println("invalide, ce mois compte 30 jours");
				}else {
					 System.out.println(jj+"/"+ mm +"/" + an + " est valide");
					 trouve = true;
				}
			}
		}
		return trouve;
	}

	public static void bissextille(int an) {
		if (an % 4 == 0 && an % 100 != 0 && an % 400!=0) {
			System.out.println("l'annee :" + an +" est bissextile");
		}else {
			System.out.println("l'annee :" + an +" n'est pas bissextile");
		}

	}
	
}
