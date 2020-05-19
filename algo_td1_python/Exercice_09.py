#coding:utf-8

"""

Exercice 9 : 
Ecrire un algorithme qui donne la durée de vol en heure minute connaissant l'heure de départ et l'heure d'arrivée. 
a. On considère que le départ et l'arrivé ont lieu le même jour 
b. On suppose que la durée de vol est inférieure à 24 heures mais peut avoir lieu le lendemain. 

"""

print("---------------------------Calcul durée de vol --------------------------------")

print("Saisir l'heure de depart et les minutes ::")

hd = int(input("heure::"))

while( hd < 0 or  hd >= 24 ):
    print("invalide : heure est toujour inferieur a 24 et n'est jamais negative")
    hd = int(input("heure::"))

md = int(input("munite::"))
while ( md < 0 and md >=60):
    print("invalide : munite est toujour inferieur a 60 et n'est jamais negative")
    md = int(input("heure::"))

print("Saisir l'heure d'arrivé et les minutes")
ha = int(input("heure::"))

while( ha < 0 and  ha >= 24 ):
    print("invalide : heure est toujour inferieur a 24 et n'est jamais negative")
    ha = int(input("heure::"))

ma = int(input("munite::"))
while ( ma < 0 and ma >=60) :
    print("invalide : munite est toujour inferieur a 60 et n'est jamais negative")
    ma = int(input("heure::"))


md = md + (hd*60)

ma = ma + (ha*60)

if (ma < md ):
    jour_en_minute = 24 * 60
    ma = ma + jour_en_minute

duree = int(ma - md)

d_h = int(duree / 60)
d_mn = duree % 60

print("la duree du vol en heure et minute est : ",d_h,"h:",d_mn,"mn")
