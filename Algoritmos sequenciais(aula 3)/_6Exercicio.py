# Escreva um programa que calcule o preço a pagar pelo fornecimento de energia elétrica.
# Pergunte a quantidade de kWh consumida e o tipo de instalação:
# R para residências, I para indústrias e C para comércios
#(Os valores estavam dispostos em uma tabela)
print("R - Residencial\nC - Comercial\nI - Indutrial")
tipo = input("Esolha uma opção do seu tipo de instalação (R, C ou I) ")
faixa = int(input("Qual foi o consumo em kWh?"))
if (tipo == "R"):
    if (faixa <= 500):
        total = faixa * 0.4
    else:
        total = faixa * 0.65
    print("O total a ser pago é de R$%f" % total)
elif (tipo == "C"):
    if(faixa<=1000):
        total = faixa * 0.55
    else:
        total = faixa * 0.6
    print("O total a ser pago é de R$%f" % total)
elif (tipo == "I"):
    if(faixa<=5000):
        total = faixa * 0.55
    else:
        total = faixa * 0.6
    print("O total a ser pago é de R$%f" % total)
else:
    print("Tipo inválido, encerrando o programa...")