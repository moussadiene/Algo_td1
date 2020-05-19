#coding:utf-8

"""

	
Exercice 8 : 
Ecrire un algorithme permettant de résoudre une équation du second degré. 
Ax2 + bx + c = 0

"""

print("---------------------Resolution d'equztion au second degré------------------")


print("saisir a de x2")
a = float(input("> "))
            
while(a == 0) : 
    System.out.println("a doit etre different de 0")
    a = float(input("> "))

print("saisir b de x")
b = float(input("> "))

print("saisir c ")
c = float(input("> "))	


delta = float(pow(b, 2) - (4 * a * c))

if (delta > 0 ) :

    x1 = (- b - sqrt(delta)) / 2 * a

    x2 = (- b + sqrt(delta)) / 2 * a

    print(" l ‘ equation admet 2 solutions  : x1 = " ,  x1 ," x2 = ", x2 )

else :
    if (delta == 0 ) :

        x1 = - b / 2 * a

        print(" l ‘ equation admet 1 solution  : x0 = " ,  x1 )

    else :
        print(" delta est inferieur a 0, la solution l’ensemble vide ")
    
