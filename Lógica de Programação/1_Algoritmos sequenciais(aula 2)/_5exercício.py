#Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário, assim como quantidade de dias pelos quais o carro foi alugado.
#Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por km rodado
km = float(input("Quantos km foram percorridos durante o aluguel do carro?"))
dias = int(input("Quantos dias se passaram durante o alguel do carro?"))
km *= 0.15
dias *= 60
preco = dias+km
print("O valor total a ser pago é de {}R$".format(preco))