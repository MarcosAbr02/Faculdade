#Escreva um algoritmo que lê um nome e uma idade
#Caso o nome digitado seja Soneca, escreva isso na tela
#Caso o usuário digite qualquer outro nome, verifique sua idade. Se for menor que 18 anos,
#iforme que é de menor. Se for maior que 100 anos, iforme que esta pessoa possivelmente não existe

nome = input("Digte seu nome")
idade = int(input("Digite sua idade"))
if (nome == "Soneca"):
    print("Soneca")
elif (idade < 18):
    print("Você não é o Soneca! E é menor de idade")
elif (idade > 100):
    print("Você provavelmente não existe...")
else:
    print("Programa encerrado, tenho um ótimo dia!")
