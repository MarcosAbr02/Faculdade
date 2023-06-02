# Escreva uma funão que receba como parâmetro uma lista e um dado.
# Verifique se o dado está presente na lista e retorne da função o seu índice, caso ele esteja presente, caso contrário, retorne -1
def busca(dado, lista):
    indice = 0
    for item in lista:
        if item == dado:
            return indice
        indice+=1
    return -1

a = int(input("Digite o número que deseja procurar na lista: "))
l = (1,435,324,8,23,56,34,90,435,3452,99,62,44)
x = busca(a,l)
print(x)