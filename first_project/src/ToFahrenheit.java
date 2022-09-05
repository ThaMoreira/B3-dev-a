public class ToFahrenheit {

    public double transform(int op, double temp) {
        double result = 0;
        switch (op) {
            case 1:
                result = (temp * 9.0 / 5) + 32;
                break;
            case 3:
                result = 1.8 * (temp - 273) + 32;
                break;
            default:
                break;

        }
        return result;

    }

}