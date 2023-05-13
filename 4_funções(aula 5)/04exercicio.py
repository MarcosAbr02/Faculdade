# Escreva uma função para validar uma string. Essa função recebe como parâmetro a string, o número mínimo e máximo de caracteres.
# Retorne veradeiro se o tamanho da string estiver entre os valores de minímo e máximo,e falso, caso contrário.
def valida(s1, min, max):
    tam = len(s1)
    if tam<min or tam>max:
        return False
    else:
        return True

s1 = input("Digite uma string (4-10 caracteres): ")
while valida(s1, 4, 10):
    s1 = input("Digite uma string (4-10 caracteres): ")
print(s1)