Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
nome: caractere
nota1, nota2, nota3, nota4, media, faltas: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Nome do aluno:")
leia(nome)

escreval("Insira a primeira nota do aluno")
leia(nota1)

escreval("Insira a segunda nota do aluno")
leia(nota2)

escreval("Insira a terceira nota do aluno")
leia(nota3)

escreval("Insira a quarta nota do aluno")
leia(nota4)

media <- ((nota1 * 1) + (nota2 * 2) + (nota3 * 3) + (nota4 * 4)) / (1 + 2 + 3 + 4)

escreval("Insira a quantidade total de faltas do aluno")
leia(faltas)

se (media >= 9.1) entao
   escreval("A")
senao
     se (media >= 6.1) entao
        escreval("B")
     senao
          se (media >= 4.1) entao
             escreval("C")
          senao
               se (media >= 3.1) entao
                  escreval("D")
               senao
                    escreval("E")
               fimse
          fimse
     fimse
fimse


Fimalgoritmo