import java.util.Random;

public class Explicacao {
    public void Exemplo(){
        Random rd = new Random(); //Instanciando objeto da classe Random

        //Matrizes são variáveis indexadas unidimensionais
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) { //Iteração item a item do vetor (iterando por índice)
            vetor[i] = rd.nextInt(100) + 1;
        }

        //Imprimeindo vetores
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%s]: %s\n", i, vetor[i]);
        }

        //Matrizes são arrays de mais de uma dimensão
        int [][] matriz = new int[5][6];
        System.out.println("\nO tamanho da matriz é: "+ matriz.length +" linhas");
        System.out.println("\nO tamanho da matriz é: "+ matriz[0].length +" colunas");

        //Iterando a matriz
        for (int i = 0; i < matriz.length; i++) { //Passando pelas linhas da matriz
            System.out.println("Passei pela linha "+ i);
            
            for (int j = 0; j < matriz[i].length; j++) { //Passando pelas colunas da matriz
                System.out.println("Passei pela coluna "+ j);
                matriz[i][j] = rd.nextInt(100) + 1; //Arribuindo valores à matriz
            }
        }

        //Iterando a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "; "); //Imprimindo as matrizes
            }
            System.out.println(); //salta linha (pra "encerrar" a primeira linha da matriz)
        }
    }
}
