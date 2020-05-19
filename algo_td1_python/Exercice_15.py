#coding:utf-8

"""
 Exercice 15 :
    Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre. 
    Par exemple si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3+ 4 = 10 
    Réécrire l'algorithme qui calcule cette fois la moyenne !
"""

print("----------------------- SOMME ET MOYENNE -----------------\n")

nbr = 0

while nbr <= 0 :
    nbr = int(input("Saisir un entier naturel ::"))

i = 1
som = 0
while(i <= nbr) :
    som += i
    i += 1

print("La somme des element compris entre 1 et ",nbr," est ::",som)

moy = float(som / nbr)

print(" La moyenne est :: ",moy)









