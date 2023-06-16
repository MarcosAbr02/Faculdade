#Desenvolva um algoritmo que solicite ao usuário dois números inteiros. Imprima a soma destes dois números na tela
a = int(input("Insira o primeiro número"))
b = int(input("Insira o segundo número"))
#concatenação clássica
print("A soma dos números %d e %d é %d" % (a, b, a+b))
#concatenação moderna
print("A soma dos números {} e {} é {}".format(a, b, a+b))