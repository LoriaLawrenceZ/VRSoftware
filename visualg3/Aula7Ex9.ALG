Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
char: caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Insira um �nico caractere:")
leia(char)

se ((char = "a") ou (char = "e") ou (char = "i") ou (char = "o") ou (char = "u")) entao
   escreval("O caractere informado � uma vogal")
senao
     se((char = "0") ou (char = "1") ou (char = "2") ou (char = "3") ou (char = "4") ou (char = "5") ou (char = "6") ou (char = "7") ou (char = "8") ou (char = "9")) entao
              escreval("O caractere informado � um algarismo")
     senao
          escreval("O caractere informado � uma consoante")
     fimse
fimse

Fimalgoritmo