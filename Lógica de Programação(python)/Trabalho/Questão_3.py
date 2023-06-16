print("Bem vindo a companhia de Marcos Abraão Maciel Brito")

# Definições que serão usadas ao longo do programa
def validacao(x):  # Função que válida se os dados são numéricos para cada valor separadamente
    while True:
        try:
            x = float(input(x))  # Float permite ao usuário digitar dados mais precisos como 0.5cm ou 0.5kg
        except ValueError:
            print("Você inseriu um valor não numérico, tente novamente!")
            continue
        except:
            print("Parabéns por encontrar esse print de erro! Sinceramente, nem eu sei como chegou aqui.")
            continue
        else:
            return x
def dimensoesObjeto(altura, comprimento, largura):  # Função que válida as dimensões do objeto, se eles são numéricos e se estão de acordo com a tabela
    while True:
        x = validacao(altura)
        y = validacao(comprimento)
        z = validacao(largura)
        total = x * y * z
        if total > 100000:
            print("Não aceitamos objetos com dimensões tão grandes!")
            print("Entre com os valores desejados novamente")
            continue  # Pedirá para o usuário inserir novamente os dados e as funções dimensoesObjeto e validacao serão novamente atribuídas aos valores digitados
        elif total < 1000:
            return 10
        elif 1000 <= total < 10000:
            return 20
        elif 10000 <= total < 30000:
            return 30
        else:  # Os valores que sobram são maiores ou iguais a 30000 e menores ou iguais a 100000 (30000<=x<=100000)
            return 50
def pesoObjeto(x):  # Checa se o valor é válido e se está de acordo com a tabela de peso
    while True:
        y = validacao(x)
        if y >= 30:
            print("Não aceitamos objetos tão pesados!\nInsira um valor novamente!")
            continue
        elif y < 0.1:
            return 1
        elif 0.1 <= y < 1:
            return 1.5
        elif 1 <= y < 10:
            return 2
        else:  # Os valores que restam são maiores ou iguais a 10 e menores que 30 (10<=x<30)
            return 3
def rotaObjeto(y):  # Checa a rota digitada se encaixa em uma das existentes
    while True:
        x = input(y)
        if x == "FP" or x == "PF":
            return 1
        elif x == "FC" or x == "CF":
            return 1.2
        elif x == "CP" or x == "PC":
            return 1.5
        else:  # Trativa de erro simples para qualquer outro valor
            print("Insira uma rota válida")
            continue

# Parte 1 do programa principal
a = "Digite a altura do objeto (em cm): "
c = "Digite o comprimento do objeto (em cm): "
l= "Digite a largura do objeto (em cm): "
dimensoes = dimensoesObjeto(a, c, l)
valor = dimensoes  # Se tudo estiver certo, o valor retornado da função dimensoesObjeto(a, c, l) será atribuído a variável "valor"

# Parte 2 do programa principal
p = "Digite o peso do objeto (em kg): "
peso = pesoObjeto(p)
valor *= peso  # Se tudo estiver correto, a variável "valor" será multiplicada pelo valor retornado da função pesoObjeto(p)

# Parte 3 do programa principal
print("Digite a rota:")
print("FP - De Franco da Rocha para Perus")
print("PF - De Perus para Franco da Rocha")
print("FC - De Franco da Rocha para Cajamar")
print("CF - De Cajamar para Franco da Rocha")
print("CP - De Cajamar para Perus")
print("PC - De perus para Cajamar")

r = ""
rota = rotaObjeto(r)
valor *= rota  # Se uma rota válida for selecionada, então a função rotaObjeto retorna o multiplicador correspondente
print("O total a ser pago é {}R$\nO total foi calculado da seguinte maneira (consulte nossa tabela para mais informações!):\n(dimensões: {} * peso: {} * rota: {})".format(valor, dimensoes, peso, rota))
