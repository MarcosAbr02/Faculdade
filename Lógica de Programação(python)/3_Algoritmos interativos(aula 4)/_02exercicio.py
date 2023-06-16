# Escreva um algoritmo que leia dois valores e imprima na tela o resultado da multilpicação de ambos.
# Entretanto, para calcular a multiplicação, utilize somente operações de soma e subtração
x = int(input("Insira o primeiro valor: "))
y = int(input("Insira o segundo valor: "))
a = 1
c = x
while(a<y):
    x += c
    a += 1
print("A multiplicação {}X{} resulta em {}".format(c,y,x))