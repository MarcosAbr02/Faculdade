import random as r
def valida_int(pergunta, min, max):
    while True:
        try:
            x = int(input(pergunta))
            while ((x < min)or (x > max)):
                x = int(input(pergunta))
            return x
        except:
            continue
def vencedor(jogador1,jogador2):
    global empate, derrota, vitoria
    if jogador1 == 1: # Pedra
        if jogador2 == 1:
            empate += 1
        elif jogador2 == 2: # Papel
            derrota += 1
        elif jogador2 == 3: # Tesoura
            vitoria +=1
    elif jogador1 == 2:
        if jogador2 == 1:
            vitoria +=1
        elif jogador2 == 2:
            empate +=1
        elif jogador2 == 3:
            derrota +=1
    elif jogador1 == 3:
        if jogador2 == 1:
            derrota +=1
        elif jogador2 == 2:
            vitoria += 1
        elif jogador2 == 3:
            derrota += 1
    resultados = [vitoria, derrota, empate]
    return resultados
# Programa principal
derrota = 0
vitoria = 0
empate = 0
print("Jokenpô")
print("1 - Pedra")
print("2 - Papel")
print("3 - Tesoura")

resultados = []
jogadas = []
v1 = 0
v2 = 0
empate = 0
while True:
    j1 = valida_int("Esolha sua jogada",0,3)
    if not j1:
        break
    j2 = r.randint(1,3)
    jogadas.append([j1,j2])
    resultados = vencedor(j1, j2)

    for jogada in jogadas:
        for dado in jogada:
            print(dado, end=" ")
        print()

print("Número de vitórias: {}".format(resultados[0]))
print("Número de derrotas: {}".format(resultados[1]))
print("Número de empates {}".format(resultados[2]))