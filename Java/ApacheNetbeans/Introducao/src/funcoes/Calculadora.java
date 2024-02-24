package funcoes;


public class Calculadora {

    public static final int SOMA = 1;
    public static final int SUBTRACAO = 2;
    public static final int MULT = 3;
    public static final int DIV = 4;

    /**
     * Metodo responsavel pelo calculo.
     *
     * @param n1 Numero 1 a ser calculado.
     * @param n2 Numero 2 a ser calculado.
     * @param operacao Qual operacao a ser escolhida.
     * @return Valor calculado.
     */
    public static Double calcular(Double n1, Double n2, Integer operacao) {
        Double resultado = null;

        //Switch responsavel pela escolha de operação.
        switch (operacao) {
            case SOMA:
                resultado = n1 + n2;

                break;
            case SUBTRACAO:
                resultado = n1 - n2;

                break;
            case MULT:
                resultado = n1 * n2;

                break;
            case DIV:
                resultado = n1 / n2;

                break;
            default:
                throw new RuntimeException("Operacão invalida!");
        }

        return resultado;
    }

    /**
     * Metodo responsavel pelo calculo.
     *
     * @param n1 Numero 1 a ser calculado.
     * @param n2 Numero 2 a ser calculado.
     * @return Valor calculado.
     */
    public static Double subtrair(Double n1, Double n2) {
        Double resultado = null;

        resultado = n1 - n2;

        return resultado;
    }
}
