Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Se��o de Declara��es das vari�veis 
num1, num2, num3: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Insira um primeiro valor:")
leia(num1)

escreval("Insira um segundo valor:")
leia(num2)

escreval("Insira um terceiro valor:")
leia(num3)

se ((num1 > num2 + num3) ou (num2 > num1 + num3) ou (num3 > num1 + num2)) entao
   escreval("N�o � poss�vel formar um triangulo com as medidas informadas")
senao
     se ((num1 <> num2) e (num2 <> num3) e (num1 <> num3)) entao
        escreval ("O tri�ngulo � escaleno")
     senao
          se (((num 1 = num2) e num1 <> num3) ou ((num1 = num3) e num1 <> num2) ou ((num2 = num3) e num2 <> num1)) entao
             escreval("O tri�ngulo � is�sceles")
          senao
               escreval("O tri�ngulo � equil�tero")
          fimse
     fimse
fimse



Fimalgoritmo