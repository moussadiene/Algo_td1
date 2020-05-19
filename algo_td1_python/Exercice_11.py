#coding:utf-8

"""

Exercice 11 : Ecrire un algorithme calculatrice permettant la saisie du premier entier (a) de l'opération 
				( + ou – ou * ou / : sont des caractères) et du deuxième entier (b) et qui affiche le résultat.

"""

print("---------------------- Mini Calculatrice -------------------------------")

print("Saisir les 2 nombres entiers")

a = int(input("nombre 1 >"))

op = 'm'
while( op != '-' and  op != '+' and op != '*' and op != '/'):
    op = input("operateur >")

b = int(input("nombre 2 >"))

if(op == '-'):
    print(a," - ",b, " = ", a-b)

elif(op == '+'):
    print(a," + ",b, " = ", a+b)

elif(op == '*'):
    print(a," * ",b, " = ", a*b)
else:
    if(b==0):
        print("Le nombre doit different de 0")
    else:
        print(a," / ",b, " = ", a/b)



