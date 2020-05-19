#coding:utf-8
"""

Exercice 12 : Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même). 
				Ainsi par exemple, l’entier 6 est parfait car 6 = 1 + 2 + 3. 
				Écrire un algorithme permettant de déterminer si un entier naturel est un nombre parfait.
 
"""
print("--------------------------- Nombre Parfait --------------------------------------")

val = -1

while(val < 0) :
    val = int(input("Saisir un nombre entier nature :: "))

i = 1
som = 0

while(i <= val/2):
    if(val % i == 0):
        som += i
    i += 1

if(som == val):
    print(val ,"est un nombre parfait")
else:
    print(val ,"n'est pas un nombre parfait")
    