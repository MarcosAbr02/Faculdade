#Desenvolva um algoritmo que solicite ao usuário o preço de um produto e um percentual de desconto a ser aplicado a ele.
#Calcule e exiba o valor do desconto e o preço final do produto.
preco = float(input("Insira o preço do produto:"))
percentual = float(input("Insira o valor percentual de desconto do produto:"))
desconto = preco/100*percentual
preco -= desconto
print("O desconto é {} e o preço final do produto é {}".format(desconto, preco))