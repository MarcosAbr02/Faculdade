# Escreva um programa que leia o nome de um aluno e três notas. Armazene em um dicionário o nome e média aritmética da nota
# Ainda, armazene no dicionário a situação do aluno:
# Média => 7, aprovado
# Média < 7 e >= 5, em exame.
# Média < 5, reprovado.
aluno = {}
aluno["nome"] = input("Qual o nome do aluno?")
n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
aluno["média"] = (n1+n2+n3)/3
if aluno["média"] >=7:
    aluno["status"]="Aprovado"
elif 7 > aluno["média"] >= 5:
    aluno["status"]="Em exame"
else:
    aluno["status"]="Reprovado"

for i,j in aluno.items():
    print(i," = ",j)