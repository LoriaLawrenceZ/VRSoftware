Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
nome: caractere
nota1, nota2, nota3, nota4, media, faltas: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
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
        escreval("Aluno est� em exame")
     senao
          escreval("Aluno foi reporvado")
     fimse
fimse


Fimalgoritmo