#Crie uma variável de string que receba uma frase qualquer.
#Crie uma segunda variável, agora contendo a metade da string digitada.
#Imprima na tela somente os dois últimos caracteres da segunda variável.
s1 = input("Digite uma frase")
b = int(len(s1)/2)
s2 = s1[:b]
print(s2)
d = len(s2)-1
s3 = s2[d-1]+s2[d]
print(s3)

#Solução do professor, vou adicionar aqui porque ficou muito diferente de minha resposta
#Notas: Não sabia daquele -2 e fico com pé atrás de juntar tanta coisa em uma linha só, mas aos poucos vou aprendendo até onde posso ir

#frase = input("Digite uma frase:)
#tam = len(frase)

#frase2 = frase[:int(tam/2)]
#print(frase2[-2:])