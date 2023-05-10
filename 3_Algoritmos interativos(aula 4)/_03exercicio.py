# Escreva um algoritmo que obtenha do usuário um valor inicial e um valor final.
# Para este intervalo especificado pelo usuário, calcule e mostre na tela
# a)A quantidade de inteiros e positivos
# b)A quantidade de números pares
# c)A quantidade de números ímpares
# d) A respectiva média de cada um dos itens anteriores
i = int(input("O número inicial do intervalo: "))
f = int(input("O número final do intervalo: "))
positivos = 0
somaPos = 0
pares = 0
somaPar = 0
impares = 0
somaImp = 0
for a in range(i,(f+1),1):
    if(a>0):
        positivos += 1
        somaPos += a
    if(a % 2 == 0):
        pares += 1
        somaPar += a
    else:
        impares += 1
        somaImp += a
mediaPos = somaPos/positivos
mediaPar = somaPar/pares
mediaImp = somaImp/impares
print("A quantidade de números inteiros e positivos é {} tendo como média {}" .format(positivos,mediaPos))
print("A quantidade de números pares é {} tendo como média {}".format(pares, mediaPar))
print("A quantidade de números ímpares é {} tendo como média {}".format(impares,mediaImp))