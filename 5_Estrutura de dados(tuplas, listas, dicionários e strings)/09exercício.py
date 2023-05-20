# Escreva um algorítmo que crie uma tupla com 10 palavras.
# Encontre dentro dessa tupla as vogais de cada palavra.
# Faça um print na tela com o nome da palavra e suas respectivas vogais
tpl = ("Arroz", "Banana", "Abacate", "Corvo", "Urubu", "Flamengo", "Intel", "Processador", "Ram", "Cooler")
dic = {}
for item in tpl:
    vogais = []
    item = item.upper()
    for i in range(0, len(item)):
        if item[i] in "AEIOU":
            vogais.append(item[i])
    dic[item]=vogais
for i,j in dic.items():
    print("As vogais de {} são {}".format(i,j))