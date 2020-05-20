"""
Exercice 24: 
Nombre secret : écrire un programme qui demande à l’utilisateur 1 d’entrer un nombre et à l’utilisateur 2 de 
le trouver en affichant, à chaque tentative, « trop grand » si le nombre entré est plus grand que le nombre secret,
 « trop petit » sinon. Le programme s’arrête quand l’utilisateur 2 a trouvé le nombre secret.


"""

print("------------	Trouver le nombre devinette ----------------- \n")
print("Donner la valeur mistere ::")	
val = int(input("Utilisateur 1 :: "))

test, cpt = int(val+1) , 0

print("trouver la valeur mistere :: ")
while(test != val) :
    test = int(input("Utilisateur 2 :: "))
    cpt += 1
    
    if (test < val ):
        print("\t Trop petit !!  ")	
    else:
        if(test > val):
            print("\t Trop grand !!  ")
        else :
            print("Super , vous avez trouvez le valeur mistere !!!  ")	
        
 