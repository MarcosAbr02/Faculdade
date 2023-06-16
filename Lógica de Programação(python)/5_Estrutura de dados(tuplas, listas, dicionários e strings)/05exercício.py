# Escreva um algoritmo que leia o nome, altura e peso de pessoas e armazene as informações em uma lista.
# O total de cadastros
# A pessoa com o maior IMC
# A pessoa com menor IMC
imc = lambda peso,altura: peso/(altura**2)
lista = []
while True:
    nome = input("Qual o nome? ")
    if not nome:
        break
    else:
        p =float(input("Digite o peso em kg: "))
        a = float(input("Digite a altura em m: "))
        imc_resultado = imc(p, a)
        lista.append([nome,p,a,imc_resultado])
print(lista)
print("O total de pessoas cadastradas foi: {}".format(len(lista)))
maior = 0
menor = 99
for i in range(0,len(lista)):
    if lista[i][3] > maior:
        maior = lista[i][3]
    if lista[i][3] < menor:
        menor = lista[i][3]
print("Maior IMC:", maior)
print("Menor IMC:", menor)