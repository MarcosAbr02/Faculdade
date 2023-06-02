#Desenvolva um algoritmo que solicite ao usuário uma quantidade de dias, de horas, de minutos e de segundos.
#Calcule o total de segundos resultante e imprima na tela para o usuário.
dias = int(input("Insira a quantidade de dias:"))
horas = int(input("Insira a quantidade de horas:"))
minutos = int(input("Insira a quantidade de minutos:"))
segundos = int(input("Insira a quantidade de segundos:"))
resultado = dias*86400+horas*3600+minutos*60+segundos
print("A quantidade total de tempo em segundos é de {}".format(resultado))