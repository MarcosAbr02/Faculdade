# Crie um programa para ler o nome, ano de nascimento e sexo de diferentes pessoas
# Armazene os dados em um dicionário com listas
# Ao encerrar o cadastro, apresente:
# O total de cadastros efetuados
# A média das idades das pessoas
# Uma lista de mulheres com menos de 30 anos
# Uma lista de homens com idade acima da média
cadastros = {"nome":[],"sexo":[],"ano":[]}
numCadastros = 0

while True:
    try:
        name = input("Digite o nome: ")
        if not name:
            break
        year = int(input("Digite o ano de nascimento: "))
        sex = input("Digite o seu sexo (M ou F)?: ")
        cadastros["nome"].append(name)
        cadastros["sexo"].append(sex.upper())
        cadastros["ano"].append(year)
        numCadastros += 1
    except ValueError:
        print("Digite valores válidos!")
        continue

# Média de idade
soma = 0
for classe, valor in cadastros.items():
    if classe == "ano":
        for i in valor:
            idade = 2023-i
            soma += idade
media = soma/numCadastros

# Lista de mulheres com menos de 30 anos
mulheres = []
for nome, sexo, ano in zip(cadastros["nome"], cadastros["sexo"], cadastros["ano"]):
    if sexo == "F":
        idade = 2023 - ano
        if idade < 30:
            mulheres.append(nome)

# Lista de homens com idade acima da média
homens = []
for nome, sexo, ano in zip(cadastros["nome"], cadastros["sexo"], cadastros["ano"]):
    if sexo == "M":
        idade = 2023 - ano
        if idade > media:
            homens.append(nome)
print("Foram cadastras {} pessoas!".format(numCadastros))
print("{:.2f} é a idade média.".format(media))

# Verificação da lista de mulheres
if mulheres:
    print("As mulheres com menos de 30 anos são:", end=" ")
    for item in mulheres:
        print(item, end=" ")
    print()
else:
    print("Não há mulheres com menos de 30 anos.")

# Verificação da lista de homens
if homens:
    print("Os homens com idade acima da média são:", end=" ")
    for item in homens:
        print(item, end=" ")
    print()
else:
    print("Não há homens com idade acima da média.")