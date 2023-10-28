/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author prisc
 */
public class Calculadora {
    Scanner sc;
    double num1;
    double num2;

    public Calculadora(Scanner sc) {
        this.sc = sc;
    }

    public void menu() {
        boolean continuar = true;
        String opcaoMenu = "";

        do {
            System.out.println("[1] - Soma | [2] - Subtração"
                    + " | [3] - Multiplicação | [4] - Divisão | [0] - Sair");
            opcaoMenu = sc.next();

            while (!opcaoMenu.equals("0") && !opcaoMenu.equals("1")
                    && !opcaoMenu.equals("2") && !opcaoMenu.equals("3")
                    && !opcaoMenu.equals("4")) {
                System.out.println("Insira uma opção válida!"
                        + "\n[1] - Soma | [2] - Subtração"
                        + " | [3] - Multiplicação | [4] - Divisão"
                        + " | [0] - Sair");
                opcaoMenu = sc.next();
            }

            switch (opcaoMenu) {
                case "0":
                    continuar = false;
                    break;
                case "1":
                    soma();
                    break;
                case "2":
                    subtracao();
                    break;
                case "3":
                    multiplicacao();
                    break;
                case "4":
                    divisao();
                    break;
                default:
                    break;
            }
        } while (continuar);
    }

    public void soma() {
        System.out.println("Insira um primeiro número para o cálculo:");
        num1 = sc.nextInt();
        System.out.println("Insira um segundo número para o cálculo:");
        num2 = sc.nextInt();

        System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtracao() {
        System.out.println("Insira um primeiro número para o cálculo:");
        num1 = sc.nextInt();
        System.out.println("Insira um segundo número para o cálculo:");
        num2 = sc.nextInt();

        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplicacao() {
        System.out.println("Insira um primeiro número para o cálculo:");
        num1 = sc.nextInt();
        System.out.println("Insira um segundo número para o cálculo:");
        num2 = sc.nextInt();

        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void divisao() {
        System.out.println("Insira um primeiro número para o cálculo:");
        num1 = sc.nextInt();
        System.out.println("Insira um segundo número para o cálculo:");
        num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Não é possível Dividir por 0.\nTente novamente com digitos válidos");
        } else {
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}
