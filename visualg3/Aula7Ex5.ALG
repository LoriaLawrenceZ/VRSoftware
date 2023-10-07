Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
v1, v2, v3: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Insira o primeiro valor:")
leia(v1)

escreval("Insira o segundo valor:")
leia(v2)

escreval("Insira o terceiro valor:")
leia(v3)

se ((v1 >= v2) e (v1 >= v3)) entao
   escreval("O primeiro valor é o maior")
senao
     se ((v2 >= v1) e (v2 >= v3)) entao
        escreval("O segundo valor é o maior")
     senao
          escreval("O terceiro valor é o maior")
     fimse
fimse

Fimalgoritmo