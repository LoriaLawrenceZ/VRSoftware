Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
temperatura: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Insira a temperatura atual (em Celcius) [Apenas n�meros]:")
leia(temperatura)

se (temperatura <= 18) entao
   escreval("O clima est� frio")
senao
     se (temperatura <= 23) entao
        escreval("O clima est� agrad�vel")
     senao
          se (temperatura <= 35) entao
             escreval("O clima est� quente")
          senao
               escreval("O clima est� muito quente")
          fimse
     fimse
fimse


Fimalgoritmo