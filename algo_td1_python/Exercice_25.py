#coding : utf-8

"""
Exercice 25 : Ecrire le code C du 
                programme qui affiche le texte suivant pour les chiffres de 1 à 10 :
                1 
                2 2 
                3 3 3
                Ecrire un programme qui saisit un nombre et qui 
                dit si ce nombre est premier ou pas.
"""

print("--------------------- Code C et Nombre Premier---------------------\n")

test = 0
while(test != 2):

    print("1- Affichage code C ::")
    print("2- Nombre premier ::")
    choix = 0

    while(choix < 1 or choix >= 3) :
        choix = int(input("\nchoix !! ::"))

    
    if (choix == 1):
        print("\n----------------- Code C -------------------------\n")
        i  = 1 
        while(i <= 10) :
            j = 1
            while (j <= i) :
                print(i, " ",end="")
                j = j + 1

            print("")
            i = i + 1
        
    else : 
        print("\n----------------- Nombre Premier -------------------------\n")
        val = 0
            
        while(val<=0) :
            val = int(input("Saisir un entier naturel ::"))

        cpt = 0
        i = 1
        while(i <= val/2) :
            if(val % i == 0) :
                cpt += 1
            i = i + 1

        if(cpt ==1) :
            print(val,"\n est un nombre premier")
        else :
            print(val," \nn'est pas un nombre premier")
    print("\n-----------------------------------------------------------\n")
    print("Voulez vous continuer !!! \n \t 1-oui \n \t 2-non")
    test = int(input("choix :: "))
