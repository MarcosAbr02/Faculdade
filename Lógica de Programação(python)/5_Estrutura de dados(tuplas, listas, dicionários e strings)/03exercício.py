# Escreva um algoritmo que crie uma lista vazia e vá adicionando valores referentes às notas de um aluno nesta lista.
# Quando o usuário desejar parar de digitar notas, calcule a média das notas digitas
# Além disso, faça um tratamento para a exceção de divisão por zero (ZeroDivisionError). Essa exceção poderá ocorrer caso o usuário não digite nenhuma nota válida.
notas = []
try:
    notas = []
    x = input("Digite uma nota:")
    while x:
        x = float(x)
        notas.append(x)
        x = input("Digite uma nota:")
    soma = 0
    for i in notas:
        soma += i
    media = soma/len(notas)
    print(notas)
    print("Média das notas: {}".format(media))
except ZeroDivisionError:
    print("Você não digitou nenhum valor válido. Encerrando o programa....")