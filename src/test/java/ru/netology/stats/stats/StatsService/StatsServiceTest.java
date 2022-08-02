package ru.netology.stats.stats.StatsService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculateTheAmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.amountSales(sales);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAve = 15;
        long actualAve = service.averageValueOfTheSum(sales);
        assertEquals(expectedAve, actualAve);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    void shouldFindBetweenEnds() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void shouldFindMonthWithBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonths = 5;
        long actualMonths = service.monthsMinSales(sales);
        assertEquals(expectedMonths, actualMonths);
    }

    @Test
    void shouldFindMonthWithAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonths = 5;
        long actualMonths = service.monthsMaxSales(sales);
        assertEquals(expectedMonths, actualMonths);
    }
}
