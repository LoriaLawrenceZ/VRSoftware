Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/07/2023
Var
// Seção de Declarações das variáveis 
num1, num2, num3: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Insira um primeiro valor:")
leia(num1)

escreval("Insira um segundo valor:")
leia(num2)

escreval("Insira um terceiro valor:")
leia(num3)

se ((num1 > num2 + num3) ou (num2 > num1 + num3) ou (num3 > num1 + num2)) entao
   escreval("Não é possível formar um triangulo com as medidas informadas")
senao
     se ((num1 <> num2) e (num2 <> num3) e (num1 <> num3)) entao
        escreval ("O triângulo é escaleno")
     senao
          se (((num 1 = num2) e num1 <> num3) ou ((num1 = num3) e num1 <> num2) ou ((num2 = num3) e num2 <> num1)) entao
             escreval("O triângulo é isósceles")
          senao
               escreval("O triângulo é equilátero")
          fimse
     fimse
fimse



Fimalgoritmo