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
        int sum = 0;
        int result;
        for (long summary : sales) {
            sum += summary;
        }
        int x = sales.length;
        result = sum / x;
        return result;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; //запоминает
        int month = 0; // хранит номер рассматриваемого месяца из массива
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minMedSales(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary = summary + sale;
        }
        int x = sales.length;
        long medSales = summary / x;
        int number = 0;
        for (long sale : sales) {
            if (sale < medSales) {
                number++;
            }
        }
        return number;
    }

    public int maxMedSales(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary += sale;
        }
        int x = sales.length;
        long medSales = summary / x;
        int number = 0;
        for (long sale : sales) {
            if (sale > medSales) {
                number++;
            }
        }
        return number;
    }
}
