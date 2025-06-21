public class ForecastTest {
    public static void main(String[] args) {
        double base = 1000;
        double rate = 0.05;
        int years = 5;

        System.out.println(" Forecasting with Recursion:");
        System.out.printf("Future Value: ₹%.2f\n", FinanceUtil.forecastRecursive(base, rate, years));

        System.out.println("\n Forecasting with Iteration:");
        System.out.printf("Future Value: ₹%.2f\n", FinanceUtil.forecastIterative(base, rate, years));
    }
}
