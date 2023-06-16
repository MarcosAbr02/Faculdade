# Suponha que você é um colecionador de jogos de videogame.
# Escreva um algoritmo que permita cadastrar esses jogos informando o nome e a qual videogame ele pertence
# Para isso, crie um menu de opções contendo: cadastrar novo item, listar tudo que foi cadastrado e sair
lista = ""
jogos = 0

def validacao(a):
    while True:
        try:
            x = int(input(a))
            return x
        except ValueError:
            print("Por favor, escolha uma opção válida!")
            print("1-Cadastrar novo item\n2-Listar items\n3-Sair")
            continue
        except:
            print("Parabéns por ter lido essa mensagem, nem eu sei como você chegou aqui!")
            print("1-Cadastrar novo item\n2-Listar items\n3-Sair")
            continue


while True:
    print("1-Cadastrar novo item\n2-Listar items\n3-Sair")
    valor = validacao("Selecione uma opção: ")
    if valor == 1:
        jogo = input("Digite o nome do jogo: ")
        console = input("Digite o nome do videogame: ")
        c = (jogo + "-" + console + "\n")
        print(c)
        lista += c
        jogos += 1
        continue

    if valor == 2:
        print(lista)
        continue

    if valor == 3:
        print("Encerrando o programa....")
        break

    else:
        print("1, 2 ou 3....")
        continue

print("O total de jogos adicionados foi {} e esses foram:\n{}".format(jogos, lista))