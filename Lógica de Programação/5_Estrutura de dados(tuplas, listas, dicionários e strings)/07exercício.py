# Crie um programa para controle de estoque de produtos de um estabelecimento que vende produtos de hortifruti
# Para o estoque, armazene tudo dentro de um dicionário contendo listas.
# A chave deverá ser o nome de cada produto e cada lista teremos o preço e a quantidade disponível no estoque.
# O estoque pode estar pré-cadastrado no sistema com quantos items desejar.
# Simule uma compra. Pela ao usuário para digitar o nome do produto e a quantidade que deseja até que ele decida encerrar a compra.
# Ao final, apresente tudo na tela em um formato organizado, mostrando o total a ser pago por produto e o total do pedido
# Ainda, dê baixa no sistema descontando o que foi comprado do total. Imprima na tela o estoque restante.
produtos= {"cenoura":[90,0.80],"donut":[15,1.00],"batata":[20,2.00],"chuchu":[15,1.85]}
print("Bem-vindo ao hortifruti! Dê uma olhada em nossos produtos!")
for i,j in produtos.items():
    print(i, end=": ")
    print("Quantidade: {}, preço: {}".format(j[0],j[1]))
total = 0
pedido=[]
while True:
    a = input("Que item deseja comprar?")
    b = int(input("Qual a quantidade?"))
    pedido.append([a,b])
    res = input("Para finalizar, digite \"s\"")
    if res == "s":
        break
total = 0
for item in pedido:
    produto = item[0]
    quantidade = item[1]
    preco = produtos[produto][1]
    valor=preco*quantidade
    print("{}: {} x {} = {}".format(produto, quantidade, preco, valor))
    produtos[produto][0] -= quantidade
    total += valor
print("Custo total: {}\n".format(total))
print("Estoque: ")
for i,j in produtos.items():
    print(i, end=": ")
    print("Quantidade: {}, Preço: {}".format(j[0],j[1]))
