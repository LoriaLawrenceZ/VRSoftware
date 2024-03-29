/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author prisc
 */
public class Calculadora {
    Scanner sc;
    double num1;
    double num2;
    double calculo;
    // Histórico de números
    ArrayList<String> historico = new ArrayList<String>();

    public Calculadora(Scanner sc) {
        this.sc = sc;
    }

    public void menu() {
        boolean continuar = true;
        String opcaoMenu = "";

        do {
            System.out.println("[1] - Soma | [2] - Subtração"
                    + " | [3] - Multiplicação | [4] - Divisão | [5] - Histórico | [0] - Sair");
            opcaoMenu = sc.next();

            switch (opcaoMenu) {
                case "0":
                    continuar = false;
                    break;

                case "1":
                    pedirNumero();
                    soma(num1, num2);
                    break;

                case "2":
                    pedirNumero();
                    subtracao(num1, num2);
                    break;

                case "3":
                    pedirNumero();
                    multiplicacao(num1, num2);
                    break;

                case "4":
                    pedirNumero();
                    divisao(num1, num2);
                    break;

                case "5":
                    listarHistorico();
                    break;

                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }
        } while (continuar);
    }

    public void soma(double num1, double num2) {
        calculo = num1 + num2;
        historico.add(num1 +" + "+ num2 +" = "+ calculo);
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + calculo);
    }

    public void subtracao(double num1, double num2) {
        calculo = num1 - num2;
        historico.add(num1 +" - "+ num2 +" = "+ calculo);
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + calculo);
    }

    public void multiplicacao(double  num1, double num2) {
        calculo = num1 * num2;
        historico.add(num1 +" * "+ num2 +" = "+ calculo);
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + calculo);
    }

    public void divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possível Dividir por 0.\nTente novamente com digitos válidos");
        } else {
            calculo = num1 / num2;
            historico.add(num1 +" / "+ num2 +" = "+ calculo);
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + calculo);
        }
    }
    
    public void pedirNumero(){
        System.out.println("Insira um primeiro número para o cálculo:");
        num1 = sc.nextDouble();

        System.out.println("Insira um segundo número para o cálculo:");
        num2 = sc.nextDouble();
    }

    public void listarHistorico(){
        int contador = 1;
        System.out.println("--------------------------------------------------\nHistórico:");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println("Cálculo "+ contador +":");
            System.out.println(historico.get(i));
            contador++;
        }
    }
}
