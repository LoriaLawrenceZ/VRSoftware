Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/07/2023
Var
// Seção de Declarações das variáveis 
 num: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Insira um número: ")
leia(num)

escreva("O dobro de ", num)
num <- num * 2
escreva(" é ", num)
num <- (num / 2) * 3
escreva(", o triplo é ", num)
num <- (num / 3) * 4
escreva(", o quádruplo é ", num)
num <- (num / 4) * 5
escreva(" e o quíntuplo é ", num)

Fimalgoritmo