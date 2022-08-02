package ru.netology.stats.stats.StatsService;

public class StatsService {
    public int amountSales(long[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public long averageValueOfTheSum(long[] sales) {
        int sumSales = amountSales(sales);
        long average = sumSales / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsMinSales(long[] sales) {
        long average = averageValueOfTheSum(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int monthsMaxSales(long[] sales) {
        long average = averageValueOfTheSum(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }
}





