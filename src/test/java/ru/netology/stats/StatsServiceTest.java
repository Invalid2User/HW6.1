package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldAllSalesSum() {
        StatsService service1 = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = service1.allSalesSum(sales);
        long expected = 10 + 20 + 30 + 40 + 50 + 60;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMedSales() {
        StatsService service1 = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = service1.medSales(sales);
        long expected = 35;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service1 = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = service1.minSales(sales);
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMasSales() {
        StatsService serv1 = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = serv1.maxSales(sales);
        long expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMedSales() {
        StatsService serv = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = serv.minMedSales(sales);
        long expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMedSales() {
        StatsService serv = new StatsService();
        long[] sales = {10, 20, 30, 40, 50, 60};
        long actual = serv.maxMedSales(sales);
        long expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}

