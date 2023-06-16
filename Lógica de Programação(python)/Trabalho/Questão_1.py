print("Bem vindo a loja do Marcos Abraão Maciel Brito")
valor = float(input("Entre com o valor do produto: ")) # float pois se trata de um valor em dinheiro
quantidade = int(input("Entre com a quantidade do produto: ")) # int pois se trata de uma quantidade fixa de produtos
print("O valor sem desconto é R$%.2f" % (valor * quantidade)) # Essa impressão independe das condicionais por isso pode vir acima
# A seguir, temos uma sequência de condicionais que atribuem valores às variáveis para fornecer uma resposta adequada às escolhas anteriores.
if (quantidade < 10):
    valorDesc = valor * quantidade
    desconto = 0
elif (quantidade >= 10 and quantidade < 100):
    valorDesc = (valor * quantidade) - (valor * quantidade) * 0.05
    desconto = 5
elif (quantidade >=100 and quantidade < 1000):
    valorDesc = (valor * quantidade) - (valor * quantidade) * 0.1
    desconto = 10
    #Para valores maiores ou iguais a 1000 utilizarei else pois seria redundante utilizar mais um elif
else:
    valorDesc = (valor * quantidade) - (valor * quantidade) * 0.15
    desconto = 15
print("O valor com desconto é: R$%.2f (desconto %d%%)" % (valorDesc, desconto)) #Essa impressão depende das condicionais e suas variáveis recebem valores durante a execução do código