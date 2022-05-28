package ru.netology.stats;

public class StatsService {

    public int allSalesSum(long[] sales) {
        int sum = 0;
        for (long salesAmount : sales) {
            sum += salesAmount;
        }
        return sum;
    }

    public int medSales(long[] sales) {
        long sum = allSalesSum(sales);
        int result;
        int x = sales.length;
        result = (int) (sum / x);
        return result;
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


    public int minMedSales(long[] sales) {
        int average = medSales(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }

    public int maxMedSales(long[] sales) {
        int average = medSales(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }
}
