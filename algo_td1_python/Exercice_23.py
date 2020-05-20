#coding:utf-8
"""
Exercice 23. 
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
"""

print("---------------------- La multiplication des lapins : SUITE -------------------------")

N , MLLD = 12 ,1000000000

M = 0
m = 2								
FN = int(m)							

M = 2										
FN = M
i = 2								
while (i <= N ):
    FN = M + m									
    m = M 								
    M = FN	
    i = i + 1							
    
print("le nombre de lapins au bout de ", N , " mois est : " , FN )


while(FN <= MLLD) :
    N = N + 1
    FN = M + m	
    m = M 	
    M = FN 

print("le nombre de depasse " , MLLD , " au bout de " , N ," mois")

		


