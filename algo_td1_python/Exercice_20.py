#coding:utf-8

"""
Exercice 20 : 

	Ecrire un algorithme qui demande successivement 10 nombres à l'utilisateur, 
	et qui affiche à la fin le plus grand de ces 10 nombres Et affiche aussi 
    son rang dans la liste saisie
"""

print("---------------------------- Le plus Grand et Rang --------------------------------------")

print(" Saisir 10 nombre entier :: ")

max = 0
rang = 0

taille = 10
i = 1
while(i <= taille) :
    print("Nombre ", i , " ::")
    val = int(input("> "))
    if(i == 1) :
        max = val
        rang = i
    else:
        if max < val:
            max = val
            rang = i
    i += 1

print("Le nombre le plus grand est :: ", max," \nSont rang est :: ", rang)













