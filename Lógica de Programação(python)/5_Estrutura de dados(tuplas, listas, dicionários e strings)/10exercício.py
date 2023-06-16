# Crie um jogo de pedra, papel ou tesoura.
# Você deverá jogar contra o computador. Você irá sempre escolher uma das opções: 1-pedra, 2-papel,3-tesoura.
# O computador irá sempre sortear um número de 1 até 3 para jogar
# Encerre o programa ao digitar 0
import random
empate = 0
vitoria = 0
derrota = 0
dic = {(1, 2): "derrota", (2, 1): "vitoria", (1, 3): "vitoria", (3, 1): "derrota", (2, 3): "derrota", (3, 2): "vitoria"}
def Atribuicao(x):
    if x == 1:
        return "pedra"
    elif x == 2:
        return "papel"
    else:
        return "tesoura"


while True:
    try:
        print("Jokenpô!")
        (print("Escholha uma opção!\n"
               "1 - Pedra\n"
               "2- Papel\n"
               "3 - Tesoura\n"
               "0 - Sair\n"))
        opc = int(input(""))
        if opc == 0:
            break
        elif opc not in (1,2,3):
            print("insira um valor válido!")
            continue

        computador = random.randint(1, 3)
        if computador == opc:
            print("Computador também escolheu {}, empate!".format(Atribuicao(opc)))
            empate += 1
        else:
            valores = [opc,computador]
            resultado = dic[tuple(valores)]
            print("Você escolheu {} e o computador escolheu {}, {}!".format(opc,computador,resultado))
            if resultado == "vitoria":
                vitoria += 1
            else:
                derrota += 1
        continue
    except ValueError:
        print("Valor inválido!")
        continue
print("O resultado foi {} empates, {} vitórias para o computador e {} vitórias para você!".format(empate,derrota,vitoria))
if vitoria>derrota:
    print("Parabéns, você venceu!")
elif derrota>vitoria:
    print("Mais sorte na próxima!")
else:
    print("Parece que ficou tudo empatado!")