
public class ToCelsius {

    public double transform(int op, double temps) {
        for (int i = 0; i < temps; i++) {
            if (op == 2) {
                return (temps - 32) / 1.8;
            } else if (op == 3) {
                return temps - 273.15;
            } else {
                return temps;
            }
        }
        return temps;

    }
}
