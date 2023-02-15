package ru.netology.stats.StatsService.services;


public class StatsService {


    public long totalSales(long[] sales) {


        long allSales = 0;
        for (long i = 0; i < sales.length; i++) {
            allSales = allSales + sales[(int) i];
        }


        return allSales;
    }

    public long averageSalesMonth(long[] sales) {

        long allSales = totalSales(sales);
        long averageSales = allSales / sales.length;
        return averageSales;
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

    public long quantityBelowAverage(long[] sales) {

        long belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSalesMonth(sales)) {
                belowAverage += 1;
            }
        }


        return belowAverage;
    }

    public long quantityAboveAverage(long[] sales) {
        long aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageSalesMonth(sales)) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}