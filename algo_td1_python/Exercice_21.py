#coding:utf-8

"""

Exercice 21 : 
	Ecrire un algorithme mettant en œuvre le jeu suivant entre deux joueurs : Le premier utilisateur 
	saisi un entier que le second doit deviner. Pour cela, il a le droit à autant de tentatives qu'il souhaite. 
	A chaque échec, le programme lui indique si l'entier est plus grand ou plus petit que sa proposition. 
	Un score est affiché lorsque l'entier est trouvé.

"""
rint("------------	Jeu et Score ----------------- \n")
print("Donner la valeur mistere ::")	
val = int(input("Joueur 1 :: "))
test = int(val+1)
cpt = 0
print("trouver la valeur mistere :: ")
while(test != val) :
    test = int(input("Joueur 2 :: "))
    cpt += 1
    
    if (test < val ):
        print("\tLa valeur mistere est plus grand !!  ")	
    else:
        if(test > val):
            print("\tLa valeur mistere est plus petit !!  ")
        else :
            print("Vous avez trouvez le valeur mistere apres ",cpt," tentatives !!  ")	
        
 p   

    
