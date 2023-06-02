print("Bem vindo ao Controle de Estoque da Bicicletaria do Marcos Abraão Maciel Brito")


def validaOpc(x):  # Serve para validar a escolha do usuário nos dois menus
    try:
        x = int(x)
        if x not in (1, 2, 3, 4):
            print("Digite um valor que corresponda a uma das opções!")
            return True
    except ValueError:
        print("Digite um valor numérico!")
        return True
    else:
        global escolha  # Para acessar essa variável fora da função é necessária declara-la como global
        escolha = x
        return False


def cadastrarPeca():  # Os dados das peças serão armazenados em dicionário, e após isso em uma lista com vários dicionários
    dic = {}
    contador = 1  # Caso seja o primeiro cadastro a peça adquire o código 001
    if pecas:  # Caso a peça de código "n" seja apagada esse trecho fará com que a nova peça cadastrada assuma esse lugar.
        for peca in pecas:
            for i, j in peca.items():
                if i == "codigo" and j == contador:
                    contador += 1
                else:
                    break
                break
    print("Código da peça:", f"{contador:03}")  # Exibe o código no formato 001
    dic["codigo"] = contador
    dic["nome"] = input("Digite o NOME da peça:")
    dic["fabricante"] = input("Digite o nome do FABRICANTE  da peça:").lower()
    dic["valor"] = input("Digite o VALOR(R$) da peça:")
    pecas.insert(contador - 1, dic)  # Adiciona os dados na lista na ordem correta (1,2,3,4,...,)


def consultarPeca():  # Função que exibe as peças cadastras conforme a escolha do usuário
    while True:
        print("1-Consultar Todas as peças")
        print("2-Consultar Peças por código")
        print("3-Consultar peças por Fabricante")
        print("4-Retornar")
        opc = input("")
        if validaOpc(opc):
            continue
        if escolha == 1:  # "Consultar todas as peças"
            print("-" * 20)
            print()
            for items in pecas:
                for i, j in items.items():
                    print("{}: {}".format(i, j)) # Impressão formatada pela varredura na lista
                print()
            print("-" * 20)
        elif escolha == 2:  # "Consultar peças por código"
            while True:  # Laço da escolha 2. Se encerrado, retorna ao menu principal
                try:
                    codigo = int(input("Digite um código:"))
                    if codigo > len(pecas):  # Tratativa de erro para peças não existentes
                        print("A peça solicitada não existe!")
                        print("Você cadastrou um total de {} peça(s), tente novamente.".format(len(pecas)))
                        continue

                    i = pecas[codigo - 1]  # Exibe a peça conforme o código pedido
                    for a, b in i.items():
                        print("{}: {}".format(a, b))
                    print()
                    break
                except ValueError:  # Trativa de erro para valores não numéricos
                    print("Digite um valor válido para que possamos localizar a peça em questão!")
                    continue
        elif escolha == 3:  # "Consultar peça por fabricante"
            fabri = input("Digite o FABRICANTE da Peça:").lower()
            print("-" * 20)
            print()
            for peca in pecas:  # Vai procurar na lista um valor que seja igual ao fabricante desejado
                for i, j in peca.items():
                    if str(j) == fabri:
                        for a, b in peca.items():
                            print("{}: {}".format(a, b))  # Imprime a peça que corresponder ao fabricante solicitado
                        print()
            print("-" * 20)

        elif escolha == 4:
            break


def removerPeca(): # Função que remove uma peça através do seu código
    while True:
        try:
            a = int(input("Digite o código da peça que deseja apagar: "))
            break
        except ValueError:
            print("Digite um valor válido!")
            continue

    indice = 0  # Deleta através do índice
    achou = False  # Variável de controle do loop que procura na lista o item desejado
    for peca in pecas:  # Optei por procurar o item na lista ao invés de "del pecas[a-1]" devido à propriedade que adicionei na line 19
        for i, j in peca.items():
            if i == "codigo" and j == a:
                achou = True
                break
        if achou:  # Se achou o índice não será iterado
            break
        indice += 1

    if achou:  # Só deleta se o código digitado estiver na lista. Se não fosse esse "if", sempre deletaria o elemento de índice 0.
        del pecas[indice]


# Programa Principal
pecas = []
while True:  # Laço do programa principal. Se encerrado, o programa termina
    print("O que deseja fazer?")
    print("1-Cadastrar Peças")
    print("2-Consultar Peças")
    print("3-Remover Peças")
    print("4-Sair")
    opc = input("")
    if validaOpc(opc):
        continue
    if escolha == 1:
        cadastrarPeca()
        continue
    elif escolha == 2:
        if not pecas:  # Tratativa de erro para o caso dessa área ser acessada antes de cadastrar uma peça
            print("Não há peças cadastradas!")
            continue
        consultarPeca()
        continue
    elif escolha == 3:
        if not pecas:  # Tratativa de erro para o caso dessa área ser acessada antes de cadastrar uma peça
            print("Não há peças cadastradas!")
            continue
        removerPeca()
        continue
    elif escolha == 4:
        break
print("Encerrando o programa, tenha um ótima dia!")
