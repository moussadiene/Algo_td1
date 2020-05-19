#coding:utf-8

"""

	Exercice 7 : Décomposition d’un montant en euros Écrire un algorithme permettant de décomposer un montant 
				entré au clavier en billets de 20, 10, 5 euros et pièces de 2, 1 euros, de façon à 
			  minimiser le nombre de billets et de pièces.

"""

print("------------------------ Decomposition en Euro---------------------")

print("Saisir un montant en euro :")

montant = int(input(">"))
m = montant
nb20 = int(montant / 20)
montant =  montant % 20

nb10 = int(montant / 10)
montant =  montant % 10

nb5 = int(montant / 5)
montant =  montant % 5

nb2 = int(montant / 2)
nb1 =  int(montant % 2)

 
		
print("Apres décomposition de :  " , m , "euro on a ")
print(nb20 , "  de billets de 20 ")
print(nb10 , " de billets de 10 ")
print(nb5 , " de billets de 5 ")
print(nb2 , " de piece de 2 ")
print(nb1 , " de piece de 1 ")