# Escreva um algoritmo que imprima na tela as horas no formato H:M:S dentro de um intervalo definido pelo usuário.
# O usuário deverá delimitar o intervalo de horas que deseja imprimir (por exemplo, das 7h até as 14h).
inicial = int(input("Em qual hora deseja iniciar? "))
final = int(input("Em qual hora deseja terminar? "))
while(inicial<=0 or final<=0 or inicial>final or inicial>23 or final>23):
    inicial = int(input("Em qual hora deseja iniciar? "))
    final = int(input("Em qual hora deseja terminar? "))
for h in range(inicial,final+1,1):
    for m in range(0,60,1):
        for s in range(0,60,1):
            print(h,":",m,":",s)