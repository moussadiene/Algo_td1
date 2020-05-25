#coding:utf-8

"""
Exercice 22 : 
		On se propose de saisir N entiers différents entre 1 et 100 (N étant un entier naturel 
		compris entre 10 et 50) puis afficher la plus longue séquence croissante tout en précisant la 
		position du premier nombre de cette séquence.
			Exemple : Pour N=15
 								1  2  3.  1  2  3  4  5  6  7  8 . 2  3  4  5 
		Le programme affiche :
		La plus longue séquence est 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 *   
		qui débute à la position 4  et elle est de longueur 7
"""



print("------------------- Sequence croissante --------------------------\n")

N = 0        
while(N <= 0 or N >50):
      N =int(input("Donner le nombre de cellule du tableau ::"))

tab = []
for i in range(N): 
	val = 0
	while(val <= 0 or val >100):
		val = int(input("Cellule "+str(i)+" ::"))
	tab.append(val)

posD = 0
taille = 1
maxlong = 1
i = 0
while (i < N-1):
	if(tab[i] < tab[i+1]):
		taille += 1
		if(maxlong < taille ) :
			maxlong = taille
			posD = i - (taille+2
	else:
		taille = 1	
	i = i + 1

taille = maxlong + posD

print("La plus longue séquence est :: \n")
i = posD
while(i < taille):
	print(tab[i] , " * ",end="")
	i += 1

print("\nElle debute a la position ",posD, " et elle a une longueur de ",maxlong," cellule .") 

