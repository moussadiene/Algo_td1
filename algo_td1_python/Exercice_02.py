#coding:utf-8

"""
Ecrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle et lui retourne sa surface et son périmètre. 
	PI =  4 * arc tangeante de 1. la fonction arc tangeante est atan ex : atan(2).
    double r , surf , peri , pi ;
		
"""
from math import atan,pow

r = input("Saisir le Rayon du cercle : ")
r = float(r)
while(r < 0):
    print("Rayon doit etre > 0 !!!")
    r = input("Saisir encore : ")
    r = int(r)

pi = 4 * atan(1)
pi = float(pi)
surf = pow(r,2) * pi
peri = 2 * pi * r

print("le perimetre est : ",peri)
print('la surface est : ',surf)
