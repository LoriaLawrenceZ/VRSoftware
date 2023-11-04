package funcoes;

import java.util.Scanner;

public class Repeticao {

    public static void funcaoWhile() {
        String entrada = "";

        Scanner teclado = new Scanner(System.in);

        while (!entrada.equals("exit")) {
            System.out.println("Digite algo para ser exibido, ou exit para sair!");

            entrada = teclado.next();

            System.out.println(entrada);
        }
    }

    public static void funcaoDoWhile() {
        String entrada;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite algo para ser exibido, ou exit para sair!");

            entrada = teclado.next();

            System.out.println(entrada);
        } while (!entrada.equals("exit"));
    }
    
    public static void funcaoFor(int quantidadeDeRepeticao) {
        for (int contador = 1; contador <= quantidadeDeRepeticao; contador++ ) {
            System.out.println(String.format("Mensagem de numero %d!", contador));
        }
    }
}
