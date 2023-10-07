public class App {
    public static void main(String[] args) throws Exception {
        int a = 11;
        int b = 5;
        
        System.out.printf("Expressões Matemáticas");
        System.out.printf("%d + %d = %d", a, b, (a + b)); //Adição
        System.out.printf("%d - %d = %d", a, b, (a - b)); //Subtração
        System.out.printf("%d * %d = %d", a, b, (a * b)); //Multiplicação
        System.out.printf("%d / %d = %d", a, b, (a / b)); //Divisão
        System.out.printf("%d %% %d = %d", a, b, (a % b)); //Módulo (Resto da Divisão)

        System.out.printf("Expressões Relacionais");
        System.out.printf("%d > %d = %b", a, b, (a > b)); //Maior
        System.out.printf("%d < %d = %b", a, b, (a < b)); //Menor
        System.out.printf("%d >= %d = %b", a, b, (a >= b)); //Maior Igual
        System.out.printf("%d <= %d = %b", a, b, (a <= b)); //Menor Igual
        System.out.printf("%d == %d = %b", a, b, (a == b)); //Igual
        System.out.printf("%d != %d = %b", a, b, (a != b)); //Diferente

        System.out.printf("Expressões Lógicas");
        System.out.printf("%d && %d = %b", a, b, (a + b)); //E
        System.out.printf("%d || %d = %b", a, b, (a - b)); //OU
        System.out.printf("%d ! %d = %b", a, b, (a * b)); //NÃO
        System.out.printf("%d ^ %d = %b", a, b, (a / b)); //XOU (OU Exclusivo)
    }
}
