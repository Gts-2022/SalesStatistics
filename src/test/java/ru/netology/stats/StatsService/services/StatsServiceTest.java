package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindAmountAllSales(){
        StatsService service = new StatsService();
        long []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageAmountAllSales(){
        StatsService service = new StatsService();
        long []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSalesMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMonthMaxSales(){
        StatsService service = new StatsService();
        long []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMonthMinSales(){
        StatsService service = new StatsService();
        long []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindQuantityBelowAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.quantityBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindQuantityAboveAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.quantityAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}


