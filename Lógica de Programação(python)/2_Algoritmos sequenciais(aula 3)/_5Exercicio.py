#Faça um algoritmo que receba três valores, representando os lado de um triângulo fornecidos pelo usuário
#Verifique se os valores formam um triângulo e classifque como:
#a)Equilátero(três lados iguais)
#b)Isóceles (dois lados iguais)
#c) Escaleno (três lados diferentes)
A = int(input("Lado 1: "))
B = int(input("Lado 2: "))
C = int(input("Lado 3: "))
#Verificação se é ou não um triângulo na linha abaixo:
if((A<=0 or B<=0 or C<=0)or(A>B+C or B>C+A or C>B+A)):
    print("Os lados informados não compõem um triângulo!")
elif(A==C and B==C):
    print("Triângulo equilátero detectado!")
elif(A==B or C==B or A==C):
    print("Triângulo Isóceles detectado!")
else:
    print("Triângulo escaleno detectado!")