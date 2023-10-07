Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
char: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Insira um único caractere:")
leia(char)

se ((char = "a") ou (char = "e") ou (char = "i") ou (char = "o") ou (char = "u")) entao
   escreval("O caractere informado é uma vogal")
senao
     se((char = "0") ou (char = "1") ou (char = "2") ou (char = "3") ou (char = "4") ou (char = "5") ou (char = "6") ou (char = "7") ou (char = "8") ou (char = "9")) entao
              escreval("O caractere informado é um algarismo")
     senao
          escreval("O caractere informado é uma consoante")
     fimse
fimse

Fimalgoritmo