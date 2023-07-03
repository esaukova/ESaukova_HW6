import ru.netology.esaukova.hw6.services.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long actual = service.sumOfAllSales(arr);
        System.out.println(actual + " Sum");

        double averageSum = service.averageSumOfSalesInMonth(arr);
        System.out.println(averageSum + " Average");

        int minMonth = service.monthWithMinSales(arr);
        System.out.println(minMonth + " Month with min Sale");

        int maxMonth = service.monthWithMaxSales(arr);
        System.out.println(maxMonth + " Month with max Sale");

        long aboveAverage = service.monthWithSalesAboveAverage(arr);
        System.out.println(aboveAverage + " Months with above average");

        long belowAverage = service.monthWithSalesBelowAverage(arr);
        System.out.println(belowAverage + " Months with below average");

    }
}
