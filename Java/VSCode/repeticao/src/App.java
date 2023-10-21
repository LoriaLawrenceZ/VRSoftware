public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n-----------------------Exercício 1-----------------------");
        //Loop "FOR"
        for (int i = 0; i <= 1000; i+= 5) { //Iterar 10 vezes (0 à 9)
            //Código a ser executado
            System.out.print(i +"; ");
        }

        System.out.println("\n-----------------------Exercício 2-----------------------");
        //Loop "WHILE"
        //Checa, depois faz
        int tabuada = 1;
        while ( tabuada <= 10 ) { //Condição
            //Código a ser executado
            System.out.println("-----------------------Tabuada do "+ tabuada +"-----------------------");

            for (int i = 1; i <= 10; i++) { //For para iterar do 1 ao 10 por tabuada
                System.out.println(i +" * "+ tabuada +" = "+ (i * tabuada));
            }

            tabuada++; //Contador
        }

        System.out.println("\n-----------------------Exercício 3-----------------------");
        //Loop "DO WHILE"
        //Faz primeiro, depois checa
        tabuada = 5; //Setando tabuada para o exercício
        do {
            //Código a ser executado
            for (int i = 1; i <= 10; i++) {
                System.out.println(i +" * "+ tabuada +" = "+ (i * tabuada));
            }
            System.out.println("----------------------------------------------");
            tabuada++;//Contador
        } while (tabuada <= 15); //Condição
    }
}
