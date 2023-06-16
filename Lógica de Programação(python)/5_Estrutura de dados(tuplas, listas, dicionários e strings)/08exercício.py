# Dada uma lista contendo as notas de alunos em uma disciplina, escreva uma expressão para:
notas = [9,7,7,10,3,9,6,6,2]
# a)Encontrar quantos alunos tiraram nota 7
# b)Alterar a última nora para 4
# c) Encontrar a maior nota
# d) Ordenar a lista de notas
# e) A média das notas
# letra a
n7 = notas.count(7)
print("{} alunos tiraram nota 7".format(n7))

# letra b
del notas[-1:]
notas.append(4)
print(notas)

# letra c
maior = max(notas)
print("A maior nota entre os alunos foi: {}".format(maior))

# letra d
ordenada = []
for i in range(10,-1,-1):
    for item in notas:
        if item == i:
            ordenada.append(item)
print(ordenada)
# letra e
soma = sum(notas)
qtd = len(notas)
media = soma/qtd
print("A média de notas é {:.2f}".format(media))