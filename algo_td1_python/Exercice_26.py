#cooding:utf-8

"""
Exercice 26 : 	Faire un programme qui saisit une suite de nombre et qui dit les si les nombres 
				saisis sont dans l’ordre croissant ou décroissant ou quelconque.

"""
print("---------------Ordre de saisie ------------------\n")

nbr = 0
while(nbr <= 0):
	nbr = int(input("Donner le nombre d'entier a saisir :: "))


ordre = 0
val_pre = 0
i = 1
while (i <= nbr) :
	print("valeur " , i , " ::")
	val = int(input("> "))
	if(i > 1):
		if(val_pre < val and ordre != 2 and ordre != 3) :
			ordre = 1
		elif( val_pre > val and ordre !=1  and ordre != 3) :
			ordre = 2	
		else :
			ordre = 3
	val_pre = val
	i = i + 1

if(ordre == 1) :
	print("la saisie des valeurs est dans l'ordre croissant ")
elif(ordre == 2) :
	print("la saisie des valeurs est dans l'ordre décroissant ")
else :
	print("la saisie des valeurs est quelconque")


