# Escreva um algoritmo que repetidamente pegunte ao usuário qual sua idade e seu sexo (M ou F).
# Para cada resposta o programa deve responder imprimir a mensagem: "Boa noite, Senhor. Sua idade é <IDADE>" no caso gênero masculino e "Boa noite Senhora. Sua idade é <IDADE>" no caso de genêro feminino.
# O programa deve encerrar quando o usuário digitar uma idade negativa.
print("Para fechar o programa digite uma idade negativa")
while True:
    idade = int(input("Qual a sua idade?"))
    if (idade<0):
        break
    sexo  = input("Qual o seu sexo?\nM or F ")
    if (sexo == "M"):
        print("Boa noite Senhor. Sua idade é {}".format(idade))
    elif (sexo == "F"):
        print("Boa noite Senhora. Sua idade é {}".format(idade))
    else:
        print("Favorr inserir um caractere válido")
print("Encerrando programa....")