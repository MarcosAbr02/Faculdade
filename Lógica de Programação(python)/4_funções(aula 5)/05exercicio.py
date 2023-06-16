# Escreva uma função que calcule o fatorial de um número recebido como parâmetro e retorne o seu resultado.
# Faça uma validação por meio de outra função, permitindo que somente valores positivos sejam aceitos
def validacao(x):
    if x<0:
        return True
    else:
        return False
def fatorial(x):
    resultado = x
    if x == 0:
        return 1
    else:
        for i in range (x-1, 1, -1):
            resultado *= i
        return resultado


x = int(input("Digite um número: "))
while validacao(x):
    x = int(input("Digite um número: "))
print("{}! = {}".format(x, fatorial(x)))