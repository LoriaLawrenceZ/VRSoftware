import java.util.Random;

public class Jokenpo {
    public static void Jogando(String escolhaPlayer){
        Random rd = new Random();

        int escolhaBotNum = rd.nextInt(3) + 1;
        String escolhaBot;

        if(escolhaBotNum == 1){
            escolhaBot = "Pedra";
        }
        else if(escolhaBotNum == 2){
            escolhaBot = "Papel";
        }
        else{
            escolhaBot = "Tesoura";
        }

        if(escolhaPlayer == "1"){
            System.out.printf("Jogador escolheu Pedra | Bot escolheu %s", escolhaBot);
        }
        else if(escolhaPlayer == "2"){
            System.out.printf("Jogador escolheu Papel | Bot escolheu %s", escolhaBot);
        }
        else{
            System.out.printf("Jogador escolheu Tesoura | Bot escolheu %s", escolhaBot);
        }

        //Empate
        if(escolhaPlayer.equals(String.valueOf(escolhaBotNum))){
            System.out.println("EMPATE!");
        }
        //Player Jogar Pedra
        else if(escolhaPlayer.equals("1") & escolhaBotNum == 2){
            System.out.println("Ganhador é: BOT");
        }
        else if(escolhaPlayer.equals("1") & escolhaBotNum == 3){
            System.out.println("Ganhador é: Player");
        }
        //Player Jogar Papel
        else if(escolhaPlayer.equals("2") & escolhaBotNum == 1){
            System.out.println("Ganhador é: Player");
        }
        else if(escolhaPlayer.equals("2") & escolhaBotNum == 3){
            System.out.println("Ganhador é: BOT");
        }
        //Player Jogar tesoura
        else if(escolhaPlayer.equals("3") & escolhaBotNum == 1){
            System.out.println("Ganhador é: BOT");
        }
        else{
            System.out.println("Ganhador é: Player");
        }
    }
}
