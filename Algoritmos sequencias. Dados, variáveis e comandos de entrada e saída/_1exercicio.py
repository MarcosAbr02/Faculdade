#Desenvolva um algoritmo que solicite ao usuário dois números inteiros. Imprima a soma destes dois números na tela
a = int(input("Insira o primeiro número"))
b = int(input("Insira o segundo número"))
#concatenação clássica
print("A soma dos números %i e %i é %i" % (a, b, a+b))
#concatenação moderna
print("A soma dos números {} e {} é {}".format(a, b, a+b))