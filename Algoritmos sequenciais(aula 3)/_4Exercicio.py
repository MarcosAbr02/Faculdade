#Uma loja de departamentos está oferecendo diferentes formas de pagamento, conforme opções listadas a seguir.
#Faça um algoritmo que leia o valor total de uma compra e calcule o valor do pagamento final de acordo com a opção escolhida.
#Se a escolha for por pagamento parcelado, calcule também o valor de cada parcela. Ao final, apresente o valor total da compra e o valor das parcelas:
#Pagamento à vista – conceder desconto de 5%;
#Pagamento em 3x – o valor não sofre alterações;
#Pagamento em 5x – acréscimo de 2%;
#Pagamento em 10x – acréscimo 8%.

total = float(input("Insira o valor total da compra: "))
print("1 - Pagamento à vista\n2 - Pagamento em 3x\n3 - Pagamento em 5x\n4 - Pagamento em 10x")
opc = int(input("Escolha a opção de pagamento: "))
if (opc == 1):
    total = total-(total*5/100)
    print("Pagando a vista você tem 5% de desconto, o total da sua compra passar a ser {}".format(total))
elif (opc == 2):
    parcela = total/3
    print("Parcelando em 3x o valor da compra fica {} e a parcela fica no valor de {}".format(total, parcela))
elif (opc == 3):
    total = total+(total*2/100)
    parcela = total/5
    print("Parcelando em 5x o valor da compra fica {} e a parcela fica no valor de {}".format(total, parcela))
elif (opc == 4):
    total = total+(total*8/100)
    parcela = total/10
    print("Parcelando em 10x o valor da compra fica {} e a parcela fica no valor de {}".format(total, parcela))
else:
    print("Valor inválido!")