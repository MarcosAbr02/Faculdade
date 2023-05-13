# Faça uma função que recebe dois valores inteiros e positivos como parâmetro.
# Calcule a soma dos n valores inteiros existentes entre eles, inclusive estes números.
def somaGeral(x,y):
    total = 0
    for i in range(x,y+1,1):
        total+=i
    return total
x = int(input("Digite o primeiro número: "))
y = int(input("Digite o segundo número: "))
somaGeral(x, y)
print("A soma dos números presentes no intervalo entre {} e {} é igual a {}".format(x,y,somaGeral(x,y)))