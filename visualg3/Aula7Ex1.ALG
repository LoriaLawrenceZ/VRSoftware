Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
v1, v2: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Insira um primeiro valor:")
leia(v1)

escreval("Insira um segundo valor:")
leia(v2)

se v1 > v2 entao
   escreval("O primeiro valor � maior que o segundo valor")
senao
     se v1 = v2 entao
        escreval("O primeiro valor � igual ao segundo valor")
     senao
          escreval("O primeiro valor � menor que o seguno valor")
     fimse
fimse

Fimalgoritmo