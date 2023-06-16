# Escreva um algoritmo que leia dois valores numéricos e que pergunte ao usuário qual operação ele deseja utilizar:
# Adição, subtração, multiplicação, divisão e sair.
# Exiba na tela o resultado da operação desejada
print("Bem vindo a minha calculadora!")
while True:
    op = input("Qual operação deseja realizar?\nAdição (+)\nSubtração (-)\nMultiplicação (*)\nDivisão (/)\n\"sair\"\n")
    if not(op == "+" or op == "-" or op =="*" or op == "/" or op == "sair"):
        print("Selecione uma opção válida!")
        continue
    if(op == "sair"):
        break
    a = int(input("Insira o primeiro número: "))
    b = int(input("Insira o segundo número: "))
    if(op == "+"):
        res = a+b
    elif(op == "-"):
        res = a-b
    elif(op == "*"):
        res = a*b
    else:
        res = a/b
    print("O resultado da operação é {}".format(res))
print("Encerrando o programa...")