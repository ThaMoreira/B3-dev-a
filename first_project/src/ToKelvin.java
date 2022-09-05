public class ToKelvin {
    
    public double transform(int op, double temp) {
        double result = 0;
        switch (op) {
            case 1:
                result = temp + 273.15;
                break;
            case 2:
                result = ((temp - 32)/1.8) + 273.15;
                break;
            default:
                break;

        }
        return result;

    }

}
