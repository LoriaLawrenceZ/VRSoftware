package aula1;

import java.util.Scanner;

/**
 *
 * @author prisc
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora(sc);
        calculadora.menu();
    }
    
}
