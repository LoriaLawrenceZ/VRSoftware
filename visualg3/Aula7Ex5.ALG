Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
v1, v2, v3: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Insira o primeiro valor:")
leia(v1)

escreval("Insira o segundo valor:")
leia(v2)

escreval("Insira o terceiro valor:")
leia(v3)

se ((v1 >= v2) e (v1 >= v3)) entao
   escreval("O primeiro valor � o maior")
senao
     se ((v2 >= v1) e (v2 >= v3)) entao
        escreval("O segundo valor � o maior")
     senao
          escreval("O terceiro valor � o maior")
     fimse
fimse

Fimalgoritmo