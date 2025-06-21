public class FinanceUtil {

    public static double forecastRecursive(double value, double rate, int years) {
        if (years == 0) return value;
        return (1 + rate) * forecastRecursive(value, rate, years - 1);
    }

    public static double forecastIterative(double value, double rate, int years) {
        for (int i = 0; i < years; i++) {
            value *= (1 + rate);
        }
        return value;
    }
}
