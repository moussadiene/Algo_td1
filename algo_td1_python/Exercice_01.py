#coding:utf-8
"""
exercice 1 : 
			Ecrire un programme qui saisit deux entiers a et b, calcule et affiche le 
			quotient entier, le reste de la division et le ratio (quotient réel).
			Algo : division 
"""

nbr1 = input("Entrer le premier entier : ")
nbr1 = int(nbr1)

nbr2 = input("Entrer le deuxieme entier : ")
nbr2 = int(nbr2)

while(nbr2 == 0):
    print("le deuxieme entier ne doit pas etre 0")
    nbr2 = input("Saisir encore : ")
    nbr2 = int(nbr2)

qentier = nbr1 / nbr2
qentier = int(qentier)
qreel = float(nbr1 / nbr2)
reste = nbr1 % nbr2

print("le quotient entier est : ",qentier)
print("le quotient reel est : ",qreel)
print("le reste de la division entiere est : ",reste)
