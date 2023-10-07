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

media <- (nota1 + nota2 + nota3 + nota4) / 4

escreval("Insira a quantidade total de faltas do aluno")
leia(faltas)

se ((media >= 7) e (faltas < 60)) entao
   escreval("Alunno foi aprovado")
senao
     se ((media >= 5 e media < 7) e (faltas < 60)) entao
        escreval("Aluno está em exame")
     senao
          escreval("Aluno foi reporvado")
     fimse
fimse


Fimalgoritmo