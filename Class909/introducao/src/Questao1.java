/*
Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que
faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.

Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.

Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com
a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo
 gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the time spent: ");
        double time = sc.nextDouble();
        System.out.println("Type the Average Speed in km/h: ");
        double averageSpeed = sc.nextDouble();
        double distance = time*averageSpeed;
        double liters = distance/12;

        System.out.println("Average Speed: " + averageSpeed);
        System.out.println("Time spent: " + time);
        System.out.println("Travelled distance: " + distance);
        System.out.printf("Liters spent: %.2f" , liters);
    }
}