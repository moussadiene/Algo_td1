package application;
/**
 * 
 * Exercice 23. 
		La multiplication des lapins. Vous allez faire l’acquisition d’un couple de bébés lapins. Au bout d’un mois ce couple est adulte. Le mois suivant il donne naissance à un couple de bébés lapins : vous avez maintenant 4 lapins. Puis chaque couple engendre tous les mois un nouveau couple deux mois après sa naissance. 
		Nous avons le schéma ci-contre :
			 Légende : m : bébé lapin ; M : lapin adulte. 
				• Mois 0. m m 
				• Mois 1. M M 
				• Mois 2. M M m m 
				• Mois 3. M M M M m m
				• Mois 4. M M M M M M m m m m 
		Notons FN le nombre de lapins que l’on a au bout du N-ième mois. On convient que : F0 = 2. Nous avons donc F1 = 2 puis F2 = 4 et F3 = 6. Plaçons-nous au mois N + 2, nous aurons tous les couples de lapins du mois précédent (le mois N + 1) et toutes les progénitures des couples de lapins du mois N. Nous avons donc la relation : FN+2 = FN+1 + FN
		
		Rédiger un programme qui calcule de manière itérative le nombre de lapins au bout d’un an (le mois N = 12). 

		Au bout de combien de mois dépasse-t’on le milliard de lapins ?
 *
 */
public class Exercice_23 {

	public static void main(String[] args) {
		
		int  N = 12 ;				
		final long MLLD = 1000000000;	
		
		int M = 0 ;
		int m = 2;						// mois 0 : nombre de bebe lapins ;			
		int FN = m;						// mois 0 : nombre de lapin adultes ;		
		
										
		for (int i = 2; i <= N; i++) {
				if(i == 1) {
					M = 2;							// mois 1 : nombre de bebe lapins ;			
					FN = M;							// mois 1 : nombre de lapins adultes;
				}else {
					FN = M + m;				// determine le nombre de lapins							
					m = M ;					// stockage de nombre de bebe lapins a venir au mois prochain				
					M = FN ;
				}
								// stockage de nombre d'adulte lapins a venir au mois prochain				
			
		}
		
		System.out.println("le nombre de lapins au bout de "+ N + " mois est : " + FN );
		
		
		while(FN <= MLLD) {
			N++;
			FN = M + m;		
			m = M ;		
			M = FN ;
		}
		System.out.println("le nombre de depasse " + MLLD + " au bout de " + N +" mois");
		
		
		
		
	
	}

}

/**
 * if(FN > MLLD ) {
			for (int i = 1; i <= MLLD; i++) {
				if(i == 1) {
					M = 2;
					m = 2;		// mois 1 : nombre de bebe lapins ;
					N = M;				// mois 1 : nombre de lapins adultes;
				} else {
					N = M + m;		// determine le nombre de lapins		
					m = M ;			// stockage de nombre de bebe lapins a venir au mois prochain
					M = N ;		// stockage de nombre d'adulte lapins a venir au mois prochain
				}
			}
			System.out.println("le nombre de depasse " + MLLD + " au bout de " + N +" mois");
 */
