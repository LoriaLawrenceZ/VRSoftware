Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
temperatura: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Insira a temperatura atual (em Celcius) [Apenas números]:")
leia(temperatura)

se (temperatura <= 18) entao
   escreval("O clima está frio")
senao
     se (temperatura <= 23) entao
        escreval("O clima está agradável")
     senao
          se (temperatura <= 35) entao
             escreval("O clima está quente")
          senao
               escreval("O clima está muito quente")
          fimse
     fimse
fimse


Fimalgoritmo