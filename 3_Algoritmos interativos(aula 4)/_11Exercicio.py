# Escreva um algoritmo que leia um valor e que imprima a quantidade de cédulas necessárias para pagar esse mesmo valor.
# Para simplificar, vamos trabalhar apenas com valores inteiros e com cédulas R$100, R$50, R$20, R$10, 5R$ e 1R$
print("Calculadora de impressão de notas, bom dia!\nPara sair apenas digite \"0\"")
while True:
    valor = int(input("Digite um valor para calcularmos: "))
    if not valor:
        break
    nota100, nota50, nota20, nota10, nota5, nota1 = 0, 0, 0, 0, 0, 0
    if(valor>=100):
        nota100 = valor // 100
        valor %= 100
    if(valor>=50):
        nota50 = valor // 50
        valor %= 50
    if(valor>=20):
        nota20 = valor // 20
        valor %= 20
    if(valor>=10):
        nota10 = valor //10
        valor %= 10
    if(valor>=5):
        nota5 = valor // 5
        valor %= 5
    if (valor):
        nota1 = valor
    else:
        print("Insira um valor válido!")
    print("A decomposição ficou:\n{} nota(s) de 100\n{} nota(s) de 50\n{} nota(s) de 20\n{} nota(s) de 10\n{} nota(s) de 5\n{} nota(s) de 1".format(nota100, nota50, nota20, nota10, nota5, nota1))
print("Encerrando o programa....")