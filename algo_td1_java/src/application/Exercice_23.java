package application;
/**
 * 
 * @

 *
 */
public class Exercice_23 {

	public static void main(String[] args) {
		
		int  N = 12 ;				
		final long MLLD = 1000000000;	
		
		int M = 0 ;
		int m = 2;						// mois 0 : nombre de bebe lapins ;			
		int FN = m;						// mois 0 : nombre de lapin adultes ;		
		
		M = 2;							// mois 1 : nombre de bebe lapins ;			
		FN = M;							// mois 1 : nombre de lapins adultes;		
		for (int i = 2; i <= N; i++) {
			
				FN = M + m;				// determine le nombre de lapins							
				m = M ;					// stockage de nombre de bebe lapins a venir au mois prochain				
				M = FN ;				// stockage de nombre d'adulte lapins a venir au mois prochain				
			
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
