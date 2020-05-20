#coding:utf-8

"""

Exercice 10 : Ecrire un algorithme qui lit trois valeurs entières ( A, B et C) et qui 
            permet de les trier par échanges successifs Et enfin les afficher dans l'ordre . 

"""
print("---------------------- Trie par echange successive -------------------------------")

print("Saisir les 3 nombres entier")
a = int(input("nombre 1 >"))
b = int(input("nombre 2 >"))
c = int(input("nombre 3 >"))


if(a < b and b < c):
    svg = 0

if(a < c and c < b):
    svg =  b
    b =  c
    c =  svg

 
if(b < a and a < c):
    svg = b
    b = a
    a = svg

if(b < c and c < a):
    svg = a
    a = b
    b = c
    c = svg


if(c < a and a < b):
    svg = b
    b = a
    a = c
    c = svg

if(c < b and b < a):
    svg = a
    a = c
    c = svg	

print("affichage dans l'ordre croissant:")
print(a,"\t ", b , "\t",c);	