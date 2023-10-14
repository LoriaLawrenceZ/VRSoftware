import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "latin1");

        String jogarNovamente = "S";
        String escolhaPlayer;

        do {
            System.out.println("------------------JOKENPO------------------");
            System.out.println("[1] - Pedra | [2] - Papel | [3] - Tesoura");
            escolhaPlayer = sc.next();

            Jokenpo.Jogando(escolhaPlayer);

            System.out.println("------------------\nDeseja jogar novamente?\n[S] - Sim | [N] - Não");
            jogarNovamente = sc.next();
        } while (jogarNovamente.equalsIgnoreCase("S"));
    }
}
