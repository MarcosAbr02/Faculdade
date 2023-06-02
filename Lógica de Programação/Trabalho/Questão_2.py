print("Bem vindo a lanchonete de Marcos Abraão Maciel Brito\nSelecione uma opção através de seu código")
print("               :D Cardápio :D\n{ Código }        Descrição       { Valor }\n{   100  }     Cachorro Quente    {  9,00 }\n{   101  } Cachorro Quente dulplo { 11,00 }\n{   102  }          X-egg         { 12,00 }\n{   103  }        X-Salada        { 13,00 }\n{   104  }         X-Bacon        { 14,00 }\n{   105  }          X-Tudo        { 17,00 }\n{   200  }  Refrigerante de lata  {  5,00 }\n{   201  }       Chá gelado       {  4,00 }\n")
subtotal = 0 # Variável para "acumular” os valores
a = True # Variável para que seja possível encerrar dois laços de uma vez (tratativa de erro nas duas opções)
while a:
    # Sequência de if para que seja selecionado uma opção. Caso a opção não esteja presente, apenas retornará a este ponto através do while
    opc = int(input("Digite uma opção: "))
    if opc == 100:
        subtotal += 9.00
    elif opc == 101:
        subtotal += 11.00
    elif opc == 102:
        subtotal += 12.00
    elif opc == 103:
        subtotal += 13.00
    elif opc == 104:
        subtotal += 14.00
    elif opc == 105:
        subtotal += 17.00
    elif opc == 200:
        subtotal += 5.00
    elif opc == 201:
        subtotal += 4.00
    else:
        print("Opção inválida")
        continue # Retorna ao começo da seção
    while True:
        ask = int(input("Deseja pedir por mais alguma coisa?\n1 - Sim\n2 - Não\n"))
        if ask == 1:
            break # Encerra essa seção em loop sem encerrar o primeiro laço
        elif ask == 2:
            a = False # Encerra o primeiro laço/loop
            break # Encerra essa seção em loop
        else:
            print("Opção inválida")
            continue # Torna a pedir uma opção nessa seção também
print("O valor total do seu pedido é de R${:.2f}\nTenha um ótimo dia!".format(subtotal)) # O valor total é calculado com o acumulador "subtotal"
