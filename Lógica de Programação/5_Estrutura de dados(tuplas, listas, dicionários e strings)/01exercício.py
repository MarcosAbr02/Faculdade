# Crie uma tupla com as 10 primeiras linguagens de programação mais amadas. Em seguida:
# Apresente na tela o ranking numerado com uma palavra em cada linha
# Apresente na tela somente o top 3 de linguagens
# Apresente na tela as últimas 5 do ranking

ranking = ("Rupla","Typescript","Python","Kotlin","Go","Julia","Dart","C#","Swift","Javascprit")
print("Top 10 linguagens de programação: ")
for i in range(0, len(ranking)):
    print(i+1," - ", ranking[i])
print("\nTop 3: \n",ranking[:3])
print("Últimas 5: ",ranking[-5:])
i = 0
while (ranking[i] != "Python"):
    i += 1
i+=1
print("Python está na {} posição!".format(i))