import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in, "latin1"); //Instanciando objeto da classe Scanner

    //Exercício 1
    public void Exercicio1(){

        System.out.println("---------------Exercício 1---------------");

        String nomeCpf[][] = new String[5][2]; //Matriz que armazena
        String nome; //Variavel "temporária"
        String cpf; //Variavel "temporária"

        //Iteração para armazenar valores na matriz
        for (int i = 0; i < nomeCpf.length; i++) {
            System.out.println("\n---------------------Cadastre-se---------------------");
            for (int j = 0; j < nomeCpf[i].length; j++) {
                //Atribuindo à matriz
                if (j == 0) {
                    System.out.print("Insira seu nome: ");
                    nome = sc.next();
                    nomeCpf[i][j] = nome;

                    //Separação para ficar mais bonito
                    System.out.println("--------------------------");
                }
                else{
                    System.out.print("Insira seu cpf: ");
                    cpf = sc.next();
                    nomeCpf[i][j] = cpf;
                }
            }
        }

        System.out.println("\n---------------------Contas---------------------");
        //Iteração para exibição da matriz
        for (int i = 0; i < nomeCpf.length; i++) {
            System.out.println(nomeCpf[i][0] +": "+ nomeCpf[i][1]);
        }
    }

    public void Exercicio2(){
        String produtos[][] = new String [5][4]; //Criando matriz

        //Iterando matriz para atribuir valores
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("--------------------------------------");

            System.out.println("Digite o código.");
            produtos[i][0] = sc.nextLine();

            System.out.println("\nDigite o código de barras.");
            produtos[i][1] = sc.nextLine();

            System.out.println("\nDigite a descriçao.");
            produtos[i][2] = sc.nextLine();

            System.out.println("\nDigite o preço.");
            produtos[i][3] = sc.nextLine();
        }

        //Iterando a matriz para ocorrer a exibição
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("COD.\tCOD.BAR\tDESCRICAO\tPRECO");
            System.out.printf("%s\t%s\t%s\t%s\n", produtos[i][0], produtos[i][1], produtos[i][2], produtos[i][3]);
        }
    }
}
