# Escreva um algoritmo que obtenha do usuário uma frase de tamanho entre 10 e 30 caracteres (faça uma avaliação desse dado).
# Após a frase ter sido digitada corretamente, faça a impressão dela na tela da maneira exata como foi digitada e, em seguida, remova os espaços da frase e imprimma novamente, sem espaços.
frase = input("Insira uma frase de 10 a 30 caracteres: ")
a = len(frase)
while(a > 30 or a < 10):
    frase = input("Insira uma frase de 10 a 30 caracteres: ")
    a = len(frase)
print(frase)
for i in range(0,a,1):
    if(frase[i] != " "):
        print(frase[i])