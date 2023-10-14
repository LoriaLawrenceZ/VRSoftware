public class Subalgoritmos {
    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public static double divisao(int num1, int num2){
        if (num2 == 0) {
            System.out.println("Não poderás dividir por 0 (zero)");
            return 0.0;
        } else {
            return num1 / num2;
        }
    }

    public static int multiplicacao(int num1, int num2){
        return num1 * num2;
    }
}
