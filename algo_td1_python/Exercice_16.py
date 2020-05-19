#coding:utf-8

"""
Exercice 16 : 
			Faire un programme qui calcule et affiche la division de a par b 
            par soustractions successives.
"""

a = 0
b = 0

print("------------------- Division d 2 entier par soustraction successive ---------------------\n")

while (a <= 0) :
    a = int(input("Saisir l'entier naturel :: "))

while (b <= 0) :
    b = int(input("Saisir le diviseur :: "))
cpt = 0

while(a >= b) :
    a = a - b
    cpt += 1

print("le resultat de la division entiere est ::",cpt)
print("le reste de la division entiere est ::",a)



