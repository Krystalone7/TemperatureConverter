public class CelsiusToFahrenheit implements Converter{
    @Override
    public double convert(double x) {
        return x * 1.8 + 32;
    }
}
