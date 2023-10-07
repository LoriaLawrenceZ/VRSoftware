Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
v1, v2: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Insira um primeiro valor:")
leia(v1)

escreval("Insira um segundo valor:")
leia(v2)

se v1 > v2 entao
   escreval("O primeiro valor é maior que o segundo valor")
senao
     se v1 = v2 entao
        escreval("O primeiro valor é igual ao segundo valor")
     senao
          escreval("O primeiro valor é menor que o seguno valor")
     fimse
fimse

Fimalgoritmo