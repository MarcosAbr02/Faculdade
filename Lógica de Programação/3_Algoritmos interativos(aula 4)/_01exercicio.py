#Escreva um algoritmo que calcule a média dos números pares de 1 até 100 (1 e 100 inclusos).
#Implemente usando o laço for
a = int(input("Insira o primeiro número do intervalo: "))
b = int(input("Insira o segundo número do intervalo: "))
soma = 0
numeros = 0
for i in range(a,(b+1),1):
    if (i % 2 ==0):
        soma += i
        numeros += 1
media = soma/numeros
print("A média dos números pares de {} a {} é {:.0f}".format(a,b,media))
