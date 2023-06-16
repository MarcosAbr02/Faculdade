# Escreva uma rotina que recebe três valroes como parâmetro e coloque-os em ordem crescente. Imprima na tela os os três valores.
def crescente(a,b,c):
    menor = min(a, b, c)
    maior = max(a,b, c)
    for i in range(menor, maior+1, 1):
        if i == a or i == b or i == c:
            print(i, end=" ")

a = int(input("Insira o primeiro número: "))
b = int(input("Insira o segundo número: "))
c = int(input("Insira o terceiro número: "))
crescente(a,b,c)