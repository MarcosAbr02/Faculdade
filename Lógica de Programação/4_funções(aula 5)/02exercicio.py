# Escreva uma rotina que crie um laço de repetição que faz uma contagem e imprime esta contagem na tela em uma linha só.
# Porém, como parâmetro, a função deve receber o valor inicial da contagem, o final, e o passo da iteração.
# Deixe os parâmetros inicial e de passo como opcionais.
def cont(b, a = 0, c = 1):
    for i in range(a,b,c):
        print(i, end=" ")
cont(30,20,2)
cont(10)