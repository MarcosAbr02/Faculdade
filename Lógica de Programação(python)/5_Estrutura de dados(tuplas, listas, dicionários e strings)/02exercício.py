# Escreva uma função que contenha dois parâmetros.
# Essa função recebe como parâmetro uma string com uma mensagem a ser impressa na tela e outro parâmetro como sendo uma quantidade arbitrária de números empacotados.
# Dentro da função, encontre o maior entre todos os números recebidos na tela, dentro da função, a mensagem e o maior valor.
def big(s1, *num):
    a= max(num)
    print(s1,a)

p = (1,3,4,6,7,45,323,4,2)
string = "O maior número é: "
big(string,*p)