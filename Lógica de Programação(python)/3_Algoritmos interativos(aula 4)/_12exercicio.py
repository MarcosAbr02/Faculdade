# Um cinema cobra preços diferentes para os ingressos de acordo com a idade de uma pessoa.
# Se a pessoa tiver menos de 3 anos de idade, o ingresso será gratuito, se tiver entre 3 e 12 anos, o ingresso custará R$15, se tiver mais de 12 anos, custará R$ 30
# Escreva um laço em que você pergunte a idade aos usuários e, então, informe-lhes o preço do ingresso do cinema
# Encerre o laço usando um break quando usuário digitar sair
# Após encerrar o laço, apresente na tela o total de pessoas que compraram ingressos, o total de dinheiro arrecadado e a média de idade das pessoas
print("Bem-vindo a bilheteria, por favor digite a idade de todos os que desejam uma entrada\nQuando terminar de digitar todas as idades, digite sair")
soma = 0
preco = 0
pessoa = 0
while True:
    idade = input("Digite sua idade:")
    if idade == "sair":
        break
    if int(idade) < 3 and int(idade) > 0:
        soma += int(idade)
        pessoa += 1
    elif int(idade) >= 3 and int(idade) <= 12:
        soma += int(idade)
        pessoa += 1
        preco += 15
    elif int(idade) > 12 and int(idade) < 120:
        soma += int(idade)
        pessoa += 1
        preco += 30
    else:
        print("Digite uma idade válida!")
media = soma/pessoa
print("O total de pessoa é {}\nO preço final ficou R${}\nA idade média dos clientes é {:.2f}".format(pessoa, preco, media))