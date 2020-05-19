#coding:utf-8

"""

exo 3
    Version 1 :
    Faire un programme qui saisit 3 résistances : R1, R2 et R3.
    Calculer et afficher la résistance en série : R1 + R2 +R3
    Calculer et afficher la résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)		
"""

print("----------------------------- Version 1 ----------------------------------")

print("Saisir les 3 résistances :: ")
r1 = input("R1: ")
r1 = float(r1)

r2 = input("R2 : ")
r2 = float(r2)

r3 = input("R3 : ")
r3 = float(r3)

serie = r1 + r2 + r3
serie = float(serie)
para = (r1 * r2 * r3) / (r1*r2 + r2*r3 + r1*r3) 
para = float(para)

print(" La resistance en serie est : ",serie)
print(" La resistance en paralelle est : ",para)

print("----------------------------- Version 2 ----------------------------------")

print("1 - Frequence en serie :")
print("2 - Frequence en paralelle :")
print("Faite votre choix !!!")
choix = input("> ")
choix = int(choix)

while choix !=1 and choix!=2:
    print("Mauvais choix (1 ou 2) !!!") 
    choix = input("> ")   
    choix = int(choix)

if choix == 1:
    f_serie = (r1 + r2 + r3) / serie
    print(" La frequence en serie est : ",f_serie)
    
else:
    f_serie = (r1 + r2 + r3) / serie
    print(" La frequence en serie est : ",f_serie)
    













