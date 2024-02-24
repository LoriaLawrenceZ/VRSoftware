package funcoes;

public class Condicao {

    public static void funcaoIf(boolean resultadoCondicao) {
        int valorA = 10;
        int valorB = 20;
        int valorC = 15;

        // Operadores Ternarios
        // Igual == EX: valorA == valorB
        // Maior > EX: valorA > valorB
        // Menor < EX: valorA < valorB
        // Maior-Igual >= EX: valorA >= valorB
        // Menor-Igual <= EX: valorA <= valorB
        // Diferente ! EX: !variavelBoolean ou != valorA != valorB
        // 
        // E &&
        // OU ||
        
        if ((valorA < valorB && valorB > valorC)
                || (valorA > valorC)) {
            System.out.println("Condicao 1!");
        } else if (valorA > valorB) {
            System.out.println("Condição 2!");
        } else {
            System.out.println("Condição 3!");
        }
    }

    public static void funcaoSwitch(Integer numeroCondicional) {
        switch (numeroCondicional) {
            case Integer.MIN_VALUE:
                System.out.println("Valor Minimo de um Integer " + numeroCondicional);
                break;
            case Integer.MAX_VALUE:
                System.out.println(String.format("Valor Maximo de um Integer %d!", numeroCondicional));
                break;
            default:
                System.out.println(String.format("Valor do parametro %d!", numeroCondicional));
                break;
        }
    }
}
