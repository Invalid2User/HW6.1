package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service1 = new StatsService();
        long result1 = service1.allSalesSum(sales);
        System.out.println("Сумма продаж за все месяцы: " + result1);

        StatsService service2 = new StatsService();
        long result2 = service2.minSales(sales);
        System.out.println("Месяц с минимальными продажами:" + result2 + "-ый");

        StatsService service3 = new StatsService();
        long result3 = service3.medSales(sales);
        System.out.println("Среднее количество продаж в месяц:" + result3);

        StatsService service4 = new StatsService();
        int result4 = service4.maxSales(sales);
        System.out.println("Месяц с максимальным количеством продаж:" + result4);

        StatsService service5 = new StatsService();
        int result5 = service5.minMedSales(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + result5);

        StatsService service6 = new StatsService();
        int result6 = service6.maxMedSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + result6);
    }
}