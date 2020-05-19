#coding:utf-8

"""

Exercice 19 : 
	Ecrire l’algorithme qui affiche la somme des prix d'une suite d'articles en CFA (entiers)
	saisies par l'utilisateur et se terminant par zéro.

"""

print("------------------------- Somme prix article --------------------------------\n")

print(" Taper 0 pour arreter la somme des prix d'article !!!")
prix = 1
cpt = 1
som = 0 
while(prix!=0):
    prix = int(input("Prix article :: "))
    if(prix < 0):
        print("prix n doit pas etre negatif !!!")
    else :
        cpt += 1
        som +=prix
        print("ok")

print('La somme des prix darticles saisis est :: ',som )