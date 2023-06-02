#Escreva um algoritmo que leia dois valores numéricos e que pergunte qual operação ele deseja realizar:
#adição (+), subtração (-), multiplicação (*), ou divisão (/). Exiba na tela o resultado da operação desejada.

x = float(input("Digite o primeiro número: "))
y = float(input("Digite o segundo número: "))
print("Adição (+) \nSubtração (-) \nMultiplicação (*) \nDivisão (/)")
operacao = input("Escolha uma operação: ")
if (operacao == "+" or operacao == "Adição"):
    res = x+y
    print(res)
elif (operacao == "-" or operacao == "Subtração"):
    res = x-y
    print(res)
elif (operacao == "*" or operacao == "Multiplicação"):
    res = x*y
    print(res)
elif (operacao == "/" or operacao == "Divisão"):
    res = x/y
    print(res)
else:
    print("Operação inválida!")