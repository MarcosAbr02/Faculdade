# Escreva um algoritmo que leia números inteiros via teclado. Somente valores positivos devem ser aceitos pelo programa.
# O programa deve recever números até que o usuário digite zero. Ao final da execução, informe a média dos valores digitados.
# Realize a implementação com as instruções break e continue e trabalhe com operações lógicas Truth e Falsey. Não esqueça de empregar também operadores especiais de atribuição
print("Calculadora de média aritmética, para sair digite 0")
cont = 0
soma = 0
x = 0
while True:
    x = int(input("Insira um valor: "))
    if(x<0):
        print("Insira um valor válido(positivo)")
        continue
    if(not x):
        break
    cont += 1
    soma += x
media = soma/cont
print("A média dos números digitados corresponde a: {:.2f}".format(media))