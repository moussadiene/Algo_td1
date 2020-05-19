#coding:utf-8

"""
exercice 5 :
    Ecrire un programme qui saisit 5 variables de type entier au 
    clavier et qui affiche leur somme. 
    Utiliser une boucle (for ou while ou do..while).		
"""
print("------------------------------- Somme de 5 entiers -------------------")
i = 1
som = 0
while (i <= 5) : 

    val = input(" Saisir un entier  ",i,"::")
    val = int(val)
    som = som + val
    i += 1

print("\n La somme est : ",som)