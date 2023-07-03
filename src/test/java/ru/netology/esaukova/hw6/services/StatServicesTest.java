package ru.netology.esaukova.hw6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServicesTest {

    @Test
    public void sumOfAllSalesTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expected = 180;
        long actual = service.sumOfAllSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageSumOfSalesInMonthTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        double expected = 15;
        double actual = service.averageSumOfSalesInMonth(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithMaxSalesTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 8;
        int actual = service.monthWithMaxSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithMinSalesTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 9;
        int actual = service.monthWithMinSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithSalesAboveAverageTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 7;
        int actual = service.monthWithSalesAboveAverage(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthWithSalesBelowAverageTest() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 7;
        int actual = service.monthWithSalesBelowAverage(arr);
        Assertions.assertEquals(expected, actual);

    }

}
