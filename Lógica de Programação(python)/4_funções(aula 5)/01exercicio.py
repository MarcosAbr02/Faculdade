# Escreva uma rotina que crie uma borda ao redor de uma palavra para destacá-la como sendo um título.
# A rotina deve receber como parâmetro a palavra a ser destacada.
# O tamanho da caixa de texto deverá ser adaptável de acordo com o tamanho da palavra.
def borda(s1):
    tam = len(s1)
    while not tam:
        s1 = input("Insira uma palavra: ")
        tam = len(s1)
    print("+","-"*tam,"+")
    print("|",s1,"|")
    print("+","-"*tam,"+")
a = input("Insira uma palavra: ")
borda(a)