/*
Enunciado
Escreva um programa que informa a tabuada de multiplicação, de um número informado (entre 1-10).
 */

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        double multiply =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = sc.nextInt();
        System.out.println("---------- Multiplication table ----------");
        for (int i=1; i<=10; i++){
            multiply = number*i;
            System.out.println(number + " * " + i + " = "+ multiply);
        }
    }
}
