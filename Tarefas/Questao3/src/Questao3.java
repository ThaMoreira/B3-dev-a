import java.util.Scanner;

/*
 * Enunciado
Realizar uma operação matemática, que deve ser passada via System.in ( opções: + - / * ) entre dois números que também devem ser solicitados via System.in
 */

public class Questao3 {

    public static void main(String[] args) {

        initialize();
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            String op = chooseOp();

            double x = number("primeiro");
            double y = number("segundo");

            switch (op) {
                case "+":
                    System.out.println("A soma de " + x + " + " + y + " é: " + sum(x, y));
                    break;
                case "-":
                    System.out.println("A subtração de " + x + " - " + y + " é: " + subtract(x, y));
                    break;
                case "*":
                    System.out.println("A multiplicação de " + x + " * " + y + " é: " + multiply(x, y));
                    break;
                case "/":
                    System.out.println("A divisão de " + x + " / " + y + " é: " + divide(x, y));
                    break;
                default:
                    System.out.println("Digite uma operação válida! '+' para somar, '-' para subtrair, '*' para multiplicar e '/' para dividir");
                    break;
            }
            System.out.println("Deseja realizar outra operação? (y/n) ");
            answer = sc.nextLine();
        } while (answer.equals( "y")); //arrumar o laço do while
    }

    public static void initialize() {
        System.out.println("Bem vindo a calculadora, aqui poderam ser realizadas operações matemáticas como: adição, subtração, multiplicação e divisão");
    }

    public static String chooseOp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a operação: ");
        String op = sc.nextLine();
        return op;
    }

    private static double number(String io) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o " + io + " número: ");
        double number = sc.nextDouble();
        return number;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

}
