/*
Enunciado
Escreva um programa que realiza conversão de medidas de polegadas em centímetros.
 */

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the inches value to convert into centimeters: ");
        double inches = sc.nextDouble();
        double centimeters = inches*2.54;
        System.out.print(inches + " inches converted in centimeters is " + centimeters + " cm" );
    }
}
