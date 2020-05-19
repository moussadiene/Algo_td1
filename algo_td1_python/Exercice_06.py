#coding:utf-8


"""
Exercice 6 :
Faire un programme qui saisit  les coordonnées de 2 points A (x1, y1) et b(x2, y2) et qui affiche la distance entre les 2 points.
Formule : distante = racine carrée de ((x1 – x2)2  + (y1 – y2)2)
 Racine carrée : sqrt. Ex : sqrt(7) ; <math.h>	
"""
from math import sqrt,pow

print("Saisir les coordonnées du Point A (Xa,Ya)")

x1 = float(input("Xa : "))
		
y1 = float(input("Ya : "))
		
print("Saisir les coordonnées du Point B (Xb,Yb)")

x2 = float(input("Xb : "))
		
y2 = float(input("Yb : "))
		
		
distance = sqrt(pow(x1 -x2 , 2) + pow(y1 -y2 , 2))
		
print("la distance est de A et B est ::", distance)