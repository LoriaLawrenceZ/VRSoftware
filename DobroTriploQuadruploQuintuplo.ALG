Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/07/2023
Var
// Se��o de Declara��es das vari�veis 
 num: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Insira um n�mero: ")
leia(num)

escreva("O dobro de ", num)
num <- num * 2
escreva(" � ", num)
num <- (num / 2) * 3
escreva(", o triplo � ", num)
num <- (num / 3) * 4
escreva(", o qu�druplo � ", num)
num <- (num / 4) * 5
escreva(" e o qu�ntuplo � ", num)

Fimalgoritmo