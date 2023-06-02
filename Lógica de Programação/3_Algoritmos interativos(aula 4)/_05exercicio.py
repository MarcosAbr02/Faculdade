# Escreva um algoritmo que calcule e exiba a tabuada de um número escolhido e digitado pelo usuário.
# A tabuada dever calculada até um determinado número n, também fornecido pelo usuário. Implemente o laço usando for.
print("Tabuada adaptativa")
x = int(input("Escreva o número que será multiplicado: "))
y = int(input("Escreva quantas multiplicações deseja fazer: "))
for a in range(1,(y+1),1):
    res = x*a
    print("{}x{}={}".format(x,a,res))