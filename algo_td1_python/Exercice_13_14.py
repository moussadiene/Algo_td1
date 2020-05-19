#coding:utf-8
"""
Exercice 13 : 
	Faire un programme qui saisit une date (jour, mois et année) at qui indique si la date est valide
     
        diviser les mois en deux parties:
            1. du 1 au 7ieme mois, les mois impaire compte 31 jours au max
                et les mois paires comptent 30 jours chauffe fevrier qui 29 jours max
            
			2. et d 8 au 12ieme mois, les mois impaire compte 30 jours max
                et les mois paires comptent 31 jours au max	
""" 
""" fonction """
def date_valide(jj,mm,an):
    trouve = False
    if(jj > 31 or jj < 1 or mm > 12 or mm <1 or an < 1000 or an > 2020) :

        print(jj,"/",mm,"/",an," est invalide")

    elif (mm <= 7) :
        if(mm % 2 == 0 and jj == 31):
            print("invalide, ce mois ne compte pas 31 jours")
            
                
        elif(mm == 2 and jj == 29 and (an % 4 != 0 or an % 100 == 0)):
            print("invalide, le mois de fevrier de cette annee compte 28 jours")

        else:
            print(jj,"/",mm,"/",an," est validee")
            trouve = True
    else:
        if(mm % 2 == 1 and jj == 31):
            print("invalide, ce mois compte 30 jours")
        else:
            print(jj,"/",mm,"/",an," est valide")
            trouve = True
    return trouve


def bissextile(jj,mm,an):
    print("\n-----------------------Année Bissextile -----------------------\n")
    if(date_valide(jj,mm,an)):
        if (an % 4 == 0 and an % 100 != 0) :
            print("l'annee :" , an ," est bissextile")
        else:
            print("l'année :" , an , "n'est pas bissextile")



""" ccorp du programme"""

print("----------------------- Test date valide ------------------------------\n")

print("1 - Testez de validation date")
print("2 - Année bissextile")

choix=0
while(choix!=1 and choix!=2):
    choix = int(input("choix :: "))

print("Donner la date a vérifier ::") 
jj = int(input("Jour :"))
mm = int(input("Mois :"))
an = int(input("Année :"))	

if(choix == 1):
    date_valide(jj,mm,an)
else:
    bissextile(jj,mm,an)
	




