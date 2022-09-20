import java.util.Scanner;

/*
Enunciado
Escreva um programa que converte temperaturas de Celsius para Farenheit.
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many temperatures will be converted?");
        int quantity = sc.nextInt();

        do {
            System.out.print("Type the temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double toFahrenheit = (celsius * 1.8) + 32;
            System.out.println("The temperature " + celsius + "C to Fahrenheit is " + toFahrenheit + "F");
            quantity --;
        }while (quantity>0);
    }
}
