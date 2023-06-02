# Solução do prof com mais funções, e com funções para guardar itens em arquivo de texto
def valida_int(pergunta,min,max):
    while True:
        try:
            x = int(input(pergunta))
            while ((x < min) or (x > max)):
                x = int(input(pergunta))
            return x
        except:
            print("Insita um valor válido")
            continue
def existeArquivo(nomeArquivo):
    try:
        x = open(nomeArquivo, "rt")
        x.close()
    except FileNotFoundError:
        return False
    else:
        return True
def criaArquivo(nomeArquivo):
    try:
        a = open(nomeArquivo, "wt+")
        a.close()
    except:
        print("Não foi possível criar o arquivo games.txt")
    else:
        print("Arquivo {} foi criado com sucesso!\n".format(nomeArquivo))
def cadastrarJogo(nomeArquivo, jogo, video):
    try:
        x = open(nomeArquivo, 'at')
    except:
        print("Erro ao abrir o arquivo")
    else:
        x.write("{} - {}\n".format(jogo, video))
    finally:
        x.close()
def listarArquivo(nomeArquivo):
    try:
        x = open(nomeArquivo, "rt")
    except:
        print("Erro ao ler o arquivo")
    else:
        print(x.read())
    finally:
        x.close()

arquivo = "games.txt"
if existeArquivo(arquivo):
    print("Arquivo localizado no computador!")
else:
    print("Arquivo inexistente")
    criaArquivo(arquivo)
while True:
    print("MENU")
    print("1 - Cadastrar novo item")
    print("2 - Listar cadastros")
    print("3 - Sair")

    op = valida_int("Escolha a opção desejada:", 1, 3)
    if op == 1:
        print("Opção de cadastrar novo item selecionado...\n")
        nomeJogo = input("Nome do jogo: ")
        nomeVideogame = input("Nome do videogame: ")
        cadastrarJogo(arquivo, nomeJogo, nomeVideogame)

    elif op == 2:
        print("Opção de listar itens...")
        listarArquivo(arquivo)
    else:
        print("Encerrando o programa...")
        break