package introducao;

import funcoes.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Rafael Vieira
 */
public class Introducao {
    
    private static final int SAIR = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a operação desejada.\n"
                + "[1] SOMA\n"
                + "[2] SUBTRAÇÃO\n"
                + "[3] MULTIPLICAÇÃO\n"
                + "[4] DIVISÃO\n"
                + "[0] Para Sair");

        Integer operacao = teclado.nextInt();

        while (operacao != SAIR) {
            Double numeroX = teclado.nextDouble();
            Double numeroY = teclado.nextDouble();

            System.out.println(Calculadora.calcular(numeroX, numeroY, Calculadora.SOMA));
        }
    }

}
