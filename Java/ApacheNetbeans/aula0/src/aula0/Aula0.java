/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0;

/**
 *
 * @author prisc
 */
public class Aula0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1 = 13;
        double n2 = 5;
        double resultado = 9;
        
        calcular(n1, n2, resultado);
    }
    
    public static void calcular(double num1, double num2, Double resultadoEsperado){
        double resultado = num1 + num2;
        if(!resultadoEsperado.equals(resultado)){
            System.out.println("DEU RUIM");
        }
        else{
            System.out.println("DEU BOM");
        }
    }
    
}
