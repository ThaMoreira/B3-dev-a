import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        Menu menuop = new Menu();
        converted conver = new converted();
        ToFahrenheit Fahrenheit = new ToFahrenheit();
        ToCelsius Celsius = new ToCelsius();
        ToKelvin Kelvin = new ToKelvin();
        double soma = 0;
        double soma2 = 0;
        int n = 1;
        int op = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("       Welcome to the temperature convertor      ");
        do {
            try {
                System.out.println("  How many temperatures will be converted? Type 0 to exit    ");
                n = sc.nextInt();
                if (n != 0) {
                    double[] temps = new double[n];
                    double[] result = new double[n];
                    menuop.menuOption();
                    op = sc.nextInt();
                    if (op > 0 && op<4) {
                        System.out.println("Type the output temperature: ");
                        int opOut = sc.nextInt();
                        while (opOut >= 5) {
                            System.out.println(
                                    "Invalid Outout option typed. Please insert a valid option from the menu!");
                            opOut = sc.nextInt();
                        }
                        System.out.println("Type the temperature value to be converted: ");
                        for (int i = 0; i < n; i++) {
                            try {
                                double temp = getDouble();
                                temps[i] = temp;
                                switch (opOut) {
                                    case 1:
                                        result[i] = Celsius.transform(op, temps[i]);
                                        break;
                                    case 2:
                                        result[i] = Fahrenheit.transform(op, temps[i]);
                                        break;
                                    case 3:
                                        result[i] = Kelvin.transform(op, temps[i]);
                                    default:
                                        System.out.println(
                                                "Invalid Output option typed. Please insert a valid option from the menu!");
                                        // temp = getDouble();
                                }
                            } catch (InputMismatchException VariableDeclatorID) {
                                System.out.println("Please insert a valid option from the menu!");
                                sc.next();
                            }
                        }

                        conver.conversionHeader();
                        for (int i = 0; i < result.length; i++) {
                            conver.conversao(op, opOut, result[i], temps[i]);
                        }
                        conver.medHeader();
                        for (int i = 0; i < n; i++) {
                            soma += temps[i];
                            soma2 += result[i];
                        }
                        double mediaTemps = soma / n;
                        double mediaTempsConv = soma2 / n;
                        System.out.println("             " + df.format(mediaTemps)
                                + "                                    " + df.format(mediaTempsConv));
                        System.out.println("------------------------------------------------------------------------");

                    } else {
                        System.out.println("Invalid option typed. Please insert a valid option from the menu!");
                    }
                } else {
                    System.out.println("Existing the convertor ");
                }
            } catch (InputMismatchException VariableDeclatorID) {
                System.out.println("Please insert a valid option from the menu!");
                sc.next();
            }
        } while (n > 0 && op > 0);

    }

    private static double getDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}