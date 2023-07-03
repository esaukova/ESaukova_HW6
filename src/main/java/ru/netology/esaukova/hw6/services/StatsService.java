package ru.netology.esaukova.hw6.services;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long value : sales) {
            sum += value; // сумма всех продаж;
        }
        return sum;
    }

    public double averageSumOfSalesInMonth(long[] sales) {
        long sum = sumOfAllSales(sales);
        return (double) sum / sales.length; //средняя сумма продаж в месяц;
    }

    public int monthWithMaxSales (long[] sales) {

        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthWithMinSales (long[] sales) {

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int monthWithSalesAboveAverage (long[] sales) {
        double averageSum = averageSumOfSalesInMonth(sales);
        int countMonthAboveAverage = 0;
        for (long sale : sales) {
            if (sale >= averageSum) {
                countMonthAboveAverage++; // количество месяцев, в которых продажи были выше среднего;

            }
        }
        return countMonthAboveAverage;

    }

    public int monthWithSalesBelowAverage (long[] sales) {
        double averageSum = averageSumOfSalesInMonth(sales);
        int countMonthBelowAverage = 0;
        for (long sale : sales) {
            if (sale <= averageSum) {
                countMonthBelowAverage++; // количество месяцев, в которых продажи были ниже среднего;
            }
        }
        return countMonthBelowAverage;

    }
}
