# Escreva um algoritmo que encontre todos os números primos de 2 até 99. Imprima na tela todos eles.
primo = 0
for i in range(2, 100, 1):
    a = 2
    cont = 0
    while a <= i:
        if i % a == 0:
            cont += 1
        a+=1
    if cont == 1:
        primo += 1
        print("{}".format(i))
print("Há {} primos entre 2 e 99".format(primo))
