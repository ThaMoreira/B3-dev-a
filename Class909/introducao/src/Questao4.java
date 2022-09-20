/*
Enunciado
Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais.
A saída é a quantia em dólares. Use formatação de saída para exibir os valores de acordo com
cada representação de moeda.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.print("Type the dollar rate: ");
        double dollarRate = sc.nextDouble();
        System.out.print("Type the BRL amount to be converted: ");
        double brlAmount = sc.nextDouble();
        double amountConverted =  brlAmount/dollarRate;
        System.out.printf("R$ " + brlAmount + " converted in USD is " + df.format(amountConverted) + " USD");
    }
}
