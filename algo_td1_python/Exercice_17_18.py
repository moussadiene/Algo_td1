#coding:utf-8

"""
Exercice 17: 
 Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
 soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux. 

Exercice 18: 
Faire un programme qui calcule et affiche le PPCM de deux entiers saisis au clavier.

"""

def pgcd(val1,val2) :
    while(val1 != val2) :
        if(val1 < val2 ) :
            val2 = val2 - val1 
        else:
            val1 = val1 - val2 
    return val1


print("-----------------------Calcul PGCD ET PPCM ------------------------------\n")

print("1 - Calculer le PGCD de 2 entiers naturels ::")
print("2 - Calculer le PPCM de 2 entiers naturels ::")

choix=0
while(choix!=1 and choix!=2):
    choix = int(input("choix :: "))

val1 = 0
while (val1 <= 0) :
    val1 = int(input("Valeur 1 ::"))

val2 = 0
while (val2 <= 0) :
    val2 = int(input("Valeur 2 ::"))

if(choix == 1):
    print("Le PGCD (",val1,",",val2,") = ",pgcd(val1 , val2))
else :
    print("Le PPCM (",val1,",",val2,") = ",(val1  * val2) / pgcd(val1 , val2))
