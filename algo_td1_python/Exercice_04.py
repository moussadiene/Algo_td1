#coding:utf-8


"""
exercice 4 : 
Ecrire un programme qui saisit un réel x et un entier n et affiche x à la puissance n.
Version 1 : utiliser la fonction pow  du fichier d’en-tête <math.h>  ex : pow(x,n)
Version 2 : en utilisant un boucle		
"""

from math import pow

print("---------------------------Version 1 : Puissance ----------------------------")

x = input("Saisir un nombre entier naturel :")
x= int(x)
while x < 0 :
    print("L'entier doit etre superieur a 0 !!!")
    x = input("Saisir encore > ")

n = input("Saisir l'exposant :  ")
n= int(n)
while n < 0 :
    print("L'expossant doit etre superieur a 0 !!!")
    n = input("Saisir encore > ")

p = pow(x,n)
p = int(p)
print("La puissance est ",p)



print("---------------------------Version 2 : Puissance ----------------------------")

i = 0
p2 = 1
while(i != n):
    p2 = p2 * x
    i += 1

print("La puissance est ",p2)




