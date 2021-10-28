public class CelsiusToKelvin implements Converter{
    @Override
    public double convert(double x) {
        return x + 273;
    }
}
